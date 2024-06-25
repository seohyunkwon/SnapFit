package com.ssafy.snapfit.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.snapfit.model.dto.Exercise;
import com.ssafy.snapfit.service.ExerciseService;

@RestController
public class ExerciseController {

	private final ExerciseService exerciseService;
	
	public ExerciseController(ExerciseService exerciseService) {
		this.exerciseService = exerciseService;
	}
	
	@GetMapping("/exercise")
	public ResponseEntity<?> findExercisePopular() {
		List<Exercise> list = exerciseService.findExerciseOrdered();
		
		if(list.size() == 0) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<List<Exercise>>(list, HttpStatus.OK);
		
	}
	
}
