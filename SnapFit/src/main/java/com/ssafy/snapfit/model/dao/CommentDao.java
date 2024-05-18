package com.ssafy.snapfit.model.dao;

import java.util.List;
import java.util.Map;

import com.ssafy.snapfit.model.dto.Comment;

public interface CommentDao {

	// 1-1. 특정 영상에 대해 좋아요 또는 최신순으로 모든 댓글 조회하기(가져오기)
	List<Comment> selectAllComments(Map map);
	
}
