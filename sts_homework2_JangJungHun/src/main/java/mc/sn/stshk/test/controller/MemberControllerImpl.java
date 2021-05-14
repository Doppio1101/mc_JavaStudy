package mc.sn.stshk.test.controller;

import java.util.List;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import mc.sn.stshk.test.service.MemberService;
import mc.sn.stshk.test.vo.MemberVO;



@RestController
@RequestMapping("/test")
public class MemberControllerImpl {
	static Logger logger = LoggerFactory.getLogger(MemberControllerImpl.class);
	
	@Autowired
	private MemberService memberService;
	@Autowired
	private MemberVO memberVO ;
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<String> login (@RequestBody MemberVO member) throws Exception {
		
		memberVO = memberService.login(member);
		ResponseEntity<String>  resEntity = null;
		try {
			if(memberVO != null) {
				logger.info("메서드 호출");
				logger.info(memberVO.toString());
				resEntity =new ResponseEntity("Data:"+memberVO.getId()+"님 login ok\n Status: Success",HttpStatus.OK);
			}else {
				resEntity =new ResponseEntity("아이디 혹은 비밀번호를 확인해주세요.\n Status: Fail",HttpStatus.OK);
			}
			
		}catch(Exception e) {
			resEntity = new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
		}	
		
		return resEntity;
	}	
	
	
	
	

}
