package com.ssafy.snapfit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.snapfit.model.dao.VideoDao;
import com.ssafy.snapfit.model.dto.SearchCondition;
import com.ssafy.snapfit.model.dto.Video;

@Service
public class VideoServiceImpl implements VideoService {
	
	private final VideoDao videoDao;
	
	public VideoServiceImpl(VideoDao videoDao) {
		this.videoDao = videoDao;
	}

	// 1-1. 전체 영상 조회하기(가져오기)
	@Override
	public List<Video> findAllVideos() {
		return videoDao.selectAllVideos();
	}

	// 1-2. 전체 영상 중에서 검색해서 조회하기(가져오기)
	@Override
	public List<Video> searchVideos(SearchCondition sc) {
		return videoDao.searchVideos(sc);
	}

	// 1-3. 전체 영상 단위에서 하나의 영상 등록하기(삽입하기)
	@Override
	public boolean addVideo(Video video) {
		
		int judge = videoDao.insertVideo(video);
		
		if (judge != 0) {
			return true;
		}
		
		return false;
		
	}

	// 1-4. 전체 영상 단위에서 PK로 특정 영상 삭제하기 (수정 기능은 X)
	@Override
	public boolean removeVideo(long videoNo) {
		
		int judge = videoDao.deleteVideo(videoNo);
		
		if (judge != 0) {
			return true;
		}
		
		return false;
		
	}

	// 2. 특정 유저가 팔로잉하는 사람들의 모든 영상 조회하기(가져오기)
	@Override
	public List<Video> findAllFollowingVideos(long memberNo) {
		return videoDao.selectAllFollowingVideos(memberNo);
	}

}
