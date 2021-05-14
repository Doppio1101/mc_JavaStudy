package mc.sn.stshk.test.vo;


import org.springframework.stereotype.Component;

@Component("memberVO")
public class MemberVO {
	private String id;
	private String pw;
	private String name;
	public MemberVO() {
		
	}

	public MemberVO(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		String info = "";
		info += "\n"+this.id+"\n "
			        +this.pw+"\n"
			        +this.name+"\n";
			   
		return info;
	}

}
