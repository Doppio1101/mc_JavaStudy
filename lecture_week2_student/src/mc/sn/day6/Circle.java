package mc.sn.day6;

public class Circle extends Shape {
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		//super.draw();
		//이렇게 되면 자신의 방식대로 동작하는 게 아니라
		// super => 상속 받은 내용 그대로 사용하겠다.
		// 이렇게 쓸거면 오버라이드 없이 클래스만 만들어도 된다.
		System.out.println("circle");
		// 이렇게 바꿈으로서 가이드 효과를 가질 수 있다.
		
	}
	//강제성을 부여하는 게 추상클래스: 오버라이드을 안 하면 에러가 발생.
	
}
