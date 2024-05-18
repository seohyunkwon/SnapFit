package com.ssafy.snapfit.service;

import java.util.List;

import com.ssafy.snapfit.model.dto.Comment;
import com.ssafy.snapfit.model.dto.SearchCondition;

public interface CommentService {
	
	// 1-1. 특정 영상에 대해 좋아요 또는 최신순으로 모든 댓글 조회하기(가져오기)
	List<Comment> findAllComments(long videoNo, SearchCondition sc);

}
