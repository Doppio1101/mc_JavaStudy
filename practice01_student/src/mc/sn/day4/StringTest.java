package mc.sn.day4;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTest t = new StringTest();
		t.test1();
		
	}
	public void test1() {
		String name1 = "kim";
		String name2 = "kim";

		String addr = "�����";
		System.out.println(name1+","+addr);
		String n = new String("kim"); //������.
		// �ش��ϴ� Ŭ�������� �� �ʿ�� �ϴ� �����͸� �ʱ�ȭ �ϴ� ����.
		String n2 = new String("kim");
		//������ ������ equals�� �̿��ؼ� ���ؾ� �Ѵ�.
		//�ν��Ͻ��� Ư������ ����񱳴� equals��� �޼ҵ带 ���.
		if(n.equals(n2)) {
			System.out.println("==");
		}
		else {
			System.out.println("!=");
		}
		//�ؿ� �ִ� n==n2�� �������� ���ϴ� �� �ƴ�.
		if(n==n2) {
			System.out.println("==");
		}
		else {
			System.out.println("!=");
		}
		System.out.println(n);
//		if(name1==name2) {
//			System.out.println("==");	
//		}
//		else {
//			System.out.println("!=");
//		}
	}
	public void test2(){
//		DataClass dc1 = new DataClass();
//		DataClass dc2 = new DataClass();
//		dc1.name = "kim";
//		dc1.sex = "male"; //������ Ȯ�� �� ���¿��� ���;� �ȴ�.
//		//�׷��� ������ �� �� ���� ���õǼ� ���;� �Ѵ�. �װ� ������.
//		dc2.name = "lee";
//		dc2.sex = "female";
//		System.out.println(dc1.name+","+dc1.sex);
//		System.out.println(dc2.name+","+dc2.sex);
	}
	public void test3(){
		//���ϰͰ� �� ���ϰ��� �����ϴ� �� ĸ��ȭ
		DataClass dc1 = new DataClass("female");//female, male�� ������
		DataClass dc2 = new DataClass("male");
		dc1.setName("kim");
		dc2.setName("lee");
		//dc1.setSex("male"); // setSex�� ���� ������ ����
		//setSex�� private�� �ּ� �����ڷθ� ����
		//�＼�� �������̷� ���� ����

		System.out.println(dc1.getName()+","+dc1.getSex());
		System.out.println(dc2.getName()+","+dc2.getSex());
	}
}