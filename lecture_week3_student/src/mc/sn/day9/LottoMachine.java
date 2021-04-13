package mc.sn.day9;

import java.util.ArrayList;
import java.util.Random;

public class LottoMachine {
	private ArrayList<LottoBall> list;
	
	public LottoMachine(ArrayList<LottoBall> list) {
		this.list = list;
	}
	
	public LottoBall getBall() {
		LottoBall ball = null;
		Random r = new Random();
		int index = r.nextInt(45);
		ball = list.get(index);
		return ball;
	}
	public LottoBall getBallV2() {
		LottoBall ball = null;
		Random r = new Random();
		int index = r.nextInt(list.size());
		ball = list.remove(index);
		return ball;
	}
	public void startMachine(int num) {
		//���� �̴� ����(�ݺ�) num�� �ݺ�Ƚ��. ���� �̾Ҵٰ� �ִ� ���
		LottoBall ball = null;
		for(int i=0; i<num; i++) {
			ball = this.getBall();
			//���� �ߺ� �˻�
			if(ball.isSelected()) {
				//true�� ���� ���̴�.
				i--;
				continue;
			}else {
				//false
				ball.setSelected(true);
			}
			
			System.out.println(ball.getNumber()+"���� �������ϴ�.");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void startMachineV2(int num) {
		//���� �̴� ����(�ݺ�) num�� �ݺ�Ƚ��.//���� �Ÿ� �ٽ� ���� ����
		LottoBall ball = null;
		for(int i=0; i<num; i++) {
			ball = this.getBallV2();
			
			System.out.println(ball+"���� �������ϴ�.");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
