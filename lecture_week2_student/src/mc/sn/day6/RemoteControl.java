package mc.sn.day6;

public interface RemoteControl {
	
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	//interface������ ���� �ֱ� ���� ������ ��� ����� �����Ѵ�.
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	// �޼ҵ� ����θ� �ۼ��� ������ �߻� �޼ҵ��̴�.
}