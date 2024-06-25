package com.ssafy.snapfit.service;

import java.util.List;

import com.ssafy.snapfit.model.dto.Follow;
import com.ssafy.snapfit.model.dto.Member;

public interface FollowService {
<<<<<<< HEAD
	
	// 1. 특정 유저"가" 팔로우하는 모든 사람들을 조회하기(가져오기) 즉, 특정 유저의 팔로잉 리스트 조회하기(가져오기)
	List<Member> findAllFollowingMembers(long memberNo);
	
	// 2. 특정 유저"를" 팔로우하는 모든 사람들을 조회하기(가져오기) 즉, 특정 유저의 팔로워 리스트 조회하기(가져오기)
	List<Member> findAllFollowerMembers(long memberNo);
	
	// 3. 주어진 팔로우 관계가 DB에 존재하는지 판단하기
	boolean checkFollow(Follow follow);
	
	// 4. 팔로우라는 "관계"를 등록하기(삽입하기) 단, 이미 등록된 관계라면 삽입하지 않는다.
	boolean addFollow(Follow follow);
	
	// 5. 팔로우라는 "관계"를 삭제하기
	boolean removeFollow(Follow follow);

=======
	List<Member> getFollowers(long no);
	
	List<Member> getFollowings(long no);
	
	boolean follow(Follow follow);
	
	boolean unFollow(Follow follow);
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
}
