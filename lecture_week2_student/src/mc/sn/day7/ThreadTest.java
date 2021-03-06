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
		new Thread() {//MyThread처럼 외부에서 만들지 않고 아예 만들어버림.
			//run까지 run 안에 내용을 오버라이드
			//익명이라는 거는 외부에서 불러오기 위해 이름을 짓지만
			//그냥 바로 new로 실행시킴.
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
		}.start();//어나니머스이너클래스(익명이너클래스)
		//start를 하면 바로 실행되는 게 아니라 대기 상태로 된 후에 실행.
		System.out.println("before start()");//그래서 얘가 먼저 실행됨
		t.start();
		System.out.println("after start()");
		//같은 이유로 얘가 t.start()보다 먼저 실행됨.
		//메소드에 synchronized를 붙이면 먼저 실행되어야 한다.
	}
	
	class HisThread implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("inner class run method");
		}//추상이라 선언안하면 에러.
		
	}//일반적인 이너클래스
	
	public void test3() {
		YourThread you = new YourThread();
		HisThread he = new HisThread();
		//굳이 위에처럼 안 만들고 t2 처럼 바로 할당.
		//클래스에서 중요한 내용은 생성자를 통해 받는다는 점.
		//그래서 생성자에 you를 넣는다. -> 연결
		Thread t = new Thread(you);//you안에 run메소드가 있다.
		Thread t2 = new Thread(new HisThread());
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Runnable 익명 이너클래스");
			}
		});//Runnable이라는 인터페이스를 바로 넣어도 됨.
		//위의 HisThread를 대신하는 격. => 얘도 이너클래스이다.
		//인터페이스 구현
		
		t.start();
		t2.start();
		t3.start();//누가 먼저 실행될지 모른다.
	}
	
}
