package mc.sn.day8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestString {
	public static final int DATE_ALL = 0;
	public static final int DATE_ONLY = 1;
	public static final int TIME_ONLY = 2;
	public enum DateInfo{DATE_ALL,DATE_ONLY,TIME_ONLY};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestString ts = new TestString();
		//System.out.println("전체정보를");
		String now = ts.test1(TestString.TIME_ONLY);
		System.out.println(now);
		ts.test();
	}
	
	public void test() {
		String data = "kim,20,40,50";
		String[] score = data.split(",");
		System.out.println("size is "+score.length);
		for(int i=0; i<score.length; i++){
			System.out.println(score[i]);
		
		}
	}

	public String test(DateInfo type) {
		// type == 0->전체정보, 1->날짜정보, 2->시간정보
		String pattern = "yyyy/MM/dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String now = sdf.format(new Date());
		String[] tokens = now.split(" ");
		if(DateInfo.DATE_ONLY==type) {
			//now = now.split(" ")[0];
			now = tokens[0];
		}else if(DateInfo.TIME_ONLY == type) {
			//now = now.split(" ")[1];
			now = tokens[1];
		}
		
		
		
		//System.out.println(now);
		
		return now;
	}
	
	public String test1(int type) {
		// type == 0->전체정보, 1->날짜정보, 2->시간정보
		String pattern = "yyyy/MM/dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String now = sdf.format(new Date());
		String[] tokens = now.split(" ");
		if(type==1) {
			//now = now.split(" ")[0];
			now = tokens[0];
		}else if(type == 2) {
			//now = now.split(" ")[1];
			now = tokens[1];
		}
		
		
		
		//System.out.println(now);
		
		return now;
	}



}
