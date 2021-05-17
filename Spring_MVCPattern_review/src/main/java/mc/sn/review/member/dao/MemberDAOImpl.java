package mc.sn.review.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mc.sn.review.member.vo.MemberVO;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	private SqlSession sqlSession; //�� sqlSession�� action-mybatis���� id="sqlSession"�� ���缭 �����.
// �� ���� ���̹�Ƽ���� ���� �� �ϰڴ�. ���� ���̹�Ƽ���� �����ϰڴ�.
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
		  //�α��ΰ� ������ ���̵� �ߺ�Ȯ�ε� �̷������� �ϸ� �� �� ����.
		  //id�� �Է¹޾Ƽ� DB�� �����ϸ� ��ȯ���� 1�� �´ϱ� 1�̸� �̹� �����ϴ� ���̵��� �˸��� �ָ� �� �� ����.
	}

}
