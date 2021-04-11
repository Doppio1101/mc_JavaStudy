package mc.sn.practice;

public class Account {
	// �̷��� Value Object : VO
	// �������� Data Transfer Object : DTO
	// �� �������� DataBean
	private String ano;//���¹�ȣ AccountNumber
	private String owner; // ������
	private int balance; // �ܰ�
	//ĸ��ȭ�� �����Ͻÿ�.
	//�ʵ��� private �ش� �ʵ��� get, set �����
	//������ ������ ��.(balance�� �ʼ� �׸��� �ƴ�.)
	//get�� public
	//set�� private
//	private Account(String ano, String owner) {
//		this.ano = ano;
//		this.owner = owner;
//		
//	}balance �ʼ� �׸� �ƴ� �� -> �� �־ �ɶ�.
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
