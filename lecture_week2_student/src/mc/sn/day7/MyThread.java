package mc.sn.day7;

public class MyThread extends Thread {

	@Override
	public void run() {
		//�������̵� �� ���¶� ������ �̷�⺸�ٴ� ����ó���� ����.
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
