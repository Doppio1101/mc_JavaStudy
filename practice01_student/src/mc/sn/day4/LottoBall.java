package mc.sn.day4;

public class LottoBall {
	//데이터 클래스
	private String ballNumber;//연산하지 않는 정보는 String으로 하자.
	private boolean isSelectedBall;
	//캡슐화 부분 (위)
	public LottoBall(){
		
	}
	public LottoBall(String ballNumber) {
		this.ballNumber = ballNumber;
	}
	//생성자 클래스 이름으로 만든다.
	
	
//	public void setBallNumber(String ballNumber) {
//		this.ballNumber = ballNumber;
//	} //이 상태는 값을 수정할 수 있다.
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
		//super는 부모 객체.
		
	}
	
	
	
}
