package mc.sn.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IO�� �� ������ ������?
		//���õ����͸� �о�鿩�� ���õ����͸� Ȱ���� �� ���� ��Ʈ���� �����ؼ� ���
		//�ڱ�å�Ӽ��� ��Ģ������ �� Ŭ������ �ϳ��� �ϸ� �Ѵ�.
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
		//Ű����κ��� �Է¹ޱ� --> chain ���α׷����̴�.
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		//���ͽ�Ʈ���̱� ������ ���� ������ �ҽ��� ������ �� ����
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();
		br.close();
		isr.close();
		is.close();
		System.out.println(line);
	}
	
	public void test2() {
		//Scanner Ŭ���� �̿� --> �ν��Ͻ� ����
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		scan.close();
		System.out.println(line);
	}

}
