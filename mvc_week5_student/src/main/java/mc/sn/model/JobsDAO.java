package mc.sn.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JobsDAO {
	//�����ͺ��̽��� ���Ͽ� CRUD �۾�
	public String selectJobs() throws SQLException {
		String info = null;
		String sql = "select * from jobs";
		Connection con = ConnectionManager.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			info = rs.getString(1)+","+rs.getString(2)+","+rs.getString(3);
			break;
		}
//		rs.close();
//		stmt.close();
//		con.close();
		ConnectionManager.closeConnection(con, stmt, rs);
		// �޼ҵ带 ���� ���� ��Ʈ�� Ŀ�ؼ� �޴����� �� �� �� �ֵ��� �۾��� ����.
		// �ڱ� å�Ӽ��� ��Ģ�� ��Ű������ ����, ȸ���� Ŀ�ؼ� �Ŵ����� �� �� �ֵ��� ��.
		return info;
	}
}