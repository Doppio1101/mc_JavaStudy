package mc.sn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import mc.sn.mgr.ConnectionManager;
import mc.sn.vo.LoginVO;

public class UserDAO {
	public LoginVO checkMember(String id, String pwd) {
		System.out.println(id+","+pwd);

		LoginVO vo = null;
		String sql = "select USERNAME,USERID,BIRTHYEAR from USERTBL where USERID = '"+id+"' AND BIRTHYEAR ="+Integer.parseInt(pwd);	
		//매개변수를 sql문에 직접 넣는 방법
//		String sql = "select USERNAME,USERID,BIRTHYEAR from USERTBL where USERID = '?' AND BIRTHYEAR = ?";		

		Connection con = ConnectionManager.getConnection();
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		try {
			pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, id.trim());
//			pstmt.setInt(2, Integer.parseInt(pwd));
			rs = pstmt.executeQuery();
			while(rs.next()) {
			vo = new LoginVO(rs.getString("USERNAME").trim(),rs.getString("USERID").trim(),rs.getString("BIRTHYEAR"));
			//name id pwd
			}
			ConnectionManager.closeConnection(con, pstmt, rs);
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return vo;
		}
	
}
