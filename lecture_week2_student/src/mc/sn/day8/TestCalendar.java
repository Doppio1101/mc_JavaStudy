package mc.sn.day8;

import java.util.Calendar;


public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCalendar tc = new TestCalendar();
		tc.test3(2020,2);
		
	}
	public void test1() {
		//싱글톤 -> 객체생성을 사람이 하는 게 아니라 클래스에서 진행.
		//싱글톤은 일반적으로 private로 생성.
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);//일정보
		int date = cal.get(Calendar.DAY_OF_WEEK);//요일
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		
		System.out.println(year+"/"+month+"/"+day+" ("+date+
				") "+hour+":"+minute+":"+second);
	
	}
	
	public void test2() {
		Calendar cal = Calendar.getInstance();
		cal.set(2021, 3, 1);//4월이 3인 이유는 0부터 시작
		//년, 월, 일
		int date = cal.get(Calendar.DAY_OF_WEEK);
		//시작일은 date-1
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("date = "+date+", lastDay = "+lastDay);
		
		
	}
	
	public void test3(int year, int month) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, (month-1), 1);
		int date = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		System.out.println("\t\t    "+year+"년 "+month+"월");
		System.out.println();
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int day = 0;
		int space = date-1;		
		
		for(int s=0; s<space; s++) {
			System.out.print("\t");	
		}
		
		for(int i=1; i<=lastDay; i++) {
			day = i;
			System.out.print(day+"\t");

			if((space+day)%7 ==0) {
				System.out.println("");
			
			}
		
		}
		
	}
	

}
