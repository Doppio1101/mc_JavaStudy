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
		//�����ڵ� �ۼ�
		String jdbcurl = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.OracleDriver";
		String id = "hr";
		String pw = "1234";
		Class.forName(driver); // ����̹� �ε�
		Connection con = DriverManager.getConnection(jdbcurl, id, pw);
		//Ŀ�ؼ� ����.(����)
		
//		con.close();//(��������) return ������ �� ���� close�ϸ� �ȵ�.
		return con;
	}
	public void testQuery() throws ClassNotFoundException, SQLException {
		//DML�ڵ� �ۼ��ϼ���(Insert, Delete, Update)
		//Ŀ�ؼ��� testConnecDB�κ��� �޾ƿ´�.
		Connection con = this.testConnectDB();
		//������ ������ ��θ� ������ �Ѵ�.
		
		Statement stmt = con.createStatement();
		//new�� ������� �ʴ� ����. -> Ŀ�ؼ����κ��� ��Ʈ���� ���´�.
		String sql = "INSERT INTO gisaTBL values(11�� �� �־�ߵ�.)";
		int affectedCount = stmt.executeUpdate(sql);
		//���̺� ������ ����� int������ �Ǻ����� ���������� �ٲ������ 1�̻�
		if(affectedCount > 0) {
			
		}else {
			
		}
		stmt.close();
		con.close();
	}
	public void testQuery2() {
		String sql = "INSERT INTO gisaTBL values(?,?,?,?,?,?,?,?,?,?,?)";
		//DML�ڵ� �ۼ��ϼ���(Insert, Delete, Update)
		//Ŀ�ؼ��� testConnecDB�κ��� �޾ƿ´�.
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = this.testConnectDB();
			//������ ������ ��θ� ������ �Ѵ�.
			
			
			pstmt = con.prepareStatement(sql);
			//new�� ������� �ʴ� ����. -> Ŀ�ؼ����κ��� ��Ʈ���� ���´�.
			pstmt.setInt(0, 0);
			pstmt.setString(1, "");
			int affectedCount = pstmt.executeUpdate();
			//���̺� ������ ����� int������ �Ǻ����� ���������� �ٲ������ 1�̻�
			if(affectedCount > 0) {
				
			}else {
				
			}
		}catch(ClassNotFoundException ce) {
			
		}catch(SQLException se) {
			
		}finally {//try���� ���θ� ������ ������ �����ؾ���.
			try {
				pstmt.close();
				con.close();
			}catch(SQLException se) {
				
			}
		}
	}
	
}
