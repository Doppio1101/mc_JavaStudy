package mc.sn.day3;

public class Gugudan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int k=0; k<9; k++) {
			int number = k+1;

			for(int i=0; i<8; i++) {
				
				int dan = i +2;
				System.out.print("\t"+dan+" x "+number+ "=" + (dan*number)+" ");
			}
			System.out.println("");
		}
	}

}
