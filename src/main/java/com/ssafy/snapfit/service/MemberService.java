package com.ssafy.snapfit.service;

import com.ssafy.snapfit.model.dto.Member;

public interface MemberService {

	// 회원가입
	boolean signup(Member member);

	// 아이디로 멤버 찾기
	Member findMemberById(String id);

	// 회원번호로 멤버 찾기
	Member findMemberByNo(long no);

	// 회원 정보 수정
	boolean modifyMember(long no, Member member);

	// 회원 탈퇴
	boolean removeMember(long no);
}