package com.miage.altea.tp.trainer_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miage.altea.tp.trainer_api.bo.Trainer;
import com.miage.altea.tp.trainer_api.service.TrainerService;

@RestController
@RequestMapping(value = "/trainers")
public class TrainerController {

	@Autowired
	private final TrainerService trainerService;

	TrainerController(TrainerService trainerService){
		this.trainerService = trainerService;
	}

	@GetMapping("/")
	public Iterable<Trainer> getAllTrainers(){
		return trainerService.getAllTrainers();
	}


	@GetMapping("/{name}")
	public Trainer getTrainer(@PathVariable(value="name") String name){
		return trainerService.getTrainer(name);
	}


}
