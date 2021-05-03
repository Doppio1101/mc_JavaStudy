package mc.sn.vo;

public class LoginVO {
	private String name;
	private String id;
	private String pwd;
	
	public LoginVO(String name, String id, String pwd) {
		this.name = name;
		this.id = id;
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	
}
