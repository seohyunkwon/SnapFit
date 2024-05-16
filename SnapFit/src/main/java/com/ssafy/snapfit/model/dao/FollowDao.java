package com.ssafy.snapfit.model.dao;

import java.util.List;

import com.ssafy.snapfit.model.dto.Member;

public interface FollowDao {
	
	// 회원 번호에 따른 팔로워 리스트
	List<Member> selectFollowersByNo(long no);
	
	// 회원 번호에 따른 팔로잉 리스트
	List<Member> selectFollowingsByNo(long no);
}
