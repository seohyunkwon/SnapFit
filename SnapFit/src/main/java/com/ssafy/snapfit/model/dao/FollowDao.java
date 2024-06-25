package com.ssafy.snapfit.model.dao;

import java.util.List;

import com.ssafy.snapfit.model.dto.Follow;
import com.ssafy.snapfit.model.dto.Member;

public interface FollowDao {
	
	// 1. 특정 유저"가" 팔로우하는 모든 사람들을 조회하기(가져오기) 즉, 특정 유저의 팔로잉 리스트 조회하기(가져오기)
	List<Member> selectAllFollowingMembers(long memberNo);
	
	// 2. 특정 유저"를" 팔로우하는 모든 사람들을 조회하기(가져오기) 즉, 특정 유저의 팔로워 리스트 조회하기(가져오기)
	List<Member> selectAllFollowerMembers(long memberNo);
	
	// 3. 주어진 팔로우 관계가 DB에 존재하는지 판단하기
	// 입력된 팔로우 관계가 Follow table에 존재하면 해당 팔로우를 반환하고, 존재하지 않으면 null을 반환한다.
	Follow checkFollow(Follow follow);
	
	// 4. 팔로우라는 "관계"를 등록하기(삽입하기)
	int insertFollow(Follow follow);
	
	// 5. 팔로우라는 "관계"를 삭제하기
	int deleteFollow(Follow follow);
	
}
