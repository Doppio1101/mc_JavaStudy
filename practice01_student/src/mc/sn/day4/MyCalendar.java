package mc.sn.day4;

public class MyCalendar {
	public void displayMonth(int year, int month) {
		
			System.out.println(month+"��");
			System.out.println("��\t��\tȭ\t��\t��\t��\t��");
			int [] months = {5,1,1,4,6,2,4,0,3,5,1,3};
			int [] lastDays = {31,28,31,30,31,30,31,31,30,31,30,31};
			int day = 0;
			int space = months[month-1];
			int lastday = lastDays[month-1];
			Example e = new Example();
			boolean flag = e.isLeapYear(year);
			if(month == 2) {
				if(flag) {
					lastday = 29;
				}
				else {
					lastday = 28;
				}
			}

			
			for(int s=0; s<space; s++) {
				System.out.print("\t");	
			}
			
			for(int i=1; i<=lastday; i++) {
				day = i;
				System.out.print(day+"\t");

				if((space+day)%7 ==0) {
					System.out.println("");
				
				}
			
			}
			System.out.println("");
			System.out.println("");

	}
}