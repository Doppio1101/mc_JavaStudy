package mc.sn.day9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFile {
	//파일입출력 연습
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
		//File 인스턴스 생성
		File file = new File("C:\\dev\\data\\Abc1115.csv");
		if(file.exists()) {
			System.out.println(file.getName()+"이 존재합니다.");
			//FileReader 인스턴스 생성
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			//FileReader가 쭉 읽어 온 거를 가지고 있다가 한 줄씩 보내준다.
			String line = null;
			while((line = br.readLine()) !=null) {
				//readLine() 한 줄 단위로 읽어라
				System.out.println(line);
				break;
			}
			br.close();//마지막에 연 거부터 닫고
			fr.close();//처음 연 거를 닫는다.
		}else {
			System.out.println("파일이 존재 하지 않습니다.");
		}
		//파일을 불러오는데 파일이 없을 수도 있기 때문에 예외처리를 해줘야 한다.
		
	}

}
