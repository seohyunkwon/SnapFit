package com.ssafy.snapfit.model.dao;

import com.ssafy.snapfit.model.dto.Member;

public interface MemberDao {
	
	// 회원 생성
	int insertMember(Member member);
	
	// 아이디로 멤버 찾기
	Member selectMemberById(String id);
	
	// 회원번호로 멤버 찾기
	Member selectMemberByNo(long no);
	
	// 회원 정보 수정
	int updateMember(Member member);
	
	// 회원 삭제
	int deleteMember(long no);
}
