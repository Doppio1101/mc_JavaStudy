package mc.sn.review.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mc.sn.review.member.vo.MemberVO;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	private SqlSession sqlSession; //이 sqlSession과 action-mybatis에서 id="sqlSession"과 맞춰서 사용함.
// 안 쓰면 마이바티스랑 연결 안 하겠다. 쓰면 마이바티스에 연결하겠다.
//	@Override
//	public List selectAllMemberList() throws Exception {
//		List<MemberVO> membersList = null;
//		membersList = sqlSession.selectList("mapper.member.selectAllMemberList");
//		return membersList;
//	}
//
//	@Override
//	public int insertMember(MemberVO memberVO) throws Exception {
//		int result = sqlSession.insert("mapper.member.insertMember", memberVO);
//		return result;
//	}
//
//	@Override
//	public int deleteMember(String id) throws Exception {
//		int result = sqlSession.delete("mapper.member.deleteMember", id);
//		return result;
//	}
	
	@Override
	public MemberVO loginById(MemberVO memberVO) throws Exception{
		  MemberVO vo = sqlSession.selectOne("mapper.member.loginById",memberVO);
		  System.out.println("dao in");
		  return vo;
		  //로그인과 별개로 아이디 중복확인도 이런식으로 하면 될 거 같다.
		  //id를 입력받아서 DB에 존재하면 반환값이 1일 태니깐 1이면 이미 존재하는 아이디라고 알림을 주면 될 것 같다.
	}

}
