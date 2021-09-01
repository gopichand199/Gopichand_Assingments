package com.casestudy.TrainSearch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.TrainSearch.models.Trains;
import com.casestudy.TrainSearch.repository.TrainRepository;

@Service
public class TrainServiceImpl {

	@Autowired
	private TrainRepository trainRepository;

	public List<Trains> getAllTrains() {
		// System.out.println(trainRepository.findAll());
		return trainRepository.findAll();

	}

	public Trains getTrainByTrainNumber(String trainnumber) {
		return trainRepository.findTrainByTrainNumber(trainnumber);
	}

	public Trains findTrainByTrainName(String trainname) {
		return trainRepository.findTrainByTrainName(trainname);
	}
	public void add(Trains trains) {
		this.trainRepository.save(trains);
	}
	

//	public void add() {
//		System.out.println("TrainDetails");
//		Trains train = new Trains("", "10194", "LTT CST SPL", "Guntur", "Vizag", "All Days", "Sleeper");
//		trainRepository.save(train);
//
//	}

}
