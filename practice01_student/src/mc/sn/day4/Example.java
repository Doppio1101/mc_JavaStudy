package mc.sn.day4;

public class Example {
	
	public void test1(int chyear) {
		//���� üũ ���� �ۼ�
		// ������ �ش�⵵�� 400���� ������ �������ų�
		// 4�� ������ �������� 100���� ������ �������� ������ �����̴�.
		int year = chyear;
		if(year%400 == 0 || (year%4==0 && year % 100 != 0)) {
			System.out.println(year+"���� �����Դϴ�.");
		}
		else {
			System.out.println(year+"���� ����Դϴ�.");
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
	//�迭�̶�� ������ �ʿ��մϴ�.
	// ������ �����ִ� ������ ��쿡 �ϳ��� ǥ���ϸ� ����� �����մϴ�.
	// �����̸� �ϳ��� �����ִ� �����͸� ó���ؾ� �մϴ�.
	public void testArray() {
		int[] month = new int[12];
		month[0] = 5; //1������ �ݿ����� ǥ���ϴ� ��
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