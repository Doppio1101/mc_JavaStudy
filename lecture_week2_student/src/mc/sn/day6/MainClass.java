package mc.sn.day6;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// --> �������ε�,�ƹ� �ڵ尡 �������� �����Ƿ� 
		// ����� �ƹ��͵� ������ �ʴ´�.
		MainClass mc = new MainClass();
		//mc.testPoly();
		mc.testOperator();
	}
	
	public void testPoly() {
		//System.out.println("test �޼ҵ��Դϴ�.");
		//Shape Ŭ������ �ν��Ͻ� ����.
		Shape shape = new Shape();
		//Circle Ŭ������ �ν��Ͻ��� �����ؼ� ShapeŸ�Կ� �Ҵ��ϼ���.
		Shape circle = new Circle();
		//���� Ÿ���� ���� Ÿ�Կ� �Ҵ� �����ϴ�. ������
		Shape[] shapes = {circle, new Rectangle(), new Triangle()};
		for (Shape s : shapes) {
			s.draw();
		}//������ Shape�� ���� �ִµ� �ȿ� �ִ� �ٸ� ����� �����ֱ⵵ �Ѵ�.
		// ��� ���п� ����
		//shape.draw();
		//circle.draw();
		//Shape line = new Line();
		//������ Ÿ���� ������ Ʋ���� �Ҵ� �Ұ�. ���� �ٸ�
		
	}//������ �׽�Ʈ

	public void testOperator(){
		//1 �����ϴ� ������.
		int x = 10;
		int y = 10;
		System.out.println(x++);//�۾��ϰ� ���� ����
		//����ϰ� ���� x�� ������Ŵ.
		System.out.println(++y);//�۾��ϱ� ���� ����
		//����ϱ� ���� ������Ų �� �����.
		System.out.println("x="+x);
		System.out.println("y="+y);
		
	}
}