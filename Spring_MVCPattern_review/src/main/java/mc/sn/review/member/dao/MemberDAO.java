package mc.sn.review.member.dao;

import mc.sn.review.member.vo.MemberVO;

public interface MemberDAO {
//	 public List selectAllMemberList() throws Exception;
//	 public int insertMember(MemberVO memberVO) throws Exception ;
//	 public int deleteMember(String id) throws Exception;
	 public MemberVO loginById(MemberVO memberVO) throws Exception;

}
