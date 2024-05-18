package com.ssafy.snapfit.service;

import com.ssafy.snapfit.model.dto.Member;
import com.ssafy.snapfit.model.dto.SearchCondition;

public interface MemberService {

	// 회원가입
	boolean signup(Member member);

	// 멤버 찾기
	Member findMember(SearchCondition sc);


	// 회원 정보 수정
	boolean modifyMember(long no, Member member);

	// 회원 탈퇴
	boolean removeMember(long no);
}
