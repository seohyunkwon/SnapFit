package com.ssafy.snapfit.service;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
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
<<<<<<< HEAD
	
	// 상위 3개 관심 운동이 같은 회원 찾기
	List<Member> findRecommendMember(long memberNo);
=======
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
}
