package com.ssafy.snapfit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.snapfit.model.dao.LikeDao;
import com.ssafy.snapfit.model.dto.LikeComment;
import com.ssafy.snapfit.model.dto.LikeVideo;

@Service
public class LikeServiceImpl implements LikeService {
	
	private final LikeDao likeDao;
	
	public LikeServiceImpl(LikeDao likeDao) {
		this.likeDao = likeDao;
	}

	// 1-1. 특정 유저가 특정 영상을 좋아요 했는지에 대한 정보가 DB에 존재하는지 판단하기
	@Override
	public boolean checkVideoLike(LikeVideo likeVideo) {
		
		List<LikeVideo> judge = likeDao.selectVideoLike(likeVideo);
		
		if (judge.size() == 0) {
			return false;
		}
		
		return true;
		
	}

	// 1-2. 특정 유저가 특정 영상을 좋아요 했다는 정보를 등록하기(삽입하기) 단, 이미 등록된 관계라면 삽입하지 않는다.
	@Override
	public boolean addVideoLike(LikeVideo likeVideo) {
		
		List<LikeVideo> judge1 = likeDao.selectVideoLike(likeVideo);
		
		// DB에 이미 특정 유저가 특정 영상을 좋아요 했는지 체크해 보았을 때, 기존에 그러한 사실이 없다면 좋아요 등록을 수행하기
		if (judge1.size() == 0) {
			
			int judge2 = likeDao.insertVideoLike(likeVideo);
			
			if (judge2 != 0) {
				return true;
			}
			
			return false;
			
		}
		
		else { // DB에 이미 특정 유저가 특정 영상을 좋아요 했는지 체크해 보았을 때, 이미 등록된 관계라면 false를 반환하기
			
			return false;
			
		}
		
	}

	// 1-3. 특정 유저가 특정 영상을 좋아요 했다는 정보를 삭제하기
	@Override
	public boolean removeVideoLike(LikeVideo likeVideo) {
		
		int judge = likeDao.deleteVideoLike(likeVideo);
		
		if (judge != 0) {
			return true;
		}
		
		return false;
		
	}
	
	// 1-4. 특정 영상에 따른 좋아요 리스트 가져오기
	@Override
	public List<LikeVideo> findVideoLikeByVideoNo(long videoNo) {
		LikeVideo likeVideo = new LikeVideo();
		likeVideo.setVideoNo(videoNo);
		return likeDao.selectVideoLike(likeVideo);
	}

	// 2-1. 특정 유저가 특정 댓글을 좋아요 했는지에 대한 정보가 DB에 존재하는지 판단하기
	@Override
	public boolean checkCommentLike(LikeComment likeComment) {
		
		LikeComment judge = likeDao.checkCommentLike(likeComment);
		
		if (judge == null) {
			return false;
		}
		
		return true;
		
	}

	// 2-2. 특정 유저가 특정 댓글을 좋아요 했다는 정보를 등록하기(삽입하기) 단, 이미 등록된 관계라면 삽입하지 않는다.
	@Override
	public boolean addCommentLike(LikeComment likeComment) {
		
		LikeComment judge1 = likeDao.checkCommentLike(likeComment);
		
		// DB에 이미 특정 유저가 특정 댓글을 좋아요 했는지 체크해 보았을 때, 기존에 그러한 사실이 없다면 좋아요 등록을 수행하기
		if (judge1 == null) {
					
			int judge2 = likeDao.insertCommentLike(likeComment);
					
			if (judge2 != 0) {
				return true;
			}
					
			return false;
					
		}
				
		else { // DB에 이미 특정 유저가 특정 댓글을 좋아요 했는지 체크해 보았을 때, 이미 등록된 관계라면 false를 반환하기
					
			return false;
					
		}
		
	}

	// 2-3. 특정 유저가 특정 댓글을 좋아요 했다는 정보를 삭제하기
	@Override
	public boolean removeCommentLike(LikeComment likeComment) {
		
		int judge = likeDao.deleteCommentLike(likeComment);
		
		if (judge != 0) {
			return true;
		}
		
		return false;
		
	}
	
}
