package com.ssafy.snapfit.service;

<<<<<<< HEAD
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ssafy.snapfit.model.dao.CommentDao;
import com.ssafy.snapfit.model.dao.ExerciseDao;
import com.ssafy.snapfit.model.dao.LikeDao;
import com.ssafy.snapfit.model.dao.MemberDao;
import com.ssafy.snapfit.model.dao.VideoDao;
import com.ssafy.snapfit.model.dto.Comment;
import com.ssafy.snapfit.model.dto.Exercise;
import com.ssafy.snapfit.model.dto.LikeVideo;
import com.ssafy.snapfit.model.dto.Member;
=======
import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.snapfit.model.dao.VideoDao;
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
import com.ssafy.snapfit.model.dto.SearchCondition;
import com.ssafy.snapfit.model.dto.Video;

@Service
public class VideoServiceImpl implements VideoService {
	
	private final VideoDao videoDao;
<<<<<<< HEAD
	private final MemberDao memberDao;
	private final ExerciseDao exerciseDao;
	private final LikeDao likeDao;
	private final CommentDao commentDao;

	public VideoServiceImpl(VideoDao videoDao, MemberDao memberDao, ExerciseDao exerciseDao, LikeDao likeDao,
			CommentDao commentDao) {
		this.videoDao = videoDao;
		this.memberDao = memberDao;
		this.exerciseDao = exerciseDao;
		this.likeDao = likeDao;
		this.commentDao = commentDao;
=======
	
	public VideoServiceImpl(VideoDao videoDao) {
		this.videoDao = videoDao;
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
	}

	// 1-1. 전체 영상 조회하기(가져오기)
	@Override
	public List<Video> findAllVideos() {
<<<<<<< HEAD
		return setName(videoDao.selectAllVideos());
=======
		return videoDao.selectAllVideos();
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
	}

	// 1-2. 전체 영상 중에서 검색해서 조회하기(가져오기)
	@Override
	public List<Video> searchVideos(SearchCondition sc) {
<<<<<<< HEAD
		return setName(videoDao.searchVideos(sc));
=======
		return videoDao.searchVideos(sc);
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
	}

	// 1-3. 전체 영상 단위에서 하나의 영상 등록하기(삽입하기)
	@Override
<<<<<<< HEAD
	public int addVideo(Video video) {
		
		int PK_or_ZERO = videoDao.insertVideo(video);
		
		return PK_or_ZERO;
=======
	public boolean addVideo(Video video) {
		
		int judge = videoDao.insertVideo(video);
		
		if (judge != 0) {
			return true;
		}
		
		return false;
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
		
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
<<<<<<< HEAD
		return setName(videoDao.selectAllFollowingVideos(memberNo));
	}

	// 3. 특정 유저가 좋아요 누른 영상들을 최신순으로 조회하기(가져오기)
	@Override
	public List<Video> findAllLikeVideos(long memberNo) {
		return setName(videoDao.selectAllLikeVideos(memberNo));
	}

	// 4. 특정 유저가 업로드한 영상들을 최신순으로 조회하기(가져오기)
	@Override
	public List<Video> findAllUploadVideos(long memberNo) {
		return setName(videoDao.selectAllUploadVideos(memberNo));
	}
	
	// 5. 특정 영상의 모든 영상 가져오기
	@Override
	public List<Video> findAllExerciseVideos(long exerciseNo) {
		return setName(videoDao.selectAllExerciseVideo(exerciseNo));
	}
	
	private List<Video> setName(List<Video> list) {
		for(Video video : list) {
			Member member = memberDao.selectMember(new SearchCondition("no", video.getUploaderNo() + "", null, null));
			video.setUploaderName(member == null ? "탈퇴한 회원" : member.getNickname());
			video.setProfileImg(member.getProfileImg());
			
			List<Exercise> exercise = exerciseDao.selectExercise(new SearchCondition("no", video.getExerciseNo()+"", null, null));
			if(exercise.size() != 0) {
				video.setExerciseName(exercise.get(0).getName());
			}
			
		}
		return list;
	}

	

=======
		return videoDao.selectAllFollowingVideos(memberNo);
	}

>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
}
