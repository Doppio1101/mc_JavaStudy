package mc.sn.day4;

public class Studio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studio s = new Studio();
		s.readyLottoBall();
//		this.readyLottoBall();
	}
	
	public void readyLottoBall() {
		LottoBall[] ballBox = new LottoBall[45];
		//LottoBall 클래스를 불러오는데 크기를 45인 리스트 형태로.
		LottoBall ball = null;
		//이건 LottoBall 클래스 안의 LottoBall 생성자
		int n =0;
		for(int i=0; i<45; i++) {
			n = i +1;
			ball = new LottoBall(n+"");
			ballBox[i] = ball;
		}
		this.printBall(ballBox);
	
	}
	public void printBall(LottoBall[] balls) {
		for(LottoBall ball : balls) {
			System.out.println(ball);
			//필드가 많을 경우 override를 통해 
			//한 번에 진행할 수 있도록 toString을 쓴다.
//			System.out.println(ball.getBallNumber());
//			System.out.println(ball.getIsSelectBall());
//			ball.toString();

		}//어드벤스 for문 index를 사용 함
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
