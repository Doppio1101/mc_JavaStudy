package mc.sn.practice;
import java.util.Scanner;

import mc.sn.day7.AccountVO;

public class BankApplication {
	public static Account[] acc = new Account[3];
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		//BankApplication BA = new BankApplication();
		//Account[] acc = new Account[10];
		//Account acc1;
		int i = 0;
		while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.��  �� | 4.��  �� | 5.��  ��");
			System.out.println("------------------------------------------------");
			System.out.print("����>");
//			AccountVO account1 = new AccountVO("1001","kim",100000);
//			AccountVO account2 = new AccountVO("1002","jang",5000000);
//			AccountVO account3 = new AccountVO("1003","lee",70000);
//			//�迭�� �����ϰ� ���� �ν��Ͻ��� �ʱ�ȭ�ϼ���.
//			
//			AccountVO[] accountArry = {account1, account2, account3};
//			
			
			int selectNo = scanner.nextInt();
			System.out.println();
			if(selectNo == 1) {
//				System.out.print("���¹�ȣ �Է�:");
//				String newAcc = scanner.next();
//				System.out.print("������ �Է�:");
//				String newOwner = scanner.next();
//				System.out.print("���ݾ� �Է�:");
//				int newBalance = scanner.nextInt();
//				acc1  = new Account(newAcc, newOwner, newBalance);
//				acc[i] = acc1;
//				i++;
				if(i==3) {
					System.out.println("���¸���� ��� ä���� �޴��� ���ư��ϴ�.");
					continue;
				}
				acntCreate(i);
				i++;
			}else if(selectNo == 2) {
				acntList(acc);
			}else if(selectNo == 3) {
				acntIn(acc);
			}else if(selectNo == 4) {
				acntOut();
			}else if(selectNo == 5) {
				run = false;
				System.out.println("���α׷� ����");
			}
			
			
			
		}
	}
	

//	private static Account acntCreate() {
//		Account acc1;
//		System.out.print("���¹�ȣ �Է�:");
//		String newAcc = scanner.next();
//		System.out.print("������ �Է�:");
//		String newOwner = scanner.next();
//		System.out.print("���ݾ� �Է�:");
//		int newBalance = scanner.nextInt();
//		acc1  = new Account(newAcc, newOwner, newBalance);
//		return acc1;
//	}
	private static void acntCreate(int i) {
		Account acc1;
		System.out.print("���¹�ȣ �Է�:");
		String newAcc = scanner.next();
		System.out.print("������ �Է�:");
		String newOwner = scanner.next();
		System.out.print("���ݾ� �Է�:");
		int newBalance = scanner.nextInt();
		acc1  = new Account(newAcc, newOwner, newBalance);
		acc[i]=acc1;
		System.out.println("���� ���� �Ϸ�!");
	}
	private static void acntList(Account[] list) {
		for(Account account : list) {
			if(account != null) {
				System.out.println(account);
			}
			else {
				break;
			}
			//Account���� toString�� ���� ����Ʈ�� ���� ����� �� �ֵ��� ������ ��.
//			System.out.println(account.getAno()+","
//					+account.getOwner()+","+account.getBalance());
		}
	}
	private static void acntIn(Account[] list) {
		System.out.print("�Ա��� ���¹�ȣ:");
		String findAcc = scanner.next();
		for(Account acnt : list) {
			if(acnt!=null) {
//				System.out.println(acnt.getAno());
					if(acnt.getAno().equals(findAcc)){
						System.out.print("�Ա��� �ݾ�:");
						int nowBalance = acnt.getBalance();
						int inBalance = scanner.nextInt();
						acnt.setBalance(inBalance+nowBalance);
						break;
					}
					
			}
			
		}

		//
	}
	private static void acntOut() {
		System.out.print("����� ���¹�ȣ:");
		String findAcc = scanner.next();
		for(int i=0; i<acc.length; i++) {
			if(acc[i].getAno().equals(findAcc)) {
				System.out.print("����� �ݾ�:");
				int nowBalance = acc[i].getBalance();
				int inBalance = scanner.nextInt();
				if(nowBalance < inBalance) {
					System.out.println("�ܾ��� �����մϴ�.");
					System.out.println("�ܾ�: "+nowBalance);
					i--;
					continue;
				}
				else {
					acc[i].setBalance(nowBalance-inBalance);
					break;
				}
			}
			
		}
	}
	

}