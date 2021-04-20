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
		//gisaTBL ���̺� �����Ͽ� ��� ������ ��ȸ�Ͽ� ����ϴ� �ڵ� �ۼ�
		
		Connection con = this.getConnection();
		Statement stmt = con.createStatement();
		String sql = "select * from gisaTBL";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			int stdNo = rs.getInt("stdNo");
			String email = rs.getString("email");
			//����11�� �� �ۼ�
			System.out.println(stdNo+","+email);
		}
		
		rs.close();
		stmt.close();
		con.close();
		
	}
	
	public void selectGisaTable2() throws ClassNotFoundException, SQLException {
		//gisaTBL ���̺� �����Ͽ� ��� ������ ��ȸ�Ͽ� ����ϴ� �ڵ� �ۼ�
		
		Connection con = this.getConnection();		
		String sql = "select * from gisaTBL where localCode = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		//��û�� ���� ������ ����. sql ���� ������ �̸� ������ 
		pstmt.setString(1, "B");
		//���� ��û ��� ȹ��
		ResultSet rs =  pstmt.executeQuery();
		//������ con.prepareStatement(sql)�� ���±� ������ sql�� �� ������ �ȴ�.
		while(rs.next()) {
			int stdNo = rs.getInt("stdNo");
			String email = rs.getString("email");
			String localCode = rs.getString("localCode");
			//����11�� �� �ۼ�
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
