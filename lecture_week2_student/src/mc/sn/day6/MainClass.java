package mc.sn.day6;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// --> 시작점인데,아무 코드가 존재하지 않으므로 
		// 출력이 아무것도 나오지 않는다.
		MainClass mc = new MainClass();
		//mc.testPoly();
		mc.testOperator();
	}
	
	public void testPoly() {
		//System.out.println("test 메소드입니다.");
		//Shape 클래스의 인스턴스 생성.
		Shape shape = new Shape();
		//Circle 클래스의 인스턴스를 생성해서 Shape타입에 할당하세요.
		Shape circle = new Circle();
		//상위 타입은 하위 타입에 할당 가능하다. 다형성
		Shape[] shapes = {circle, new Rectangle(), new Triangle()};
		for (Shape s : shapes) {
			s.draw();
		}//다형성 Shape로 갖고 있는데 안에 있는 다른 모습을 보여주기도 한다.
		// 상속 덕분에 가능
		//shape.draw();
		//circle.draw();
		//Shape line = new Line();
		//데이터 타입이 완전히 틀려서 할당 불가. 전혀 다름
		
	}//다형성 테스트

	public void testOperator(){
		//1 증가하는 연산자.
		int x = 10;
		int y = 10;
		System.out.println(x++);//작업하고 나서 증가
		//출력하고 나서 x를 증가시킴.
		System.out.println(++y);//작업하기 전에 증가
		//출력하기 전에 증가시킨 후 출력함.
		System.out.println("x="+x);
		System.out.println("y="+y);
		
	}
}
