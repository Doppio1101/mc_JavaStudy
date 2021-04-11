package mc.sn.day3;

public class Example {
	public void displayMonth(int s, int l) {
		// 시작하는 날과 마지막 일을 보내면 해당 달력 생성
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int day = 0;
		int lastDay = l;
		int space = s;

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
	public boolean checkPrimeNumber(int checknum) {
		//소수 체크 메서드입니다.
		boolean flag = false;
		int number = checknum;
		// 소수 체크 로직을 작성하시오.
		// 소수는 1과 자기 자신으로만 나누어 떨어지는 수
		int count = 0;
		//if(number % 2 !=0) {
			for(int j=1; j<=number; j++) {
				if( number % j ==0) {
						count ++;
				}
					
			}
				
		//}
		if(count == 2) {
			//System.out.println(number+"소수입니다.");
			flag = true;
		} 
		/*else {
			System.out.println(number+"소수가 아닙니다.");
		}
		*/
		return flag;
	}
	public void test1(int num) {
		int a = num;
		if(a>0) {
			System.out.println("양수");
		}
		else if(a==0) {
			System.out.println("0");
		}
		else {
			System.out.println("음수");
		}
	}
}
