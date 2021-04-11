package mc.sn.day4;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTest t = new StringTest();
		t.test1();
		
	}
	public void test1() {
		String name1 = "kim";
		String name2 = "kim";

		String addr = "서울시";
		System.out.println(name1+","+addr);
		String n = new String("kim"); //생성자.
		// 해당하는 클래스에서 꼭 필요로 하는 데이터를 초기화 하는 역할.
		String n2 = new String("kim");
		//참조형 변수는 equals를 이용해서 비교해야 한다.
		//인스턴스의 특정값의 동등비교는 equals라는 메소드를 사용.
		if(n.equals(n2)) {
			System.out.println("==");
		}
		else {
			System.out.println("!=");
		}
		//밑에 있는 n==n2는 참조값을 비교하는 게 아님.
		if(n==n2) {
			System.out.println("==");
		}
		else {
			System.out.println("!=");
		}
		System.out.println(n);
//		if(name1==name2) {
//			System.out.println("==");	
//		}
//		else {
//			System.out.println("!=");
//		}
	}
	public void test2(){
//		DataClass dc1 = new DataClass();
//		DataClass dc2 = new DataClass();
//		dc1.name = "kim";
//		dc1.sex = "male"; //성별은 확정 된 상태에서 나와야 된다.
//		//그래서 생성이 될 때 값이 세팅되서 나와야 한다. 그게 생성자.
//		dc2.name = "lee";
//		dc2.sex = "female";
//		System.out.println(dc1.name+","+dc1.sex);
//		System.out.println(dc2.name+","+dc2.sex);
	}
	public void test3(){
		//보일것과 안 보일것을 구분하는 게 캡슐화
		DataClass dc1 = new DataClass("female");//female, male이 생성자
		DataClass dc2 = new DataClass("male");
		dc1.setName("kim");
		dc2.setName("lee");
		//dc1.setSex("male"); // setSex를 만들어서 수정이 가능
		//setSex를 private로 둬서 생성자로만 설정
		//억세스 마디파이로 접근 제어

		System.out.println(dc1.getName()+","+dc1.getSex());
		System.out.println(dc2.getName()+","+dc2.getSex());
	}
}
