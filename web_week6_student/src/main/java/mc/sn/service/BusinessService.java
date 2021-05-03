package mc.sn.service;

import java.sql.SQLException;
import java.util.ArrayList;

import mc.sn.dao.JobsDAO;

public class BusinessService {
	public ArrayList<String> checkWorkingDatabase() {
		//테이블 전체값을 보내기 위해서 한 줄씩 String으로 받아와서 ArrayList에 넣을 것이기 때문에
		//반환값을 String에서 ArrayList 형식으로바꿈.
		//String line = null;
		ArrayList<String> line = null;
		//동작여부를 테이블의 한 행 정보를 문자열로 구성.
		JobsDAO dao = new JobsDAO();
		try {
			line = dao.selectJobs();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return line;
	}
	
}
