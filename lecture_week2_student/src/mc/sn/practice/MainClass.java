package mc.sn.practice;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// --> �������ε�,�ƹ� �ڵ尡 �������� �����Ƿ� 
		// ����� �ƹ��͵� ������ �ʴ´�.
		MainClass poly = new MainClass();
		poly.testPoly();
		
	}
	
	public void testPoly() {
		//System.out.println("test �޼ҵ��Դϴ�.");
		//Shape Ŭ������ �ν��Ͻ� ����.
//		Shape shape = new Shape();
		//Circle Ŭ������ �ν��Ͻ��� �����ؼ� ShapeŸ�Կ� �Ҵ��ϼ���.
		Shape circle = new Circle();
		//���� Ÿ���� ���� Ÿ�Կ� �Ҵ� �����ϴ�. ������
//		Shape[] shapes = {circle, new Rectangle(), new Triangle()};
//		for (Shape s : shapes) {
		circle.draw();
//		}//������ Shape�� ���� �ִµ� �ȿ� �ִ� �ٸ� ����� �����ֱ⵵ �Ѵ�.
		// ��� ���п� ����
		//shape.draw();
		//circle.draw();
		//Shape line = new Line();
		//������ Ÿ���� ������ Ʋ���� �Ҵ� �Ұ�. ���� �ٸ�
		
	}//������ �׽�Ʈ

}