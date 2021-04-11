package mc.sn.day5;

public class MainClass {
	private String name;//인스턴스의 변수 => 인스턴스가 생기기 전이라 static에서 사용 불가
	private static String firstName;//클래스 변수
	public static void main(String[] args) {//클래스 메소드
		// TODO Auto-generated method stub
		MainClass mc = new MainClass();
		MainClass.firstName = "kim";
		//코드의 일관성때문에 붙인다.
		mc.name = "hero";//인스턴스 변수를 호출하는 것이 불가
		System.out.println(mc.name);
		System.out.println(firstName);
		//this.firstName = "";
		//this가 인스턴스라서 사용 못함.
	}
	public void test1() {//인스턴스 메소드
		MainClass.firstName = "lee";
		this.name = "chulsoo";
		System.out.println(this.firstName);//웬만하면 클래스를 통해서 접근해라.
		
	}

}
