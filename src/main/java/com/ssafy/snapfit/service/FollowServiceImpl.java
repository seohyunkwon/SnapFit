package com.ssafy.snapfit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.snapfit.model.dao.FollowDao;
import com.ssafy.snapfit.model.dto.Follow;
import com.ssafy.snapfit.model.dto.Member;

@Service
public class FollowServiceImpl implements FollowService {
	
	private final FollowDao followDao;

	public FollowServiceImpl(FollowDao followDao) {
		this.followDao = followDao;
	}
	
	@Override
	public List<Member> getFollowers(long no) {
		return followDao.selectFollowersByNo(no);
	}
	
	@Override
	public List<Member> getFollowings(long no) {
		return followDao.selectFollowingsByNo(no);
	}

	@Override
	public boolean follow(Follow follow) {
		int result = followDao.insertFollow(follow);
		return result == 1;
	}

	@Override
	public boolean unFollow(Follow follow) {
		int result = followDao.deleteFollow(follow);
		return result == 1;
	}
}
