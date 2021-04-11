package mc.sn.day6;

public class CodeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CodeExample ce = new CodeExample();
		ce.test2();
	}
	
	public void test1(int a, int b) {
		//교환로직 연습
		//두 개의 정수형 변수를 입력받게 
		//매개변수 리스트를 변경하시오.
		//a에서 b까지 출력한다. (a,b 포함)
		
		if(a>b) {
			int temp = a;
			a = b;
			b = temp;
		}
		//d
		for(int i = a; i<b+1; i++) {
			System.out.println(i);
		}
		System.out.println("End");
			
	}
	
	public void test2() {
		//A부터 Z까지 수를 배열안에 할당하고 
		//인데스가 3의 배수일 때,
		//2의 배수인 인덱스 값과 교환한다(섞고)
		//출력하는 코드 작성
		//this.printChar
		//char temp = ' ';
		char[] alphabet = new char[26];
		for(int i = 0; i<26; i++) {
			alphabet[i] = (char)(65+i);
		}
		this.printChar(alphabet);
		System.out.println("");
		
		int[] idx1 = {2,4,6,8,10,12,14,16};
		int[] idx2 = {3,6,9,12,15,18,21,24};
		
		for(int i = 0; i<8; i++) {
				char temp = alphabet[idx1[i]];
				alphabet[idx1[i]] = alphabet[idx2[i]];
				alphabet[idx2[i]] = temp;
				
		}
		this.printChar(alphabet);

	}

	private void printChar(char[] alphabet) {
		// TODO Auto-generated method stub
		for(int i=0; i<26; i++) {
			System.out.print(alphabet[i]);
		}
	}


}
