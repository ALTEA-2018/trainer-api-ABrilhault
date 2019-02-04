package com.miage.altea.tp.trainer_api.service;

import org.springframework.stereotype.Service;

import com.miage.altea.tp.trainer_api.bo.Trainer;

@Service
public interface TrainerService {

	Iterable<Trainer> getAllTrainers();
	Trainer getTrainer(String name);
	Trainer createTrainer(Trainer trainer);

}
