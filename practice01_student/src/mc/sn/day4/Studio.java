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
		//LottoBall Ŭ������ �ҷ����µ� ũ�⸦ 45�� ����Ʈ ���·�.
		LottoBall ball = null;
		//�̰� LottoBall Ŭ���� ���� LottoBall ������
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
			//�ʵ尡 ���� ��� override�� ���� 
			//�� ���� ������ �� �ֵ��� toString�� ����.
//			System.out.println(ball.getBallNumber());
//			System.out.println(ball.getIsSelectBall());
//			ball.toString();

		}//��庥�� for�� index�� ��� ��
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}