package mc.sn.practice;

public class Circle extends Shape {
//	public Circle() {
//		super("info");
//		// TODO Auto-generated constructor stub
//	}�⺻ �����ڰ� ���� ��.
	public Circle() {
		super();
	}
	//Shape�� �ٵ� ��� abstract�� �ϰų� �ۼ��� �ؾ� �Ѵ�.
	//�ۼ��� �ϰ� �� �� super.draw();�� �������.
	//Shape�� �߻�Ŭ������ �ٲ�߸� ����� �� �ִ�.
	//�� Shape�� ���� �۾��ϰڴ�.
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("circle");
	}
	
}
