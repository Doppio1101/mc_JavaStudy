package mc.sn.review;

public class ReviewWeek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReviewWeek2 test = new ReviewWeek2();
		//�Ʒ��� test1()ȣ�⿡ ���ؼ� ���� ���� ó���ϴ� �ڵ带 �ۼ�.
		try {
			test.test1();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		test.test2();
		test.test4();
	}
	public void test4() {
		//�ε��� ���� �迭�� ������ ����ϴ� �ڵ�
		int[] numbers = {1,2,3};
		for(int a : numbers) {
			System.out.println(a);
		}
	}
	//�����ε�
	public void test3() {
		
	}
	public void test3(int a) {
		
	}
	public void test3(String b) {
		
	}
	public void test3(int a, String b) {
		
	}
	public void test3(String b, int a) {
		
	}
	//�� �޼ҵ带 ���� �ٸ� �� �ϰ� ������ �Ķ���͵����͸� �ٸ��� ���ش�.
	//�ٸ� Ÿ��, ���� ... => �����ε�
	//�����ε��� �޼ҵ� �̸��� �Ķ���͸� ���� �ȴ�.
	//
	
	public void test2() {
		int x =10;
		System.out.println(x++);
		//10
		System.out.println(x);
		//11
		
	}
	
	
	public void test1() throws ArrayIndexOutOfBoundsException {
		//ũ�Ⱑ 0�� ������ �迭�� �����ϰ� �ʱ�ȭ�Ͻÿ�.
		int[] a = new int[0];
		//ù��° ���� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
		System.out.println(a[0]);
		//exception�� ���߿� ó���ϵ��� �޼ҵ带 ����.
		
		
	}

}
