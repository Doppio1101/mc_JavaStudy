package mc.sn.day3;

public class Example {
	public void displayMonth(int s, int l) {
		// �����ϴ� ���� ������ ���� ������ �ش� �޷� ����
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
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
		//�Ҽ� üũ �޼����Դϴ�.
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
	public void test1(int num) {
		int a = num;
		if(a>0) {
			System.out.println("���");
		}
		else if(a==0) {
			System.out.println("0");
		}
		else {
			System.out.println("����");
		}
	}
}
