package mc.sn.practice;

public class Circle extends Shape {
//	public Circle() {
//		super("info");
//		// TODO Auto-generated constructor stub
//	}기본 생성자가 없을 때.
	public Circle() {
		super();
	}
	//Shape에 바디가 없어서 abstract를 하거나 작성을 해야 한다.
	//작성을 하게 될 때 super.draw();가 사라진다.
	//Shape가 추상클래스라서 바꿔야만 사용할 수 있다.
	//빈 Shape를 만들어서 작업하겠다.
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("circle");
	}
	
}
