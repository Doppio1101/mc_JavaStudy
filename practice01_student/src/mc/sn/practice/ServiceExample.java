package mc.sn.practice;

public class ServiceExample {
	public void displayGugudan(int temp) {
		for(int k=0; k<(temp-1); k++) {
			int dan = k +2;
			for(int i=0; i<9; i++) {
				int number = i+1;
				System.out.println(dan+" x "+number+ "=" + (dan*number));
			}
			System.out.println("");
		}	
	}

	public void displayMonth() {
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

	public boolean checkPrimeNumber(int checknum) {
		boolean flag = false;
		
		int number = checknum;
		// �Ҽ� üũ ������ �ۼ��Ͻÿ�.
		// �Ҽ��� 1�� �ڱ� �ڽ����θ� ������ �������� ��
		int count = 0;
		//if(number % 2 !=0) {
			for(int j=1; j<=number; j++) {
				if( number % j ==0) {
						count ++;
				}
					
			}
				
		//}
		if(count == 2) {
			//System.out.println(number+"�Ҽ��Դϴ�.");
			flag = true;
		} 
		/*else {
			System.out.println(number+"�Ҽ��� �ƴմϴ�.");
		}
		*/
		
		return flag;
	}
	
}
