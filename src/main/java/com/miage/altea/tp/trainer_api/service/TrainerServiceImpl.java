package com.miage.altea.tp.trainer_api.service;

import org.springframework.stereotype.Service;

import com.miage.altea.tp.trainer_api.bo.Trainer;
import com.miage.altea.tp.trainer_api.repository.TrainerRepository;

@Service
public class TrainerServiceImpl implements TrainerService {

	private TrainerRepository trainerRepository;

	public TrainerServiceImpl(TrainerRepository trainerRepository) {
		this.trainerRepository = trainerRepository;
	}

	@Override
	public Iterable<Trainer> getAllTrainers() {
		return trainerRepository.findAll();
	}

	@Override
	public Trainer getTrainer(String name) {
		var t = trainerRepository.findById(name);
		return t.isPresent() ? t.get() : null;
	}

	@Override
	public Trainer createTrainer(Trainer trainer) {
		return trainerRepository.save(trainer);
	}

}
