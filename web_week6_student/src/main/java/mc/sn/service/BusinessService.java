package mc.sn.service;

import java.sql.SQLException;
import java.util.ArrayList;

import mc.sn.dao.JobsDAO;

public class BusinessService {
	public ArrayList<String> checkWorkingDatabase() {
		//���̺� ��ü���� ������ ���ؼ� �� �پ� String���� �޾ƿͼ� ArrayList�� ���� ���̱� ������
		//��ȯ���� String���� ArrayList �������ιٲ�.
		//String line = null;
		ArrayList<String> line = null;
		//���ۿ��θ� ���̺��� �� �� ������ ���ڿ��� ����.
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
