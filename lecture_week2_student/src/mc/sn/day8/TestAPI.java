package mc.sn.day8;

import java.util.Date;
import java.util.Random;
import java.lang.*;//기본 패키지의 모든 것은 기본으로 가져온다.
import java.text.SimpleDateFormat;

public class TestAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAPI ta = new TestAPI();
		//ta.testRandom();
		//System.out.println("");
		//ta.testMath();
		//ta.testDate();//Date에 toString이 오버라이드 돼있다.
		//ta.testSimpleDateFormat();
		ta.test1Ver2();
		System.out.println();
		ta.test2();
	}
	public void test1Ver2() {
		//랜덤을 이용해서 1~45까지의 수를 임의로 6개 생성 -> 로또
		//배열에 저장하고 출력한다.
		//조건) 중복된 수가 없어야 한다.
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
		//랜덤을 이용해서 1~45까지의 수를 임의로 6개 생성 -> 로또
		//배열에 저장하고 출력한다.
		//조건) 중복된 수가 없어야 한다.
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
		//1~10까지 수를 배열에 차례로 초기화 한다.
		//인덱스를 임의로 2개 생성하여 5번에 걸쳐 요소를 교환(섞은)을 한 후
		//출력(향상된 for문을 사용한다)
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
		//Random클래스 확인
		Random r = new Random();
		String name = "kim";
		for(int i=0; i<6; i++) {
			double rrd = r.nextInt(45);
			//0~44까지 값 리턴
			System.out.print(rrd+"\t");
		}
	}
	
	public void testMath() {
		//Math 쿨래스 확인
		//Math math = new Math();
		//Math가 final임. 생성자 없음.
		//static임. -> 상수이다.
		Double r = Math.random();
		System.out.println(r);
		//0.0 <= r <1.0(0.9999999999...)
		
	}
	
	
	public void testDate() {
		Date date = new Date();
		System.out.println(date.toLocaleString());
		//toLocaleString에 선이 그어져있는 거는 사용하지 말라고 알려주는 것
		//이 기능은 한국식으로 표현
		int month = date.getMonth();
		int d = date.getDate();
		int day = date.getDay();
		System.out.println("month: "+month);//월-1 배열로 0부터 됨.
		System.out.println("date: "+d);//일
		System.out.println("day: "+day);//요일

	}
	public void testSimpleDateFormat() {
		//2021/04/07 11:26:30 형식으로 하고 싶을 때는 패턴을 만들어서 입력.
		String pattern = "yyyy/MM/dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String now = sdf.format(new Date());
		System.out.println(now);

	}

}
