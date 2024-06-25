package com.ssafy.snapfit.service;

import java.util.List;

import com.ssafy.snapfit.model.dto.Exercise;
import com.ssafy.snapfit.model.dto.SearchCondition;

public interface ExerciseService {
	
	// 운동 영상 리스트 가져왹
	List<Exercise> findExercise(SearchCondition sc);
	
	// 영상 수 많은 순 운동
	List<Exercise> findExerciseOrdered();
}
