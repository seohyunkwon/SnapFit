package com.ssafy.snapfit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ssafy.snapfit.model.dao.MemberDao;
import com.ssafy.snapfit.model.dto.Member;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private final MemberDao memberDao;
	
	@Autowired
	private final PasswordEncoder passwordEncoder;

	public MemberServiceImpl(MemberDao memberDao, PasswordEncoder passwordEncoder) {
		this.memberDao = memberDao;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public boolean signup(Member member) {
		member.setPassword(passwordEncoder.encode(member.getPassword()));
		int result = memberDao.insertMember(member);
		return result == 1;
	}
	
	

}
