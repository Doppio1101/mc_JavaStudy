package mc.sn.day2;

public class TestOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int number = 123456;
		int a = 1+1;
		System.out.println(number);
		System.out.println(a);
		
		int splitNumber = number % 10;
		System.out.println(splitNumber);
		
		number = number/10; //int와 int 연산이라 강제변환 없어도 된다
		System.out.println(number);
		splitNumber = number % 10;
		System.out.println(splitNumber);
		
		int num = 532;
		num = num - 32;
		System.out.println(num);
		double pi = 3.14159;
		int p = (int)pi;
		System.out.println(p);
		double pi2 = p;
		System.out.println(pi2);
		
		byte b1 = 1;
		byte b2 = 2;
		int b3 = b1 + b2; // 바이트 연산은 int로 자동 확장
		System.out.println(b3);
		short s1 = 1;
		int s2 = s1 + b1;
		
		System.out.println("1: "+1);
		System.out.println("2: "+1);
		*/
		int sum = 0;
		int number = 1234;
		int splitNumber = 0; 
		splitNumber = number % 10;
		sum = sum + splitNumber;
		System.out.println(splitNumber);
		number = number / 10;
		
		splitNumber = number % 10;
		sum = sum + splitNumber;
		System.out.println(splitNumber);
		number = number / 10;
		
		splitNumber = number % 10;
		sum = sum + splitNumber;
		System.out.println(splitNumber);
		number = number / 10;
		
		splitNumber = number % 10;
		sum = sum + splitNumber;
		System.out.println(splitNumber);
		System.out.println(sum);
		
		//int b = number / 10 % 10;
		//int c = number / 100 % 10;
		//int d = number / 1000;

	}

}
/*
 * 연산자의 의미를 먼저 생각하고 연산자의 용례를 학습하면 됨.
 * 산술연산자는 원래 알고 있던 용법과 동일하고
 * 나머지 연산의 경우느 신경써서 학습하면 됩니다.
 * 주의점은 데이터 타입의 확장을 신경쓰면 됩니다.
 * 
 * 조건연산자는 제어문 학습시 다시 학습하겠습니다.
 * 삼항연산자도 제어문 학습시 다시 하겠습니다.
 * 
 * int number = 1234를 뒤에서 부터 하나씩 분리하여 출력하고
 * 합계를 구한 후 마직막에 합계를 출력하는 코드를 작성하세요.
 */
