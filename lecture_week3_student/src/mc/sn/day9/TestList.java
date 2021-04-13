package mc.sn.day9;

import java.util.ArrayList;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestList tl = new TestList();
		tl.test1();
	}
	//Ŭ���� A, B�� ��Ӱ��踦 ������ �ְ� A�� ����Ŭ�����̸�,
	//������ ���� ������ �ڵ尡 �����ϴ�.
	//A a = new B() //promotion
	//B b = (B) a// casting
	public void test1() {
		//ArrayList�� �н�.-> CRUD�� ũ��.
		//ArrayList �ν��Ͻ��� ����
		ArrayList list = new ArrayList();
		//���� ������ �� �� �ش� ����Ʈ�� �������� ���Եȴ�.
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		int size = list.size();//ũ��
		System.out.println(size);
		this.printList(list);
		//����
		//list.set(1, new Integer(20));//int->int
		list.set(1, "20");//int->String 
		//�ᱹ �� �� objectŸ���̶� ������ ����.
		//��ȸ�� ���� ���� Integer�������� ĳ�����ؼ� �ޱ� ������ ����.
		this.printList(list);
		//����
		list.remove(1);
		this.printList(list);
		
	}
	
	//���ʸ� ������ ���� 
	//-> ���� �ٸ� Ÿ������ �������� �� ����ϴ� ���� ������ ���� �������
	//�Ѱ��� Ÿ���� �����Ͽ� �� �� �ֵ��� ��.
	//���ʸ��� ����ϴ� ������
	//=>������ �ܰ迡�� �߸��� Ÿ�� ���� �� �ִ� ���� ���� ����
	
	public void test2() {
		//ArrayList�� �н�.-> CRUD�� ũ��.
		//ArrayList �ν��Ͻ��� ����
		ArrayList<Integer> list = new ArrayList<Integer>();
		//���� ������ �� �� �ش� ����Ʈ�� �������� ���Եȴ�.
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		int size = list.size();//ũ��
		System.out.println(size);
		this.printList(list);
		//����
		list.set(1, new Integer(20));//int->int
		//list.set(1, "20");//int->String 
		//���ʸ����� Integer�� �ٷ��� ����ߴµ� ��Ʈ������ �����⶧���� ������ �˷���.
		this.printList(list);
		//����
		list.remove(1);
		this.printList(list);
		
	}
	
	public void test3() {
		//ArrayList�� �н�.-> CRUD�� ũ��.
		//ArrayList �ν��Ͻ��� ����
		ArrayList<Integer> list = new ArrayList<Integer>();
		//���� ������ �� �� �ش� ����Ʈ�� �������� ���Եȴ�.
		//list.add(new Integer(1));
		list.add(1); //-> 1�� JVM���� new Integer(1)�� �ٲ��ش�.
		//�̰� boxing
		list.add(2);
		list.add(3);
		int size = list.size();//ũ��
		System.out.println(size);
		this.printList2(list);
		//����
		list.set(1, new Integer(20));//int->int
		//list.set(1, "20");//int->String 
		//���ʸ����� Integer�� �ٷ��� ����ߴµ� ��Ʈ������ �����⶧���� ������ �˷���.
		this.printList2(list);
		//����
		list.remove(1);
		this.printList2(list);
		
	}
	//int --> Integer / char -->Charactor
	//wrappting Ŭ���� Ȯ�� �ϱ�.
	public void printList2(ArrayList<Integer> list) {
		for(int i=0; i<list.size(); i++) {
			int temp = list.get(i);//��ȸ
			//unboxing
			System.out.println(temp);
		}
	}

	
	public void printList(ArrayList list) {
		for(int i=0; i<list.size(); i++) {
			Integer integer = (Integer)list.get(i);//��ȸ
			//������ �� object Ÿ������ ���θ���� �Ǽ� Integer�� ĳ�������ش�.
			int temp = integer.intValue();
			System.out.println(temp);
		}
	}
}
