package mc.sn.day2;

public class OpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("일\t월\t화\t수\t목\t금\t토");
//		System.out.println("1\t2\t3\t4\t5\t6\t7");
//		System.out.println("8\t9\t10\t11\t12\t13\t14");
//		System.out.println("15\t16\t17\t18\t19\t20\t21");
//		System.out.println("22\t23\t24\t25\t26\t27\t28");
//		System.out.println("29\t30\t31");
		int day = 0;
		//System.out.print("\t");
		int space = 0;
		for(int i=0;i<31;i++) {
			day = i+1;
			System.out.print(day+"\t");
			if ((space+day)%7==0) {
				System.out.println();
			} 
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}
