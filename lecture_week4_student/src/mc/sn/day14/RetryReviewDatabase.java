package mc.sn.day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RetryReviewDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void ConnectionDB() throws SQLException, ClassNotFoundException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "jdbc.oracle.OracleDriver";
		String id = "hr";
		String pw = "1234";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, id, pw);
		
		Statement stmt = con.createStatement();
		
	}

}
