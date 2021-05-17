package mc.sn.review.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mc.sn.review.member.dao.MemberDAO;
import mc.sn.review.member.vo.MemberVO;


@Service("memberService")
//@Transactional(propagation = Propagation.REQUIRED)
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO memberDAO;

//	@Override
//	public List listMembers() throws DataAccessException {
//		List membersList = null;
//		membersList = memberDAO.selectAllMemberList();
//		return membersList;
//	}
//
//	@Override
//	public int addMember(MemberVO member) throws DataAccessException {
//		return memberDAO.insertMember(member);
//	}
//
//	@Override
//	public int removeMember(String id) throws DataAccessException {
//		return memberDAO.deleteMember(id);
//	}
	
	@Override
	public MemberVO login(MemberVO memberVO) throws Exception{
		MemberVO vo = null;
		vo = memberDAO.loginById(memberVO);
		System.out.println("Service in");
		return vo;
	
	}

}
