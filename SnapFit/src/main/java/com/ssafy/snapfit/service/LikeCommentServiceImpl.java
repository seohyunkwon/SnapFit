package com.ssafy.snapfit.service;

import org.springframework.stereotype.Service;

import com.ssafy.snapfit.model.dao.LikeCommentDao;
import com.ssafy.snapfit.model.dto.LikeComment;

@Service
public class LikeCommentServiceImpl implements LikeCommentService {

	private final LikeCommentDao likeCommentDao;
	
	public LikeCommentServiceImpl(LikeCommentDao likeCommentDao) {
		this.likeCommentDao = likeCommentDao;
	}

	@Override
	public boolean addLikeComment(LikeComment likeComment) {
		int result = likeCommentDao.insertLikeComment(likeComment);
		return result == 1;
	}

	@Override
	public boolean removeLikeComment(LikeComment likeComment) {
		int result = likeCommentDao.deleteLikeComment(likeComment);
		return result == 1;
	}

	@Override
	public boolean isLiked(LikeComment likeComment) {
		int result = likeCommentDao.countLikeComment(likeComment);
		return result > 0;
	}

}
