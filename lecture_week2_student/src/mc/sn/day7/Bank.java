package mc.sn.day7;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		bank.createAccount();
		
	}

	public void createAccount() {
		//account ����
		AccountVO account1 = new AccountVO("1001","kim",100000);
		AccountVO account2 = new AccountVO("1002","jang",5000000);
		AccountVO account3 = new AccountVO("1003","lee",70000);
		//�迭�� �����ϰ� ���� �ν��Ͻ��� �ʱ�ȭ�ϼ���.
		
		AccountVO[] accountArry = {account1, account2, account3};
		
		this.printAccount(accountArry);
		
	}
	
	public void printAccount(AccountVO[] list) {
		for(AccountVO account : list) {
			System.out.println(account);
			//AccountVO���� toString�� ���� ����Ʈ�� ���� ����� �� �ֵ��� ������ ��.
//			System.out.println(account.getAno()+","
//					+account.getOwner()+","+account.getBalance());
		}
	
	
	
	}
	
}