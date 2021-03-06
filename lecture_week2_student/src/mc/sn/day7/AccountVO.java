package mc.sn.day7;

public class AccountVO {
	private String ano;
	private String owner;
	private int balance;
	
	//생성자
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
	}//toString을 오버라이드 해서 가지고 있는 인자값을 전부 출력할 수 있도록 수정 해준다.
	
}
