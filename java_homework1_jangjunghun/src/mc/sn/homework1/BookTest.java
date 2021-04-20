package mc.sn.homework1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BookTest {
	private ArrayList<BookDTO> list;
	public BookTest() {
		list = new ArrayList<BookDTO>();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookTest bt = new BookTest();
		try {
			bt.makeBookData();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bt.printBookData();
		
	}
	
	public void printBookData() {
		System.out.println("*********************** ���� ��� ***********************");
		for(BookDTO dto : list) {
			System.out.println(dto.toString());
		}
	}
	
	public void makeBookData() throws NumberFormatException, IOException {
			int[] isbnData = {21414,33455,55355,35332,35355};
			String[] titleData = {"Java Basic","JDBC Pro","Servlet/JSP","Android App","OOAD �м�,����"};
			String[] authorData = {"���ϳ�","��ö��","���ڹ�","ȫ�浿","�ҳ���"};
			String publisher = "Jaen.kr";
			int[] priceData = {15000,23000,41000,25000,30000};
			String[] descData = {"Java �⺻ ����","","Model2 ���","Lightweight Framework",""};
			
			BookDTO dto = null; 
			
			for(int i=0; i<isbnData.length; i++) {
				dto = new BookDTO();
				dto.setisbn(isbnData[i]);
				dto.setTitle(titleData[i]);
				dto.setAuthor(authorData[i]);
				dto.setPublisher(publisher);
				dto.setPrice(priceData[i]);
				dto.setDesc(descData[i]);
	
				list.add(dto);
			}
	}

}
