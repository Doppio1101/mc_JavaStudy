package mc.sn.day7;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		bank.createAccount();
		
	}

	public void createAccount() {
		//account 생성
		AccountVO account1 = new AccountVO("1001","kim",100000);
		AccountVO account2 = new AccountVO("1002","jang",5000000);
		AccountVO account3 = new AccountVO("1003","lee",70000);
		//배열을 선언하고 위의 인스턴스를 초기화하세요.
		
		AccountVO[] accountArry = {account1, account2, account3};
		
		this.printAccount(accountArry);
		
	}
	
	public void printAccount(AccountVO[] list) {
		for(AccountVO account : list) {
			System.out.println(account);
			//AccountVO에서 toString을 만들어서 리스트를 전부 출력할 수 있도록 수정해 줌.
//			System.out.println(account.getAno()+","
//					+account.getOwner()+","+account.getBalance());
		}
	
	
	
	}
	
}
