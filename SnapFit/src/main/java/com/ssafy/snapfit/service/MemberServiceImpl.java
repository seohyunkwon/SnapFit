package com.ssafy.snapfit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ssafy.snapfit.model.dao.MemberDao;
import com.ssafy.snapfit.model.dto.Member;
import com.ssafy.snapfit.model.dto.SearchCondition;

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
//		member.setPassword(passwordEncoder.encode(member.getPassword()));
		int result = memberDao.insertMember(member);
		return result == 1;
	}

	@Override
	public Member findMember(SearchCondition sc) {
		return memberDao.selectMember(sc);
	}

	@Override
	public boolean modifyMember(long no, Member member) {
		member.setNo(no);
		int result = memberDao.updateMember(member);
		return result == 1;
	}

	@Override
	public boolean removeMember(long no) {
		int result = memberDao.deleteMember(no);
		return result == 1;
	}

	@Override
	public List<Member> findRecommendMember(long memberNo) {
		return memberDao.selectMemberByExercise(memberNo);
	}
	
	

}
