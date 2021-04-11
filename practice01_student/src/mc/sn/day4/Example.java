package mc.sn.day4;

public class Example {
	
	public void test1(int chyear) {
		//윤년 체크 로직 작성
		// 윤년은 해당년도를 400으로 나누어 떨어지거나
		// 4로 나누어 떨어지고 100으로 나누어 떨어지지 않으면 윤년이다.
		int year = chyear;
		if(year%400 == 0 || (year%4==0 && year % 100 != 0)) {
			System.out.println(year+"년은 윤년입니다.");
		}
		else {
			System.out.println(year+"년은 평년입니다.");
		}
	}
	public boolean isLeapYear(int y) {
		boolean flag = false;
		int year = y;
		if(year % 400 == 0 || (year%4==0 && year % 100 != 0)) {
			flag = true;
		}
		return flag;
	}
	//배열이라는 개념이 필요합니다.
	// 변수가 관련있는 내용일 경우에 하나의 표현하면 상당히 편리합니다.
	// 변수이름 하나로 관계있는 데이터를 처리해야 합니다.
	public void testArray() {
		int[] month = new int[12];
		month[0] = 5; //1월달의 금요일을 표시하는 것
		month[1] = 1; 
		
		
		month[11] = 3;
		
		//int index = 0;
		for(int i =0; i<12; i++) {
			//index = i;
			System.out.println(month[i]);
		}
		for(int i : month) {
			System.out.println(i);
		}
		int size = month.length;
		
		System.out.println(size);
//		System.out.println(month[0]);
//		System.out.println(month[10]);
		
	}
}
