package com.ssafy.snapfit.service;

import org.springframework.stereotype.Service;

import com.ssafy.snapfit.model.dao.LikeVideoDao;
import com.ssafy.snapfit.model.dto.LikeVideo;

@Service
public class LikeVideoServiceImpl implements LikeVideoService {

	private final LikeVideoDao likeVideoDao;
	
	public LikeVideoServiceImpl(LikeVideoDao likeVideoDao) {
		this.likeVideoDao = likeVideoDao;
	}

	@Override
	public boolean addLikeVideo(LikeVideo likeVideo) {
		int result = likeVideoDao.insertLikeVideo(likeVideo);
		return result == 1;
	}

	@Override
	public boolean removeLikeVideo(LikeVideo likeVideo) {
		int result = likeVideoDao.deleteLikeVideo(likeVideo);
		return result == 1;
	}

	@Override
	public boolean isLiked(LikeVideo likeVideo) {
		int result = likeVideoDao.countLikeVideo(likeVideo);
		return result > 0;
	}

}
