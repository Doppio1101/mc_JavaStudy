package mc.sn.day6;

public interface RemoteControl {
	
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	//interface에서는 값을 넣기 위한 변수는 모두 상수로 정의한다.
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	// 메소드 선언부만 작성한 것으로 추상 메소드이다.
}
