package mc.sn.project;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		
		for(int i=2; i<100; i++) {
			int count = 0;
			if(i % 2 !=0) {
				for(int j=1; j<=i; j++) {
					if( i % j ==0) {
						
							count ++;
					}
					
				}
				
			}
			if(count == 2) {
				sum = sum + i;
			}
				
				
		}
	
		sum = sum +2;
		System.out.println(sum);

		
		
	}

}
