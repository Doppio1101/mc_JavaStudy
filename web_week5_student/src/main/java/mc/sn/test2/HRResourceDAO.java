package mc.sn.test2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HRResourceDAO {
	public String selectJobs() throws ClassNotFoundException, SQLException {
		String line = null;
		String sql = "select * from jobs";
		BookTest bt = new BookTest();
		Connection con = bt.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			line = rs.getString(1) + ","+rs.getString(2) + ","+rs.getString(3);
			break;
		}
		rs.close();
		stmt.close();
		con.close();
		
		return line;
	}
}
