package mc.sn.day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMap tm = new TestMap();
		tm.test3();
	}
	
	public void test1() {
		//HashMap --> 인스턴스 생성
		HashMap map = new HashMap();
		map.put("one", new Integer(1));
		map.put("two", new Integer(2));
		map.put("three", new Integer(3));
		map.put("four", "4");

		int size = map.size();
		System.out.println(size);
		Integer i1 = (Integer)map.get("one");//캐스팅
		int r = i1.intValue();
		System.out.println(r);
		map.put("two", new Integer(20));//신규가 아니라 수정이다.
		Integer i2 = (Integer)map.get("two");
		int r2 = i2.intValue();
		System.out.println(r2);
		map.remove("two");
		size = map.size();
		System.out.println(size);
		i2 = (Integer)map.get("two");
		r2 = i2.intValue();
		System.out.println(r2);
	}
	public void test2() {
		//HashMap --> 인스턴스 생성
		//제너릭을 포함한 HashMap
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("one", new Integer(1));
		map.put("two", new Integer(2));
		map.put("three", new Integer(3));
		//map.put("four", "4");//제너릭에 맞지않아서 오류

		int size = map.size();
		System.out.println(size);
		Integer i1 = map.get("one");
		int r = i1.intValue();
		System.out.println(r);
		map.put("two", new Integer(20));//신규가 아니라 수정이다.
		Integer i2 = map.get("two");
		int r2 = i2.intValue();
		System.out.println(r2);
		map.remove("two");
		size = map.size();
		System.out.println(size);
		i2 = map.get("two");
		r2 = i2.intValue();
		System.out.println(r2);
	}
	
	public void test3() {
		//HashMap --> 인스턴스 생성
		//제너릭을 포함한 HashMap
		//1과 new Integer(1)을 처리 boxing
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		//map.put("four", "4");//에러

		int size = map.size();
		System.out.println(size);
//		Integer i1 = map.get("one");
//		int r = i1.intValue();
		int r = map.get("one"); //unboxing
		System.out.println(r);
		map.put("two", 20);//신규가 아니라 수정이다.
		int r2 = map.get("two");
		System.out.println(r2);
		map.remove("two");
		size = map.size();
		System.out.println(size);
//		r2 = map.get("two");
//
//		System.out.println(r2);
		this.printAll(map);
	}
	public void printAll(HashMap<String, Integer> map) {
		Set<String> keys = map.keySet();
		//키만 전부 셋형식으로 뽑아오는 것. Set은 중복 없고 순서도 없음
		Iterator<String> iter = keys.iterator();
		//한 줄로 새울 수 있음. 이터레이터 객체로 만듦
		while(iter.hasNext()) {
			//다음값이 있는지 확인
			String key = iter.next();
			Integer value = map.get(key);
			System.out.println(key+"\t"+value);
		}
	}
	
}
