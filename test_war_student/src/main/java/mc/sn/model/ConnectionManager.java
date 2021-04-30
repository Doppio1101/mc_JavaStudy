package mc.sn.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {
	public static Connection getConnection() {
		Connection con = null;
		String jdbcurl = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.OracleDriver";
		String id ="hr";
		String pwd = "1234";
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(jdbcurl,id,pwd);
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("connection problem");
			//e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("driver problem");
		} 
		
		
		
		
		
		return con;
	}
	
	public static void closeConnection(Connection con, Statement stmt, ResultSet rs) {
		try {
			if(rs != null) {
				rs.close();
			}
			if(stmt != null) {
				stmt.close();
			}
			if(con != null) {
				con.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
