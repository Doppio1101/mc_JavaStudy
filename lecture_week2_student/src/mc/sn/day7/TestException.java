package mc.sn.day7;

public class TestException {
	//����ó��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = args.length;
		System.out.println(size);
		for(int i=0; i<size; i++) {
			System.out.println(args[i]);
		}
		
		TestException te = new TestException();
		//te.test2(args);
		//���� ������ �����̹Ƿ� try catch�� ����ó��.
		try {
			te.test2();
		}catch (Exception ae) {
			System.out.println("���� �߻�"+ae.getMessage());
		}
		
	}
	
	public void test1() {
		System.out.println("test1");
		int a = 0;
		int c = 1;
		try {
			c = 10/a;//����������
		}catch(ArithmeticException e) {
			System.out.println("���� �߻�" + e.getMessage());
		}
		System.out.println(c);
		// c = 10/a ���� a�� 0�̶� ���� �� �ǰ� ���� �޽��� ��� ��
		// ���� ������ ������.
	}
	
	public void test2(String[] args) {
		//int size = args.length;
		for(String a : args) {
			System.out.println("test2 "+a);
		}
	}

	public void test2() throws ArrayIndexOutOfBoundsException{ // ���� �Ͱ� �����ε� ����
		int[] abc = new int[3];
		abc[0] = 10;
		abc[1] = 20;
		abc[2] = 30;
		
		int result = abc[3];
	}
}
