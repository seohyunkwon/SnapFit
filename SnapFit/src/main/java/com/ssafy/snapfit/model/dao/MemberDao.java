package com.ssafy.snapfit.model.dao;

import java.util.List;

import com.ssafy.snapfit.model.dto.Member;
import com.ssafy.snapfit.model.dto.SearchCondition;

public interface MemberDao {
	
	// 회원 생성
	int insertMember(Member member);
	
	// 멤버 찾기
	Member selectMember(SearchCondition sc);
	
	// 회원 정보 수정
	int updateMember(Member member);
	
	// 회원 삭제
	int deleteMember(long no);
	
	// 상위 3개 관심 운동이 같은 회원 찾기
	List<Member> selectMemberByExercise(long memberNo);
}
