package com.devinforest.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.devinforest.vo.LoginMember;
import com.devinforest.vo.Member;

@Mapper
public interface MemberMapper {
	//회원정보 수정
	public int updateMember(Member member);
	//아이디 찾기
	public String selectEmailByMember(Member member);
	//비밀번호 찾기
	public int updateMemberPw(Map<String, Object> map);
	//회원 탈퇴
	public int deleteMember(LoginMember loginMember);
	//회원정보 불러오기
	public Member selectMemberInfo(LoginMember loginMember);
	//이름 중복 확인
	public String selectMemberName(String memberNameCheck);
	//이메일 중복 확인
	public String selectMemberEmail(String memberEmailCheck);
	//로그인
	public LoginMember selectLoginMember(LoginMember loginMember);
	//회원가입
	public int insertMember(Member member);

}
