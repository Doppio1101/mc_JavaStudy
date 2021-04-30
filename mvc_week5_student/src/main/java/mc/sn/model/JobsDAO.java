package mc.sn.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JobsDAO {
	//데이터베이스에 대하여 CRUD 작업
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
		// 메소드를 만들어서 연결 파트를 커넥션 메니저가 다 할 수 있도록 작업을 나눔.
		// 자기 책임성의 원칙을 지키기위해 연결, 회수를 커넥션 매니저가 할 수 있도록 함.
		return info;
	}
}
