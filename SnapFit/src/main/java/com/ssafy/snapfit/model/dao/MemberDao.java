package com.ssafy.snapfit.model.dao;

import com.ssafy.snapfit.model.dto.Member;

public interface MemberDao {
	
	// 회원 생성
	int insertMember(Member member);
}
