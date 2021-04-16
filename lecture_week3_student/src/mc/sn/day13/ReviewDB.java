package mc.sn.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ReviewDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReviewDB rdb = new ReviewDB();
		try {
			rdb.connectDB();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void connectDB() throws ClassNotFoundException, SQLException {
		//오라클에 접속하여 connection 인스턴스를 구하는 코드를 작성.
		String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.OracleDriver";
		String id = "hr";
		String pwd = "1234";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(jdbcURL, id, pwd);
		if(con!=null) {
			System.out.println("접속");
		}else {
			System.out.println("실패");
		}
		con.close();
	
	}

}
