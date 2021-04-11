package mc.sn.day7;

public class MyThread extends Thread {

	@Override
	public void run() {
		//오버라이드 한 상태라서 에러를 미루기보다는 직접처리가 낫다.
		// TODO Auto-generated method stub
		//super.run();
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
