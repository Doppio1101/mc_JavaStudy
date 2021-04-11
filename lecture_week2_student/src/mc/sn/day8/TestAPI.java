package mc.sn.day8;

import java.util.Date;
import java.util.Random;
import java.lang.*;//�⺻ ��Ű���� ��� ���� �⺻���� �����´�.
import java.text.SimpleDateFormat;

public class TestAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAPI ta = new TestAPI();
		//ta.testRandom();
		//System.out.println("");
		//ta.testMath();
		//ta.testDate();//Date�� toString�� �������̵� ���ִ�.
		//ta.testSimpleDateFormat();
		ta.test1Ver2();
		System.out.println();
		ta.test2();
	}
	public void test1Ver2() {
		//������ �̿��ؼ� 1~45������ ���� ���Ƿ� 6�� ���� -> �ζ�
		//�迭�� �����ϰ� ����Ѵ�.
		//����) �ߺ��� ���� ����� �Ѵ�.
		Random r = new Random();
		int[] ary = new int[6];
		int count = 0;
		boolean stop = false;
		while(!stop) {
			int num = (r.nextInt(45)+1);
			boolean flag = false;
			for(int i=0; i<count; i++) {
				if(ary[i] == num) {
					flag = true;
					break;
				}
				
			}
			if(!flag) {
				ary[count] = num;
				count++;
			}
			if(count == 6) {
				break;
			}
		}
		this.printNumbers(ary);
	}
	public void test1() {
		//������ �̿��ؼ� 1~45������ ���� ���Ƿ� 6�� ���� -> �ζ�
		//�迭�� �����ϰ� ����Ѵ�.
		//����) �ߺ��� ���� ����� �Ѵ�.
		Random r = new Random();
		int[] ary = new int[6];
		for(int i=0; i<6; i++) {
			int num = (r.nextInt(5)+1);
			boolean flag = false;
			for(int j=0; j<i; j++) {
				if(ary[j]==num) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				ary[i] = num;
			}
		}
		
		this.printNumbers(ary);
	}
	public void printNumbers(int[] list) {
		for(int temp : list) {
			System.out.print(temp+" ");

		}
		System.out.println();
	}
	public void test2() {
		//1~10���� ���� �迭�� ���ʷ� �ʱ�ȭ �Ѵ�.
		//�ε����� ���Ƿ� 2�� �����Ͽ� 5���� ���� ��Ҹ� ��ȯ(����)�� �� ��
		//���(���� for���� ����Ѵ�)
		int[] ary = {1,2,3,4,5,6,7,8,9,10};
		int r1 = 0;
		int r2 = 0;
		Random r = null;
		
		for(int i=0; i<5; i++) {
			int temp = 0;
			r = new Random();
			r1 = r.nextInt(ary.length);
			r2 = r.nextInt(ary.length);
			temp = ary[r1];
			ary[r1] = ary[r2];
			ary[r2] = temp;
			
		}
		for(int a : ary) {
			System.out.print(a+" ");

		}
	}
	
	public void testRandom() {
		//RandomŬ���� Ȯ��
		Random r = new Random();
		String name = "kim";
		for(int i=0; i<6; i++) {
			double rrd = r.nextInt(45);
			//0~44���� �� ����
			System.out.print(rrd+"\t");
		}
	}
	
	public void testMath() {
		//Math �𷡽� Ȯ��
		//Math math = new Math();
		//Math�� final��. ������ ����.
		//static��. -> ����̴�.
		Double r = Math.random();
		System.out.println(r);
		//0.0 <= r <1.0(0.9999999999...)
		
	}
	
	
	public void testDate() {
		Date date = new Date();
		System.out.println(date.toLocaleString());
		//toLocaleString�� ���� �׾����ִ� �Ŵ� ������� ����� �˷��ִ� ��
		//�� ����� �ѱ������� ǥ��
		int month = date.getMonth();
		int d = date.getDate();
		int day = date.getDay();
		System.out.println("month: "+month);//��-1 �迭�� 0���� ��.
		System.out.println("date: "+d);//��
		System.out.println("day: "+day);//����

	}
	public void testSimpleDateFormat() {
		//2021/04/07 11:26:30 �������� �ϰ� ���� ���� ������ ���� �Է�.
		String pattern = "yyyy/MM/dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String now = sdf.format(new Date());
		System.out.println(now);

	}

}