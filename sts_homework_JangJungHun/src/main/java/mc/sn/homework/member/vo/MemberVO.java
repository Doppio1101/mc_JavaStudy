package mc.sn.homework.member.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("memberVO")
public class MemberVO {
	private String id;
	private String password;
	private String username;
	

	public MemberVO() {
		
	}

	public MemberVO(String id, String password, String username) {
		this.id = id;
		this.password = password;
		this.username = username;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return password;
	}

	public void setPwd(String password) {
		this.password = password;
	}

	public String getName() {
		return username;
	}

	public void setName(String username) {
		this.username = username;
	}

	

}
