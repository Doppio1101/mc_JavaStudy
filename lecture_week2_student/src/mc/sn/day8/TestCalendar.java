package mc.sn.day8;

import java.util.Calendar;


public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCalendar tc = new TestCalendar();
		tc.test3(2020,2);
		
	}
	public void test1() {
		//�̱��� -> ��ü������ ����� �ϴ� �� �ƴ϶� Ŭ�������� ����.
		//�̱����� �Ϲ������� private�� ����.
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);//������
		int date = cal.get(Calendar.DAY_OF_WEEK);//����
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		
		System.out.println(year+"/"+month+"/"+day+" ("+date+
				") "+hour+":"+minute+":"+second);
	
	}
	
	public void test2() {
		Calendar cal = Calendar.getInstance();
		cal.set(2021, 3, 1);//4���� 3�� ������ 0���� ����
		//��, ��, ��
		int date = cal.get(Calendar.DAY_OF_WEEK);
		//�������� date-1
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("date = "+date+", lastDay = "+lastDay);
		
		
	}
	
	public void test3(int year, int month) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, (month-1), 1);
		int date = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		System.out.println("\t\t    "+year+"�� "+month+"��");
		System.out.println();
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
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