package mc.sn.day9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFile {
	//��������� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFile tf = new TestFile();
	
		try {
			tf.connectFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void connectFile() throws IOException {
		//File �ν��Ͻ� ����
		File file = new File("C:\\dev\\data\\Abc1115.csv");
		if(file.exists()) {
			System.out.println(file.getName()+"�� �����մϴ�.");
			//FileReader �ν��Ͻ� ����
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			//FileReader�� �� �о� �� �Ÿ� ������ �ִٰ� �� �پ� �����ش�.
			String line = null;
			while((line = br.readLine()) !=null) {
				//readLine() �� �� ������ �о��
				System.out.println(line);
				break;
			}
			br.close();//�������� �� �ź��� �ݰ�
			fr.close();//ó�� �� �Ÿ� �ݴ´�.
		}else {
			System.out.println("������ ���� ���� �ʽ��ϴ�.");
		}
		//������ �ҷ����µ� ������ ���� ���� �ֱ� ������ ����ó���� ����� �Ѵ�.
		
	}

}
