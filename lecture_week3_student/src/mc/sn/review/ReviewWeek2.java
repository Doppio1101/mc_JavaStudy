package mc.sn.review;

public class ReviewWeek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReviewWeek2 test = new ReviewWeek2();
		//아래의 test1()호출에 대해서 직접 예외 처리하는 코드를 작성.
		try {
			test.test1();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		test.test2();
		test.test4();
	}
	public void test4() {
		//인덱스 없이 배열의 내용을 출력하는 코드
		int[] numbers = {1,2,3};
		for(int a : numbers) {
			System.out.println(a);
		}
	}
	//오버로딩
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
	//두 메소드를 전부 다르 게 하고 싶으면 파라미터데이터를 다르게 해준다.
	//다른 타입, 개수 ... => 오버로딩
	//오버로딩은 메소드 이름과 파라미터만 보면 된다.
	//
	
	public void test2() {
		int x =10;
		System.out.println(x++);
		//10
		System.out.println(x);
		//11
		
	}
	
	
	public void test1() throws ArrayIndexOutOfBoundsException {
		//크기가 0인 정수형 배열을 선언하고 초기화하시오.
		int[] a = new int[0];
		//첫번째 값을 출력하는 코드를 작성하시오.
		System.out.println(a[0]);
		//exception을 나중에 처리하도록 메소드를 수정.
		
		
	}

}
