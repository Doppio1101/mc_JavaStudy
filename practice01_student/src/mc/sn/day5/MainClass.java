package mc.sn.day5;

public class MainClass {
	private String name;//�ν��Ͻ��� ���� => �ν��Ͻ��� ����� ���̶� static���� ��� �Ұ�
	private static String firstName;//Ŭ���� ����
	public static void main(String[] args) {//Ŭ���� �޼ҵ�
		// TODO Auto-generated method stub
		MainClass mc = new MainClass();
		MainClass.firstName = "kim";
		//�ڵ��� �ϰ��������� ���δ�.
		mc.name = "hero";//�ν��Ͻ� ������ ȣ���ϴ� ���� �Ұ�
		System.out.println(mc.name);
		System.out.println(firstName);
		//this.firstName = "";
		//this�� �ν��Ͻ��� ��� ����.
	}
	public void test1() {//�ν��Ͻ� �޼ҵ�
		MainClass.firstName = "lee";
		this.name = "chulsoo";
		System.out.println(this.firstName);//�����ϸ� Ŭ������ ���ؼ� �����ض�.
		
	}

}
