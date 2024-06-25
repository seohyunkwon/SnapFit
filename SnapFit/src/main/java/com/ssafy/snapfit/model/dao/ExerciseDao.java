package com.ssafy.snapfit.model.dao;

import java.util.List;

import com.ssafy.snapfit.model.dto.Exercise;
import com.ssafy.snapfit.model.dto.SearchCondition;

public interface ExerciseDao {
	
	// 1. 운동 영상 리스트 가져오기
	List<Exercise> selectExercise(SearchCondition sc);
	
	// 2. 인기 많은(영상 수가 많은) 운동 정렬
	List<Exercise> selectExerciseOrdered();
}
