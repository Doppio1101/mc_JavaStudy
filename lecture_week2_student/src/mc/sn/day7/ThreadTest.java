package mc.sn.day7;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest tt = new ThreadTest();
		//tt.test1();
		tt.test3();
	}
	public void test1() {
		Thread t = new Thread();
		System.out.println("before start()");
		t.start();
		System.out.println("after start()");
	}
	
//	public void test2() {
//		Thread t = new MyThread();
//		System.out.println("before start()");
//		t.start();
//		System.out.println("after start()");
//	}

	public void test2() {
		Thread t = new MyThread();
		new Thread() {//MyThreadó�� �ܺο��� ������ �ʰ� �ƿ� ��������.
			//run���� run �ȿ� ������ �������̵�
			//�͸��̶�� �Ŵ� �ܺο��� �ҷ����� ���� �̸��� ������
			//�׳� �ٷ� new�� �����Ŵ.
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println((char)(i+65));
					try {
						Thread.sleep(150);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();//��ϸӽ��̳�Ŭ����(�͸��̳�Ŭ����)
		//start�� �ϸ� �ٷ� ����Ǵ� �� �ƴ϶� ��� ���·� �� �Ŀ� ����.
		System.out.println("before start()");//�׷��� �갡 ���� �����
		t.start();
		System.out.println("after start()");
		//���� ������ �갡 t.start()���� ���� �����.
		//�޼ҵ忡 synchronized�� ���̸� ���� ����Ǿ�� �Ѵ�.
	}
	
	class HisThread implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("inner class run method");
		}//�߻��̶� ������ϸ� ����.
		
	}//�Ϲ����� �̳�Ŭ����
	
	public void test3() {
		YourThread you = new YourThread();
		HisThread he = new HisThread();
		//���� ����ó�� �� ����� t2 ó�� �ٷ� �Ҵ�.
		//Ŭ�������� �߿��� ������ �����ڸ� ���� �޴´ٴ� ��.
		//�׷��� �����ڿ� you�� �ִ´�. -> ����
		Thread t = new Thread(you);//you�ȿ� run�޼ҵ尡 �ִ�.
		Thread t2 = new Thread(new HisThread());
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Runnable �͸� �̳�Ŭ����");
			}
		});//Runnable�̶�� �������̽��� �ٷ� �־ ��.
		//���� HisThread�� ����ϴ� ��. => �굵 �̳�Ŭ�����̴�.
		//�������̽� ����
		
		t.start();
		t2.start();
		t3.start();//���� ���� ������� �𸥴�.
	}
	
}