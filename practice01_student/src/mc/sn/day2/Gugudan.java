package mc.sn.day2;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int k=0; k<8; k++) {
			int dan = k +2;
			for(int i=0; i<9; i++) {
				int number = i+1;
				System.out.println(dan+" x "+number+ "=" + (dan*number));
			}
			System.out.println("");
		}	
	}

}
