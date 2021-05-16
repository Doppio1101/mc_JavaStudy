package mc.sn.homework.member.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mc.sn.homework.member.vo.MemberVO;
import mc.sn.homework.member.service.MemberService;

@RestController
@RequestMapping("/test/*")
public class LoginController {
	static Logger logger = LoggerFactory.getLogger(LoginController.class);
	@Autowired
	private MemberService memberService;
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<List<MemberVO>> listArticles() {
		logger.info("listArticles 메서드 호출");
		List<MemberVO> list = new ArrayList<MemberVO>();
		for (int i = 0; i < 10; i++) {
			MemberVO vo = new MemberVO();
			vo.setId("userId"+i);
			vo.setPwd("usetPw"+i);
			vo.setName("userName"+i);
			list.add(vo);
		}
		
		return new ResponseEntity(list,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{articleNO}", method = RequestMethod.GET)
	public ResponseEntity<MemberVO> findArticle (@PathVariable("articleNO") Integer articleNO) {
		logger.info("findArticle 메서드 호출");
		MemberVO vo = new MemberVO();
		vo.setId("userId");
		vo.setPwd("usetPw");
		vo.setName("userName");
		
		return new ResponseEntity(vo,HttpStatus.OK);
	}	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<String> addArticle (@RequestBody MemberVO memberVO) throws Exception {
		ResponseEntity<String>  resEntity = null;
		String id=null;
		String pw=null;
		MemberVO member = new MemberVO();
		MemberVO putMember = new MemberVO();
		id = memberVO.getId();
		pw = memberVO.getPwd();
		
		
		member.setId(id);
		member.setPwd(pw);
		putMember = memberService.login(member);
		if(putMember != null) {
			System.out.println("conmem"+member.getName());
			System.out.println("conmem"+member.getId());
			System.out.println("conmem"+member.getPwd());
			
			resEntity =new ResponseEntity(putMember,HttpStatus.OK);
			    
		}else {
			 
			resEntity = new ResponseEntity("Fail",HttpStatus.BAD_REQUEST);

		}
		
	
		System.out.println("con"+putMember.getName());
		System.out.println("con"+putMember.getId());
		System.out.println("con"+putMember.getPwd());
		return resEntity;
	}	
	
	//수정하기
	@RequestMapping(value = "/{articleNO}", method = RequestMethod.PUT)
	public ResponseEntity<String> modArticle (@PathVariable("articleNO") Integer articleNO, @RequestBody MemberVO memberVO) {
		ResponseEntity<String>  resEntity = null;
		try {
			logger.info("modArticle 메서드 호출");
			logger.info(memberVO.toString());
			resEntity =new ResponseEntity("MOD_SUCCEEDED",HttpStatus.OK);
		}catch(Exception e) {
			resEntity = new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		
		return resEntity;
	}
	
	//삭제하기
	@RequestMapping(value = "/{articleNO}", method = RequestMethod.DELETE)
	public ResponseEntity<String> removeArticle (@PathVariable("articleNO") Integer articleNO) {
		ResponseEntity<String>  resEntity = null;
		try {
			logger.info("removeArticle 메서드 호출");
			logger.info(articleNO.toString());
			resEntity =new ResponseEntity("REMOVE_SUCCEEDED",HttpStatus.OK);
		}catch(Exception e) {
			resEntity = new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		
		return resEntity;
	}	

}
