package mc.sn.day3;

public class checkservice {
	
	public void displayMonth() {
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		int day = 0;
		int lastDay = 31;
		int space = 0;

		for(int k=0; k<space; k++) {
			System.out.print("\t");
		}
		
		for(int i=0;i<lastDay;i++) {
			day = i+1;
			System.out.print(day+"\t");
			if ((space+day)%7==0) {
				System.out.println();
			} 
		}
	}
	
}
