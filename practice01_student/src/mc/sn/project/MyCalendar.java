package mc.sn.project;

public class MyCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 0;
		int space = 5;
		
		for(int e=1; e<=12; e++) {
			int base = 31;
			if(e == 2) {
				base = 28;
			}
			else if(e == 4 || e == 6 || e == 9 || e == 11) {
				base = 30;
			}
			System.out.println(e+"월");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			for(int s=0; s<space; s++) {
				System.out.print("\t");	
			}
			
			for(int i=1; i<=base; i++) {
				day = i;
				System.out.print(day+"\t");

				if((space+day)%7 ==0) {
					System.out.println("");
				
				}
			
			}
			if(space+base < 35) {
				space = 35 - (space+base);
				space = 7 - space;
			}
			else if((space+base) > 35){
				space = (space+base) - 35;
			}
			else
				space = 0;
			System.out.println("");
			System.out.println("");


		}
		
	}

}
