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

	// 1. 특정 유저"가" 팔로우하는 모든 사람들을 조회하기(가져오기) 즉, 특정 유저의 팔로잉 리스트 조회하기(가져오기)
	@Override
	public List<Member> findAllFollowingMembers(long memberNo) {
		return followDao.selectAllFollowingMembers(memberNo);
	}

	// 2. 특정 유저"를" 팔로우하는 모든 사람들을 조회하기(가져오기) 즉, 특정 유저의 팔로워 리스트 조회하기(가져오기)
	@Override
	public List<Member> findAllFollowerMembers(long memberNo) {
		return followDao.selectAllFollowerMembers(memberNo);
	}
	
	// 3. 주어진 팔로우 관계가 DB에 존재하는지 판단하기
	@Override
	public boolean checkFollow(Follow follow) {
		
		Follow judge = followDao.checkFollow(follow);
		
		if (judge == null) {
			return false;
		}
		
		return true;
		
	}

	// 4. 팔로우라는 "관계"를 등록하기(삽입하기) 단, 이미 등록된 관계라면 삽입하지 않는다.
	@Override
	public boolean addFollow(Follow follow) {
		
		Follow judge1 = followDao.checkFollow(follow);
		
		// DB에 이미 존재하는 팔로우 관계인지 체크해 보았을 때, 기존에 없는 팔로우 관계이면 등록을 수행하기
		if (judge1 == null) {
			
			int judge2 = followDao.insertFollow(follow);
			
			if (judge2 != 0) {
				return true;
			}
			
			return false;
			
		}
		
		else { // DB에 이미 존재하는 팔로우 관계인지 체크해 보았을 때, 이미 존재하는 팔로우 관계라면 false를 반환하기
			
			return false;
			
		}
		
	}

	// 5. 팔로우라는 "관계"를 삭제하기
	@Override
	public boolean removeFollow(Follow follow) {
		
		int judge = followDao.deleteFollow(follow);
		
		if (judge != 0) {
			return true;
		}
		
		return false;
		
	}
	
}
