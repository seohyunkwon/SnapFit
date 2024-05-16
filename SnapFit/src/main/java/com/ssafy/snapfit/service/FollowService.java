package com.ssafy.snapfit.service;

import java.util.List;

import com.ssafy.snapfit.model.dto.Member;

public interface FollowService {
	List<Member> getFollowers(long no);
	
	List<Member> getFollowings(long no);
}
