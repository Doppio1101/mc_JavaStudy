package mc.sn.day4;

public class LottoBall {
	//������ Ŭ����
	private String ballNumber;//�������� �ʴ� ������ String���� ����.
	private boolean isSelectedBall;
	//ĸ��ȭ �κ� (��)
	public LottoBall(){
		
	}
	public LottoBall(String ballNumber) {
		this.ballNumber = ballNumber;
	}
	//������ Ŭ���� �̸����� �����.
	
	
//	public void setBallNumber(String ballNumber) {
//		this.ballNumber = ballNumber;
//	} //�� ���´� ���� ������ �� �ִ�.
	public String getBallNumber() {
		return this.ballNumber;
	}
	
	public void setIsSelectBall(boolean isSelectBall) {
		this.isSelectedBall = isSelectBall;
	}
	public boolean getIsSelectBall() {
		return this.isSelectedBall;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getBallNumber() + "," + this.getIsSelectBall() ;
		//super�� �θ� ��ü.
		
	}
	
	
	
}