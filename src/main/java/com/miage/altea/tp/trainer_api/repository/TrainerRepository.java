package com.miage.altea.tp.trainer_api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.miage.altea.tp.trainer_api.bo.Trainer;

@Repository
public interface TrainerRepository extends CrudRepository<Trainer, String>{

}
