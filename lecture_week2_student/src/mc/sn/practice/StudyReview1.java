package mc.sn.practice;

public class StudyReview1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudyReview1 SR = new StudyReview1();
		for(int i=0; i<12; i++) {
			int month = i+1;
			SR.class1(month);
			System.out.println("\n\n");
		}
		
		
	}
	
	public void class1(int month) {
		//2021년도 달력을 만드는 코드 작성(월을 입력하면 해당 월 출력)
		int space = 0;
		int lastday = 31;
		int[] months = {5, 1, 1, 4, 6, 2, 4, 0, 3, 5, 1, 3};
		int[] lastdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		space = months[month-1];
		lastday = lastdays[month-1];
		System.out.println("2021년"+month+"월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i=0; i<space; i++) {
			System.out.print("\t");
		}
		for(int i=0; i<lastday; i++) {
			int day = i+1;
			
			System.out.print(day+"\t");
			if((day+space)%7 ==0) {
				System.out.println("");
			}
			
		}
		
		
	}
	
}
