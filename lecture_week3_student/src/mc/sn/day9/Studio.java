package mc.sn.day9;

import java.util.ArrayList;

public class Studio {
	private LottoMachine machine;
	
	public Studio() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studio studio = new Studio();
		try {
			studio.onAir();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void onAir() throws InterruptedException {
		//방송준비하고 멘트하고 뽑는 시간
		System.out.println("로또 추첨 방송을 준비합니다.");
		Thread.sleep(5000);
		this.readyAir();
		System.out.println("로또 추첨 방송을 시작합니다.");
		Thread.sleep(2000);
		machine.startMachineV2(6);
		Thread.sleep(3000);
		System.out.println("이것으로 추첨 방송을 마칩니다.\n감사합니다!");
	}
	public void readyAir() {
		//볼을 사서 로또 머신에 셋팅하는 역할
		ArrayList<LottoBall> list = this.makeBalls(45);
		machine = new LottoMachine(list);
	}
	
	public ArrayList<LottoBall> makeBalls(int number){
		//number는 공을 몇개 넣을 것인지 물어보는거
		ArrayList<LottoBall> list = null;
		list = new ArrayList<LottoBall>();
		for(int i=0; i<number; i++) {
			list.add(new LottoBall(i+1));
		}
		return list;
	}
	

}
