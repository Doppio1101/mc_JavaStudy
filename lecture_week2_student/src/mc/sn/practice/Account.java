package mc.sn.practice;

public class Account {
	// 이런걸 Value Object : VO
	// 옛날에는 Data Transfer Object : DTO
	// 더 옛날에는 DataBean
	private String ano;//계좌번호 AccountNumber
	private String owner; // 계좌주
	private int balance; // 잔고
	//캡슐화를 구현하시오.
	//필드의 private 해당 필드의 get, set 만들고
	//생성자 만들어야 함.(balance는 필수 항목이 아님.)
	//get은 public
	//set은 private
//	private Account(String ano, String owner) {
//		this.ano = ano;
//		this.owner = owner;
//		
//	}balance 필수 항목 아닐 때 -> 안 넣어도 될때.
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getAno() {
		return this.ano;
	}
	public String getOwner() {
		return this.owner;
	}
	public int getBalance() {
		return this.balance;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getAno()+"\t|"+this.getOwner()+"\t|"+this.getBalance();
	}
	
}
