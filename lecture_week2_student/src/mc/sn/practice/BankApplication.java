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
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예  금 | 4.출  금 | 5.종  료");
			System.out.println("------------------------------------------------");
			System.out.print("선택>");
//			AccountVO account1 = new AccountVO("1001","kim",100000);
//			AccountVO account2 = new AccountVO("1002","jang",5000000);
//			AccountVO account3 = new AccountVO("1003","lee",70000);
//			//배열을 선언하고 위의 인스턴스를 초기화하세요.
//			
//			AccountVO[] accountArry = {account1, account2, account3};
//			
			
			int selectNo = scanner.nextInt();
			System.out.println();
			if(selectNo == 1) {
//				System.out.print("계좌번호 입력:");
//				String newAcc = scanner.next();
//				System.out.print("계좌주 입력:");
//				String newOwner = scanner.next();
//				System.out.print("예금액 입력:");
//				int newBalance = scanner.nextInt();
//				acc1  = new Account(newAcc, newOwner, newBalance);
//				acc[i] = acc1;
//				i++;
				if(i==3) {
					System.out.println("계좌목록이 모두 채워져 메뉴로 돌아갑니다.");
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
				System.out.println("프로그램 종료");
			}
			
			
			
		}
	}
	

//	private static Account acntCreate() {
//		Account acc1;
//		System.out.print("계좌번호 입력:");
//		String newAcc = scanner.next();
//		System.out.print("계좌주 입력:");
//		String newOwner = scanner.next();
//		System.out.print("예금액 입력:");
//		int newBalance = scanner.nextInt();
//		acc1  = new Account(newAcc, newOwner, newBalance);
//		return acc1;
//	}
	private static void acntCreate(int i) {
		Account acc1;
		System.out.print("계좌번호 입력:");
		String newAcc = scanner.next();
		System.out.print("계좌주 입력:");
		String newOwner = scanner.next();
		System.out.print("예금액 입력:");
		int newBalance = scanner.nextInt();
		acc1  = new Account(newAcc, newOwner, newBalance);
		acc[i]=acc1;
		System.out.println("계좌 생성 완료!");
	}
	private static void acntList(Account[] list) {
		for(Account account : list) {
			if(account != null) {
				System.out.println(account);
			}
			else {
				break;
			}
			//Account에서 toString을 만들어서 리스트를 전부 출력할 수 있도록 수정해 줌.
//			System.out.println(account.getAno()+","
//					+account.getOwner()+","+account.getBalance());
		}
	}
	private static void acntIn(Account[] list) {
		System.out.print("입금할 계좌번호:");
		String findAcc = scanner.next();
		for(Account acnt : list) {
			if(acnt!=null) {
//				System.out.println(acnt.getAno());
					if(acnt.getAno().equals(findAcc)){
						System.out.print("입금할 금액:");
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
		System.out.print("출금할 계좌번호:");
		String findAcc = scanner.next();
		for(int i=0; i<acc.length; i++) {
			if(acc[i].getAno().equals(findAcc)) {
				System.out.print("출금할 금액:");
				int nowBalance = acc[i].getBalance();
				int inBalance = scanner.nextInt();
				if(nowBalance < inBalance) {
					System.out.println("잔액이 부족합니다.");
					System.out.println("잔액: "+nowBalance);
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
