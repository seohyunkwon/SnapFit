package com.ssafy.snapfit.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ssafy.snapfit.model.dao.CommentDao;
import com.ssafy.snapfit.model.dto.Comment;
import com.ssafy.snapfit.model.dto.SearchCondition;

@Service
public class CommentServiceImpl implements CommentService {

	private final CommentDao commentDao;
	
	public CommentServiceImpl(CommentDao commentDao) {
		this.commentDao = commentDao;
	}

	// 1-1. 특정 영상에 대해 좋아요 또는 최신순으로 모든 댓글 조회하기(가져오기)
	@Override
	public List<Comment> findAllComments(long videoNo, SearchCondition sc) {
		
		Map<String, Object> map = new HashMap<>();
		map.put("videoNo", videoNo);
		map.put("sc", sc);
		
		return commentDao.selectAllComments(map);
		
	}
	
}
