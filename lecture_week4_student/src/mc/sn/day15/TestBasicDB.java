package mc.sn.day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestBasicDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBasicDB tbdb = new TestBasicDB();
		try {
			tbdb.selectGisaTable2();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void selectGisaTable() throws ClassNotFoundException, SQLException {
		//gisaTBL 테이블에 접속하여 모든 내용을 조회하여 출력하는 코드 작성
		
		Connection con = this.getConnection();
		Statement stmt = con.createStatement();
		String sql = "select * from gisaTBL";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			int stdNo = rs.getInt("stdNo");
			String email = rs.getString("email");
			//쭉쭉11개 다 작성
			System.out.println(stdNo+","+email);
		}
		
		rs.close();
		stmt.close();
		con.close();
		
	}
	
	public void selectGisaTable2() throws ClassNotFoundException, SQLException {
		//gisaTBL 테이블에 접속하여 모든 내용을 조회하여 출력하는 코드 작성
		
		Connection con = this.getConnection();		
		String sql = "select * from gisaTBL where localCode = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		//요청에 따른 데이터 제공. sql 문을 가지고 미리 전송함 
		pstmt.setString(1, "B");
		//쿼리 요청 결과 획득
		ResultSet rs =  pstmt.executeQuery();
		//위에서 con.prepareStatement(sql)로 보냈기 때문에 sql을 안 보내도 된다.
		while(rs.next()) {
			int stdNo = rs.getInt("stdNo");
			String email = rs.getString("email");
			String localCode = rs.getString("localCode");
			//쭉쭉11개 다 작성
			System.out.println(stdNo+", "+email+" ==> "+localCode );
		}
		
		rs.close();
		pstmt.close();
		con.close();
		
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.OracleDriver";
		String id = "hr";
		String pw = "1234";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, id, pw);
		return con;
	}

}
