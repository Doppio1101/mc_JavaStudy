package com.spring.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.spring.member.vo.MemberVO;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List selectAllMemberList() throws DataAccessException {
		List<MemberVO> membersList = null;
		membersList = sqlSession.selectList("mapper.member.selectAllMemberList");
		return membersList;
	}

	@Override
	public int insertMember(MemberVO memberVO) throws DataAccessException {
		int result = sqlSession.insert("mapper.member.insertMember", memberVO);
		System.out.println("DAO out"+result);
		return result;
	}

	@Override
	public int deleteMember(String id) throws DataAccessException {
		int result = sqlSession.delete("mapper.member.deleteMember", id);
		return result;
	}
	@Override
	public MemberVO selectById(String id) throws DataAccessException{
		  MemberVO vo = (MemberVO) sqlSession.selectOne("mapper.member.selectById",id);
		return vo;
	}
	@Override
	public int updateMember(MemberVO memberVO) throws DataAccessException {
		System.out.println("DAO in");
		int result = sqlSession.update("mapper.member.updateMember", memberVO);
		
		if(result != 1) {
			System.out.println("out error");
		}else {
			System.out.println(result);
		}
		System.out.println("DAO out"+result);
		return result;
	}
}
