package mc.sn.day9;

public class LottoBall {
	private Integer number;
	private boolean isSelected;
	
	//number를 셋팅하는 생성자 만들고
	
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
	
	//각 필드의 get/set을 만드시오.
}
