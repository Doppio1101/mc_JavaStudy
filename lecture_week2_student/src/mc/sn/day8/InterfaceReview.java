package mc.sn.day8;

public class InterfaceReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceReview ir = new InterfaceReview();
		ir.test1();
		
		
	}
	public void test1() {
		A a1 = new B();
		A a2 = new C();//Ȯ��
		A a3 = new D();//A���� ���̵� �� ������ ���Ѽ� ����Ѵ�.
		A a4 = new E();
		
		B b1 = new B();
		B b2 = new D();
		B b3 = (B)a1;//ĳ����.(int)2.2 �� ���ٰ� ����.
		
		C c1 = new C();
		C c2 = new E();
		C c3 = (C)a2;//ĳ���� -> �ڱ� Ÿ������ ���ư���.
		
		D d1 = new D();
		D d2 = (D)b1;
		D d3 = (D)b2;
		D d4 = (D)b3;
		D d5 = (D)a1;
		D d6 = (D)a3;
		
		E e1 = new E();
		E e2 = (E)c1;
		E e3 = (E)c2;
		E e4 = (E)c3;
		E e5 = (E)a1;
	}

}
