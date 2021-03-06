package com.miage.altea.tp.trainer_api.bo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TrainerTest {

	@Test
	void trainer_shouldBeAnEntity(){
		assertNotNull(Trainer.class.getAnnotation(Entity.class));
	}

	@Test
	void trainerName_shouldBeAnId() throws NoSuchFieldException {
		assertNotNull(Trainer.class.getDeclaredField("name").getAnnotation(Id.class));
	}

	@Test
	void trainerTeam_shouldBeAOneToManyRelationship() throws NoSuchFieldException {
		var oneToMany = Trainer.class.getDeclaredField("team").getAnnotation(OneToMany.class);

		assertNotNull(oneToMany);

		assertArrayEquals(new CascadeType[]{CascadeType.ALL}, oneToMany.cascade());
		assertEquals(FetchType.EAGER, oneToMany.fetch());
	}

}
