package mc.sn.day14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GisaTest {
	private ArrayList<StudentDTO> list;
	public GisaTest() {
		list = new ArrayList<StudentDTO>();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GisaTest gt = new GisaTest();
		
//		try {
//			gt.makeGisaData();
//		} catch (NumberFormatException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			gt.makeGisaData();
			int answer = gt.quiz4();

			gt.printAnswer(4, answer);

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//���� ó���� ��
	}
	public void printAnswer(int number,int answer) throws IOException {
		String fileName = "C:\\dev\\workspace\\lecture_week3_student\\data\\Ans"+number+".txt";
		File file = new File(fileName);
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(answer);//answer�� ���� ���� ���� Ÿ���̸� String���� �޴´�.
		pw.close();
		fw.close();
		
	}
	
	public int quiz4() {
		//�������� + ��������Ʈ ���� 50 �̻��� �ڷ� �Ǽ��� ����Ͻÿ�.
		//�����ڵ� A-5/B-10/C-15
		int val = 50;
		int i=0;
		for(StudentDTO temp : list) {
			if(temp.getAccPoint().equals("A")||temp.getAccPoint().equals("B")) {
				int score = 0;
				if(temp.getLocalCode().equals("A")) {
					score = 5;
				}else if(temp.getLocalCode().equals("B")) {
					score = 10;
				}else if(temp.getLocalCode().equals("C")) {
					score = 15;
				}
				if((score+temp.getKor()) >= val) {
					i++;
				}
			}
		}
		System.out.println("quiz4 answer is"+i);
		return i;
	}
	
	public int quiz3() {
		//����+���� ������ 120�� �̻��� �л��� ������ 
		//�����ڵ忡 ���� ������������ ������ ���ϼ���.(�����ڵ� A-5/B-15/C-20)
		int val = 120;
		int sum = 0;
		
		for(StudentDTO temp : list) {
			int em = (temp.getEng()+temp.getMath());
			if(em>=val) {
				int score = 0;
				if(temp.getMgrCode().equals("A")) {
					score = 5+temp.getTotal();
				}else if(temp.getMgrCode().equals("B")) {
					score = 15+temp.getTotal();
				}else if(temp.getMgrCode().equals("C")) {
					score = 20+temp.getTotal();
				}
				sum = sum + score;
				
			}
//			else if(val == (temp.getEng()+temp.getMath())) {
//				System.out.println(temp.getStdNo());
//			}//120�� �� ��ġ�� �л��� �ִ��� Ȯ�� �غ�.
		}
		System.out.println("quiz3 answer is"+sum);
		return sum;
	}
	
	public int quiz2() {
		//System.out.println(list.size());
		//���������� B�̰� ����+���������� �ְ��� ������ ����Ͻÿ�.
//		int max = 0;
//		for(StudentDTO temp : list) {
//			if(temp.getLocalCode().equals("B")) {
//				if(max < (temp.getKor()+temp.getEng())) {
//					max = (temp.getKor()+temp.getEng());
//				}
//			}
//		}//���� § �ڵ�
		StudentDTO tempDTO = list.get(0);
		int max = tempDTO.getKor()+tempDTO.getEng();
		for(StudentDTO dto : list) {
			if(dto.getLocalCode().equals("B")) {
				int score = dto.getEng()+dto.getKor();
				if(max<score) {
					max = score;
				}
			}
		}//������� § �ڵ�
		
		System.out.println("quiz2 answer is"+max);
		return max;
		
	}
	
	public void makeGisaData() throws NumberFormatException, IOException {
		//���Ͽ� �����ؼ� �ش� ���� �о�ͼ� �Ʒ��� ���� �и��ؼ� ����Ʈ ����
		//���ʸ�
		File file = new File("C:\\dev\\data\\Abc1115.csv");
		
		if(file.exists()) {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr); 
			String line = null;
			while((line = br.readLine()) != null) {
				String temp = line;//"990001,addx, 17,29,16,49,43,154,C,A,C";
				String[] data = temp.split(",");
				StudentDTO dto = new StudentDTO();
				int i = Integer.parseInt(data[0]);
				dto.setStdNo(i);
				dto.setEmail(data[1]);
				i = Integer.parseInt(data[2].trim());//���⸦ �ڵ����� ó��.
				dto.setKor(i);
				dto.setEng(Integer.parseInt(data[3].trim()));
				dto.setMath(Integer.parseInt(data[4].trim()));
				dto.setSci(Integer.parseInt(data[5].trim()));
				dto.setHist(Integer.parseInt(data[6].trim()));
				dto.setTotal(Integer.parseInt(data[7].trim()));
				dto.setMgrCode(data[8]);
				dto.setAccPoint(data[9]);
				dto.setLocalCode(data[10]);
				//System.out.println(dto);
				list.add(dto);
			}
			br.close();
			fr.close();
		}
	}

}
