package mc.sn.practice;

public abstract class Shape {
	private String info;
//	public Shape() {
//		
//	}//기본 생성자를 명시적으로 만들어서 Circle에서 오류를 잡을 수 있다.
	//하지만 이렇게 되면 info를 건드릴 방법이 없어져서 안쓰고 Circle에서 값을 넣어준ㄷ.
	//우선은 이렇게 기본 생성자를 만들면서 수업.
	public Shape(String info) {
		this.info = info;
	}//이게 없을 때 자동으로 제공하는데 만들어서
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	
	//Circle에서는 명시적으로 할당해야 한다. 
	public abstract void draw();
	//바디가 없을 때 abstract 추상 하나만 있음.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		// 해당되어있는 인스턴스가 올라가있는 주소를 출력함.
		return this.info;
	}
}//
