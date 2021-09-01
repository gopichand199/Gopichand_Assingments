package com.casestudy.TrainSearch.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.TrainSearch.models.Trains;
import com.casestudy.TrainSearch.service.TrainServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/trains")
public class TrainsController {

	@Autowired
	private TrainServiceImpl trainService;

	@GetMapping(value = "/getalltrains")
	public ResponseEntity<?> findAllTrains() {
		try {
			List<Trains> train = trainService.getAllTrains();
			return new ResponseEntity<>(train, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping(value = "/gettrainbytrainnumber/{trainnumber}")
	public ResponseEntity<?> getTrainByTrainNumber(@PathVariable("trainnumber") String trainnumber) {
		try {
			Trains train = trainService.getTrainByTrainNumber(trainnumber);
			return new ResponseEntity<>(train, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping(value = "/gettrainbytrainname/{trainname}")
	public ResponseEntity<?> getTrainByTrainName(@PathVariable("trainname") String trainname) {
		try {
			Trains train = trainService.findTrainByTrainName(trainname);
			return new ResponseEntity<>(train, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}

	}
	@PostMapping(value = "/add")
	public void addnew(@RequestBody Trains trains, BindingResult result) {
		trainService.add(trains);
	}

//	@GetMapping(value = "/add")
//	public void add() {
//		trainService.add();
//	}

}