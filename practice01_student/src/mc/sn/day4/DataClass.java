package mc.sn.day4;

public class DataClass {
	//기본 생성자
//	public DataClass() {
//		//아무것도 없는 상태가 기본 생성자
//	}//다른 생성자가 있으면 제공하지 않는다.
	//생성자.
	public DataClass(String sex) {
		this.sex = sex;
		//this라는 키워드를 붙여서 필드와 매개변수를 구분
	}
//	private int a;

	private String name; //필드
	private String sex;
	//생성자를 통해서만 설정할 수 있다.
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	private void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex() {
		return this.sex;
	}
//	public int getA() {
//		return a;
//	}
//	public void setA(int a) {
//		this.a = a;
//	}
}
