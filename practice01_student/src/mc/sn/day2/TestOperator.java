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
		
		number = number/10; //int�� int �����̶� ������ȯ ��� �ȴ�
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
		int b3 = b1 + b2; // ����Ʈ ������ int�� �ڵ� Ȯ��
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
 * �������� �ǹ̸� ���� �����ϰ� �������� ��ʸ� �н��ϸ� ��.
 * ��������ڴ� ���� �˰� �ִ� ����� �����ϰ�
 * ������ ������ ���� �Ű�Ἥ �н��ϸ� �˴ϴ�.
 * �������� ������ Ÿ���� Ȯ���� �Ű澲�� �˴ϴ�.
 * 
 * ���ǿ����ڴ� ��� �н��� �ٽ� �н��ϰڽ��ϴ�.
 * ���׿����ڵ� ��� �н��� �ٽ� �ϰڽ��ϴ�.
 * 
 * int number = 1234�� �ڿ��� ���� �ϳ��� �и��Ͽ� ����ϰ�
 * �հ踦 ���� �� �������� �հ踦 ����ϴ� �ڵ带 �ۼ��ϼ���.
 */
