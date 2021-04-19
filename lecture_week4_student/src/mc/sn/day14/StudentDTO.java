package mc.sn.day14;

public class StudentDTO {
	private int stdNo;
	private String email;
	private int kor;
	private int eng;
	private int math;
	private int sci;
	private int hist;
	private int total;
	private String MgrCode;
	private String accPoint;
	private String localCode;
	//990001	addx	17	29	16	49	43	154	C	A	C
	//위의 필드에 대해서 get,set을 생성.
//	public StudentDTO(int stdNo, String email, int kor, int eng,
//	 int math, int sci, int hist, int total, String MgrCode, String accPoint, String localCode) {
//		this.stdNo = stdNo;
//		this.email = email;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//		this.sci = sci;
//		this.hist = hist;
//		this.total = total;
//		this.MgrCode = MgrCode;
//		this.accPoint = accPoint;
//		this.localCode = localCode;
//		
//	}
	public int getStdNo() {
		return stdNo;
	}
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	public int getHist() {
		return hist;
	}
	public void setHist(int hist) {
		this.hist = hist;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getMgrCode() {
		return MgrCode;
	}
	public void setMgrCode(String mgrCode) {
		MgrCode = mgrCode;
	}
	public String getAccPoint() {
		return accPoint;
	}
	public void setAccPoint(String accPoint) {
		this.accPoint = accPoint;
	}
	public String getLocalCode() {
		return localCode;
	}
	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.stdNo+"\t"+this.kor+"\t"+this.eng+"\t"+
				this.math+"\t"+this.MgrCode+"\t"+this.accPoint+"\t"+this.localCode;
	}
	
	
}	
