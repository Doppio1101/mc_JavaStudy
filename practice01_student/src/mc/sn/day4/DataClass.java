package mc.sn.day4;

public class DataClass {
	//�⺻ ������
//	public DataClass() {
//		//�ƹ��͵� ���� ���°� �⺻ ������
//	}//�ٸ� �����ڰ� ������ �������� �ʴ´�.
	//������.
	public DataClass(String sex) {
		this.sex = sex;
		//this��� Ű���带 �ٿ��� �ʵ�� �Ű������� ����
	}
//	private int a;

	private String name; //�ʵ�
	private String sex;
	//�����ڸ� ���ؼ��� ������ �� �ִ�.
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	private void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex() {
		return this.sex;
	}
//	public int getA() {
//		return a;
//	}
//	public void setA(int a) {
//		this.a = a;
//	}
}