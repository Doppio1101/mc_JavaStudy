package mc.sn.day2;

public class RapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int count = 0;
		
		for(int i=0; i<50; i++) {
			
			
			count = count + 1;
			int x = count % 10;
			int y = count / 10;
			int sum = 0;
			if(x == 3 || x == 6 || x==9) {
				sum = 1;
				
			}
			if (y==3 || y==6 || y==9) {
				sum = sum + 1;
			}
			
			if(sum == 1) {
				System.out.println(count + "Â¦ ");
			}
			else if(sum == 2) {
				System.out.println(count + "Â¦Â¦ ");
			}
			
			else {
				System.out.println(count + " ");
			}
			
			
			
		}*/
		
		System.out.println("ÀÏ\t¿ù\tÈ­\t¼ö\t¸ñ\t±Ý\tÅä");
		int day = 0;
		int space = 2;
		System.out.print("\t\t");
		for(int i=1; i<=31; i++) {
			day = i;
			System.out.print(day + "\t");
			if((space+day) % 7 == 0) {
				System.out.println("");
			}
		}
	}

}
