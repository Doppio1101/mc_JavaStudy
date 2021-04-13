package mc.sn.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IO는 왜 연결이 많을까?
		//원시데이터를 읽어들여서 원시데이터를 활용할 때 필터 스트림을 연결해서 사용
		//자기책임성의 원칙때문에 한 클래스가 하나의 일만 한다.
		TestConsole tc = new TestConsole();
//		try {
//			tc.test1();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		tc.test2();
	}
	
	public void test1() throws IOException {
		//키보드로부터 입력받기 --> chain 프로그래밍이다.
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		//필터스트림이기 때문에 직접 데이터 소스에 연결할 수 없음
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();
		br.close();
		isr.close();
		is.close();
		System.out.println(line);
	}
	
	public void test2() {
		//Scanner 클래스 이용 --> 인스턴스 생성
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		scan.close();
		System.out.println(line);
	}

}
