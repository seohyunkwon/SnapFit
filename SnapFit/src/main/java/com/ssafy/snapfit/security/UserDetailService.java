package com.ssafy.snapfit.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ssafy.snapfit.model.dao.MemberDao;
import com.ssafy.snapfit.model.dto.Member;
import com.ssafy.snapfit.model.dto.SearchCondition;

@Service
public class UserDetailService implements UserDetailsService {

	private final MemberDao memberDao;
	private final PasswordEncoder passwordEncoder;
	
	private final Logger logger = LoggerFactory.getLogger(UserDetailsService.class);
	
	public UserDetailService(MemberDao memberDao, PasswordEncoder passwordEncoder) {
		this.memberDao = memberDao;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Member member = memberDao.selectMember(new SearchCondition("id", username, null, null));
		
		if(member == null) throw new UsernameNotFoundException("Cout not found user");

		logger.info("Success find member ", member);
		
		UserDetails userDetail = User.builder()
				.username(member.getId())
				.password(passwordEncoder.encode(member.getPassword()))
				.roles("USER")
				.build();
		return userDetail;
	}

}
