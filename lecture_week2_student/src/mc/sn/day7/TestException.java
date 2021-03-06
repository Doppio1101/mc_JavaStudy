package mc.sn.day7;

public class TestException {
	//예외처리
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = args.length;
		System.out.println(size);
		for(int i=0; i<size; i++) {
			System.out.println(args[i]);
		}
		
		TestException te = new TestException();
		//te.test2(args);
		//밑의 문장이 오류이므로 try catch로 예외처리.
		try {
			te.test2();
		}catch (Exception ae) {
			System.out.println("에러 발생"+ae.getMessage());
		}
		
	}
	
	public void test1() {
		System.out.println("test1");
		int a = 0;
		int c = 1;
		try {
			c = 10/a;//오류문장임
		}catch(ArithmeticException e) {
			System.out.println("에러 발생" + e.getMessage());
		}
		System.out.println(c);
		// c = 10/a 에서 a가 0이라서 실행 안 되고 에러 메시지 출력 후
		// 다음 실행을 진행함.
	}
	
	public void test2(String[] args) {
		//int size = args.length;
		for(String a : args) {
			System.out.println("test2 "+a);
		}
	}

	public void test2() throws ArrayIndexOutOfBoundsException{ // 위의 것과 오버로드 관계
		int[] abc = new int[3];
		abc[0] = 10;
		abc[1] = 20;
		abc[2] = 30;
		
		int result = abc[3];
	}
}
