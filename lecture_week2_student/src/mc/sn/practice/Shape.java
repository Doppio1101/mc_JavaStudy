package mc.sn.practice;

public abstract class Shape {
	private String info;
//	public Shape() {
//		
//	}//�⺻ �����ڸ� ��������� ���� Circle���� ������ ���� �� �ִ�.
	//������ �̷��� �Ǹ� info�� �ǵ帱 ����� �������� �Ⱦ��� Circle���� ���� �־��ؤ�.
	//�켱�� �̷��� �⺻ �����ڸ� ����鼭 ����.
	public Shape(String info) {
		this.info = info;
	}//�̰� ���� �� �ڵ����� �����ϴµ� ����
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	
	//Circle������ ��������� �Ҵ��ؾ� �Ѵ�. 
	public abstract void draw();
	//�ٵ� ���� �� abstract �߻� �ϳ��� ����.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		// �ش�Ǿ��ִ� �ν��Ͻ��� �ö��ִ� �ּҸ� �����.
		return this.info;
	}
}//
