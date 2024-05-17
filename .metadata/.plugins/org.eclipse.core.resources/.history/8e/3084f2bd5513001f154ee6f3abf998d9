package com.ssafy.snapfit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.snapfit.model.dao.FollowDao;
import com.ssafy.snapfit.model.dto.Member;

@Service
public class FollowServiceImpl {
	
	private final FollowDao followDao;

	public FollowServiceImpl(FollowDao followDao) {
		this.followDao = followDao;
	}
	
	public List<Member> getFollowers(long no) {
		return followDao.selectFollowersByNo(no);
	}
	
	public List<Member> getFollowings(long no) {
		return followDao.selectFollowingsByNo(no);
	}
}
