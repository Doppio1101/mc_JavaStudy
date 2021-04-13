package mc.sn.day9;

import java.util.ArrayList;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestList tl = new TestList();
		tl.test1();
	}
	//클래스 A, B가 상속관계를 가지고 있고 A가 수퍼클래스이면,
	//다음과 같은 다형성 코드가 가능하다.
	//A a = new B() //promotion
	//B b = (B) a// casting
	public void test1() {
		//ArrayList를 학습.-> CRUD와 크기.
		//ArrayList 인스턴스를 생성
		ArrayList list = new ArrayList();
		//삽입 삽입을 할 때 해당 리스트의 마지막에 삽입된다.
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		int size = list.size();//크기
		System.out.println(size);
		this.printList(list);
		//변경
		//list.set(1, new Integer(20));//int->int
		list.set(1, "20");//int->String 
		//결국 둘 다 object타입이라 문제가 없다.
		//조회할 때는 현재 Integer형식으로 캐스팅해서 받기 때문에 오류.
		this.printList(list);
		//삭제
		list.remove(1);
		this.printList(list);
		
	}
	
	//제너릭 개념을 도입 
	//-> 서로 다른 타입으로 저장했을 때 출력하는 데에 문제가 많이 생기더라
	//한가지 타입을 지정하여 쓸 수 있도록 함.
	//제너릭을 사용하는 이유는
	//=>컴파일 단계에서 잘못된 타입 사용될 수 있는 문제 제거 가능
	
	public void test2() {
		//ArrayList를 학습.-> CRUD와 크기.
		//ArrayList 인스턴스를 생성
		ArrayList<Integer> list = new ArrayList<Integer>();
		//삽입 삽입을 할 때 해당 리스트의 마지막에 삽입된다.
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		int size = list.size();//크기
		System.out.println(size);
		this.printList(list);
		//변경
		list.set(1, new Integer(20));//int->int
		//list.set(1, "20");//int->String 
		//제너릭으로 Integer만 다루기로 약속했는데 스트링으로 들어오기때문에 오류를 알려줌.
		this.printList(list);
		//삭제
		list.remove(1);
		this.printList(list);
		
	}
	
	public void test3() {
		//ArrayList를 학습.-> CRUD와 크기.
		//ArrayList 인스턴스를 생성
		ArrayList<Integer> list = new ArrayList<Integer>();
		//삽입 삽입을 할 때 해당 리스트의 마지막에 삽입된다.
		//list.add(new Integer(1));
		list.add(1); //-> 1을 JVM에서 new Integer(1)로 바꿔준다.
		//이걸 boxing
		list.add(2);
		list.add(3);
		int size = list.size();//크기
		System.out.println(size);
		this.printList2(list);
		//변경
		list.set(1, new Integer(20));//int->int
		//list.set(1, "20");//int->String 
		//제너릭으로 Integer만 다루기로 약속했는데 스트링으로 들어오기때문에 오류를 알려줌.
		this.printList2(list);
		//삭제
		list.remove(1);
		this.printList2(list);
		
	}
	//int --> Integer / char -->Charactor
	//wrappting 클래스 확인 하기.
	public void printList2(ArrayList<Integer> list) {
		for(int i=0; i<list.size(); i++) {
			int temp = list.get(i);//조회
			//unboxing
			System.out.println(temp);
		}
	}

	
	public void printList(ArrayList list) {
		for(int i=0; i<list.size(); i++) {
			Integer integer = (Integer)list.get(i);//조회
			//저장할 때 object 타입으로 프로모션이 되서 Integer로 캐스팅해준다.
			int temp = integer.intValue();
			System.out.println(temp);
		}
	}
}
