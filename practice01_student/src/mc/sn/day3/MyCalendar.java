package mc.sn.day3;

public class MyCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 0;
		int space = 0;
		
			System.out.println("8��");
			System.out.println("��\t��\tȭ\t��\t��\t��\t��");
			for(int s=0; s<space; s++) {
				System.out.print("\t");	
			}
			
			for(int i=1; i<=31; i++) {
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

