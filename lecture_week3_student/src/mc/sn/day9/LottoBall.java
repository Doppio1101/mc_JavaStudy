package mc.sn.day9;

public class LottoBall {
	private Integer number;
	private boolean isSelected;
	
	//number�� �����ϴ� ������ �����
	
	public LottoBall(Integer number) {
		this.number = number;
	}
	
	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Integer getNumber() {
		return this.number;
	}
	public boolean isSelected() {
		return this.isSelected;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getNumber().toString();
	}
	
	//�� �ʵ��� get/set�� ����ÿ�.
}
