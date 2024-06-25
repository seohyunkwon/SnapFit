package com.ssafy.snapfit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.snapfit.model.dao.ExerciseDao;
import com.ssafy.snapfit.model.dto.Exercise;
import com.ssafy.snapfit.model.dto.SearchCondition;

@Service
public class ExerciseServiceImpl implements ExerciseService {
	
	private final ExerciseDao exerciseDao;

	public ExerciseServiceImpl(ExerciseDao exerciseDao) {
		this.exerciseDao = exerciseDao;
	}

	@Override
	public List<Exercise> findExercise(SearchCondition sc) {
		return exerciseDao.selectExercise(sc);
	}

	@Override
	public List<Exercise> findExerciseOrdered() {
		return exerciseDao.selectExerciseOrdered();
	}

}
