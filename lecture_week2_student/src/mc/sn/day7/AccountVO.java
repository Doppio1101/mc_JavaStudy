package mc.sn.day7;

public class AccountVO {
	private String ano;
	private String owner;
	private int balance;
	
	//������
	public AccountVO(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		
	}
	//getter, setter
	public String getAno() {
		return this.ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return this.balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getAno()+"\t|"+this.getOwner()+"\t|"+this.getBalance();
	}//toString�� �������̵� �ؼ� ������ �ִ� ���ڰ��� ���� ����� �� �ֵ��� ���� ���ش�.
	
}