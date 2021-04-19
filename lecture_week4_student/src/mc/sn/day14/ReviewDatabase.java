package mc.sn.day14;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ReviewDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReviewDatabase rdb = new ReviewDatabase();
		try {
			rdb.testQuery();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection testConnectDB() throws ClassNotFoundException, SQLException {
		//접속코드 작성
		String jdbcurl = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.OracleDriver";
		String id = "hr";
		String pw = "1234";
		Class.forName(driver); // 드라이버 로딩
		Connection con = DriverManager.getConnection(jdbcurl, id, pw);
		//커넥션 갱성.(연결)
		
//		con.close();//(연결종료) return 형으로 될 때는 close하면 안됨.
		return con;
	}
	public void testQuery() throws ClassNotFoundException, SQLException {
		//DML코드 작성하세요(Insert, Delete, Update)
		//커넥션을 testConnecDB로부터 받아온다.
		Connection con = this.testConnectDB();
		//쿼리를 보내는 통로를 만들어야 한다.
		
		Statement stmt = con.createStatement();
		//new를 사용하지 않는 이유. -> 커넥션으로부터 스트림을 얻어온다.
		String sql = "INSERT INTO gisaTBL values(11개 값 넣어야됨.)";
		int affectedCount = stmt.executeUpdate(sql);
		//테이블에 영향을 줬는지 int형으로 판별가능 정상적으로 바뀌었으면 1이상
		if(affectedCount > 0) {
			
		}else {
			
		}
		stmt.close();
		con.close();
	}
	public void testQuery2() {
		String sql = "INSERT INTO gisaTBL values(?,?,?,?,?,?,?,?,?,?,?)";
		//DML코드 작성하세요(Insert, Delete, Update)
		//커넥션을 testConnecDB로부터 받아온다.
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = this.testConnectDB();
			//쿼리를 보내는 통로를 만들어야 한다.
			
			
			pstmt = con.prepareStatement(sql);
			//new를 사용하지 않는 이유. -> 커넥션으로부터 스트림을 얻어온다.
			pstmt.setInt(0, 0);
			pstmt.setString(1, "");
			int affectedCount = pstmt.executeUpdate();
			//테이블에 영향을 줬는지 int형으로 판별가능 정상적으로 바뀌었으면 1이상
			if(affectedCount > 0) {
				
			}else {
				
			}
		}catch(ClassNotFoundException ce) {
			
		}catch(SQLException se) {
			
		}finally {//try가능 여부를 떠나서 무조건 수행해야함.
			try {
				pstmt.close();
				con.close();
			}catch(SQLException se) {
				
			}
		}
	}
	
}
