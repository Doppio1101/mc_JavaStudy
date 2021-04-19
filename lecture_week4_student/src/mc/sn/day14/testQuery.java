package mc.sn.day14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;




public class testQuery {
	private ArrayList<StudentDTO> list;
	//�⺻ ������ ���� list �ν��Ͻ� �����ؼ� �Ҵ��ϴ� �ڵ� �ۼ��Ͻÿ�.
	public testQuery() {
		
		list = new ArrayList<StudentDTO>();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testQuery tq = new testQuery();
		try {
			tq.query5();
			tq.quiz2();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		testQuery gt = new testQuery();
		
	}
	
	public void makeGisaData() throws NumberFormatException, IOException {
		//���Ͽ� �����ؼ� �ش� ���� �о�ͼ� �Ʒ��� ���� �и��ؼ� ����Ʈ ����
		//���ʸ�
		File file = new File("C:\\dev\\workspace\\data\\Abc1115.csv");
		
		if(file.exists()) {
//			System.out.println("���� ����");
			FileReader fr = new FileReader(file); //IOExeption�� ���� �� ����.
			BufferedReader br = new BufferedReader(fr); //IOExeption�� ���� �� ����. 
			String line = null;
			while((line = br.readLine()) != null) {
				String temp = line;//"990001,addx, 17,29,16,49,43,154,C,A,C";
				String[] data = temp.split(",");
				StudentDTO dto = new StudentDTO();
				int i = Integer.parseInt(data[0]);
				dto.setStdNo(i);
				dto.setEmail(data[1]);
				i = Integer.parseInt(data[2].trim());//���⸦ �ڵ����� ó��.
				dto.setKor(i);
				dto.setEng(Integer.parseInt(data[3].trim())); //Integer.parseInt�̷��Ը� ������
				dto.setMath(Integer.parseInt(data[4].trim())); //NumberFormatException�� �߻��� �� ����.
				dto.setSci(Integer.parseInt(data[5].trim()));
				dto.setHist(Integer.parseInt(data[6].trim()));
				dto.setTotal(Integer.parseInt(data[7].trim()));
				dto.setMgrCode(data[8]);
				dto.setAccPoint(data[9]);
				dto.setLocalCode(data[10]);
				//System.out.println(dto);
				list.add(dto);
			}
			br.close();
			fr.close();
		}
//		else {
//			System.out.println("���� ����xxxx");
//
//		}
	}
	public void quiz2() throws ClassNotFoundException, SQLException {
		//��� ���̺��� ������ ��ȸ
		//�����ڵ尡 B�̰� ����+���� ������ �ִ��� �� ��ȸ
		String sql = "select max(kor+eng) from gisaTBL "
								+ "where localcode = ?";
		
		Connection con = this.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, "B");
		
		ResultSet rs = pstmt.executeQuery();//����Ÿ���� ���̺��� ó���� �� �ִ� Ÿ���̾�� �Ѵ�.
		//�װ� ResultSet
		//���̺� ó�� ���
		while(rs.next()) {
			
			int stdNo = rs.getInt(1);
			
			System.out.println("max value is"+stdNo);
		}//���� ����� �𸥴� -> �츮�� ���� ������ �� ����
		//rs.next()�� �ϸ� ���� �࿡ �����Ͱ� ���� ��, false�� ��ȯ��.
		// ���� ���ο� ������ ������ True
		rs.close();
		pstmt.close();
		con.close();
	}

	
	
	public void query5() throws ClassNotFoundException, SQLException {
		//��� ���̺��� ������ ��ȸ
		//�����ڵ尡 B�̰� ����+���� ������ �ִ��� �� ��ȸ
		String sql = "select stdNo,email,kor,eng from gisaTBL "
								+ "where localcode = ?";
		
		Connection con = this.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, "B");
		
		ResultSet rs = pstmt.executeQuery();//����Ÿ���� ���̺��� ó���� �� �ִ� Ÿ���̾�� �Ѵ�.
		//�װ� ResultSet
		//���̺� ó�� ���
		while(rs.next()) {
			
			int stdNo = rs.getInt("stdNo");
			String email = rs.getString("email");
			int kor = rs.getInt("kor");
			int eng = rs.getInt("eng");
			
			System.out.println(stdNo+","+email+","+kor+","+eng);
		}//���� ����� �𸥴� -> �츮�� ���� ������ �� ����
		//rs.next()�� �ϸ� ���� �࿡ �����Ͱ� ���� ��, false�� ��ȯ��.
		// ���� ���ο� ������ ������ True
		rs.close();
		pstmt.close();
		con.close();
	}
	
	public void query4() throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		//������ õ �� �Էºκ����� �̹� ����Ͱ� ��ġ�⶧���� �ּ�ó��.
		//this.makeGisaData();
		System.out.println(list.size());
		//gisaTBL�� �� ���� ���� ����.
		//StudentDTO dto = list.get(1);//�̹� ���� �ٲ�� �� -> ������
		Connection con = this.getConnection();
		String sql = "INSERT INTO gisaTBL VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		//psstmt�� �����Ǹ鼭 "INSERT INTO gisaTBL VALUES ()"; �̰� �����ϵȴ�.
		// �̶� ������ �� ������ ����̵� ������� �Է��� �����ϴ�.
		// �Է��� �����ʹ� ����ǥ�� ǥ���Ѵ�.
		// ���뵵�ΰ� ����ٰ� �����ϸ� �ȴ�. 
		//�� ���θ� ���� ������ �����͸� ���� �����Ѵ�.
		for(StudentDTO dto : list) {
			pstmt.setInt(1, dto.getStdNo());
			pstmt.setString(2, dto.getEmail());
			pstmt.setInt(3, dto.getKor());
			pstmt.setInt(4, dto.getEng());
			pstmt.setInt(5, dto.getMath());
			pstmt.setInt(6, dto.getSci());
			pstmt.setInt(7, dto.getHist());
			pstmt.setInt(8, dto.getTotal());
			pstmt.setString(9, dto.getMgrCode());
			pstmt.setString(10, dto.getAccPoint());
			pstmt.setString(11, dto.getLocalCode());
			//��Ű�� Ÿ�԰� ���� ���� �־��ְ� �ƴ� ���� ƨ���.
			//System.out.println(sql);
		//		Statement stmt = con.createStatement();
		//		stmt.executeUpdate(sql);
		//		stmt.close();
		//		con.close();
				
			//�������� �ٸ� ������ Ÿ���� ���� �� ������ ������
			// ��ü�� ���� ���ϰ�, �Ź� �������� �Ǵ� �������� �ִ�.
			//�׷��� Statement�� ��ӹ޴� ���� �ִ�.
			int affectedCount = pstmt.executeUpdate();
			if(affectedCount > 0) {
				System.out.println("�Է¿Ϸ�");
			}else {
				System.out.println("�Է½���");
			}
		}
		pstmt.close();
		con.close();
		
	}	
	
	public void query3() throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		
		this.makeGisaData();
		System.out.println(list.size());
		//gisaTBL�� �� ���� ���� ����.
		StudentDTO dto = list.get(1);//�̹� ���� �ٲ�� �� -> ������
		Connection con = this.getConnection();
		String sql = "INSERT INTO gisaTBL VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		//psstmt�� �����Ǹ鼭 "INSERT INTO gisaTBL VALUES ()"; �̰� �����ϵȴ�.
		// �̶� ������ �� ������ ����̵� ������� �Է��� �����ϴ�.
		// �Է��� �����ʹ� ����ǥ�� ǥ���Ѵ�.
		// ���뵵�ΰ� ����ٰ� �����ϸ� �ȴ�. 
		//�� ���θ� ���� ������ �����͸� ���� �����Ѵ�.
		pstmt.setInt(1, dto.getStdNo());
		pstmt.setString(2, dto.getEmail());
		pstmt.setInt(3, dto.getKor());
		pstmt.setInt(4, dto.getEng());
		pstmt.setInt(5, dto.getMath());
		pstmt.setInt(6, dto.getSci());
		pstmt.setInt(7, dto.getHist());
		pstmt.setInt(8, dto.getTotal());
		pstmt.setString(9, dto.getMgrCode());
		pstmt.setString(10, dto.getAccPoint());
		pstmt.setString(11, dto.getLocalCode());
		//��Ű�� Ÿ�԰� ���� ���� �־��ְ� �ƴ� ���� ƨ���.
		//System.out.println(sql);
//		Statement stmt = con.createStatement();
//		stmt.executeUpdate(sql);
//		stmt.close();
//		con.close();
		
		//�������� �ٸ� ������ Ÿ���� ���� �� ������ ������
		// ��ü�� ���� ���ϰ�, �Ź� �������� �Ǵ� �������� �ִ�.
		//�׷��� Statement�� ��ӹ޴� ���� �ִ�.
		int affectedCount = pstmt.executeUpdate();
		if(affectedCount > 0) {
			System.out.println("�Է¿Ϸ�");
		}else {
			System.out.println("�Է½���");
		}
		pstmt.close();
		con.close();
		
	}
	
	public void query2() throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		
		this.makeGisaData();
		System.out.println(list.size());
		//gisaTBL�� �� ���� ���� ����.
		StudentDTO temp = list.get(0);
		Connection con = this.getConnection();
		String sql = "INSERT INTO gisaTBL VALUES (";
		StringBuffer sb = new StringBuffer(sql);
		sb.append(temp.getStdNo()+",'");
		sb.append(temp.getEmail()+"',");
		sb.append(temp.getKor()+",");
		sb.append(temp.getEng()+",");
		sb.append(temp.getMath()+",");
		sb.append(temp.getSci()+",");
		sb.append(temp.getHist()+",");
		sb.append(temp.getTotal()+",'");
		sb.append(temp.getMgrCode()+"','");
		sb.append(temp.getAccPoint()+"','");
		sb.append(temp.getLocalCode()+"')");
		sql= sb.toString();
//		String sql = "INSERT INTO gisaTBL VALUES ("+
//				temp.getStdNo()+",'"+
//				temp.getEmail()+"',"+
//				temp.getKor()+","+
//				temp.getEng()+","+
//				temp.getMath()+","+
//				temp.getSci()+","+
//				temp.getHist()+","+
//				temp.getTotal()+",'"+
//				temp.getMgrCode()+"','"+
//				temp.getAccPoint()+"','"+
//				temp.getLocalCode()+"')";
		//�̷��� �ۼ��ص� ������µ� ���۸� �̿��ؼ� �־��ִ� �� �� ����.
		//�޸� ������ �����.
		System.out.println(sql);
//		Statement stmt = con.createStatement();
//		stmt.executeUpdate(sql);
//		stmt.close();
//		con.close();
		Statement stmt = con.createStatement();
		//�������� �ٸ� ������ Ÿ���� ���� �� ������ ������
		// ��ü�� ���� ���ϰ�, �Ź� �������� �Ǵ� �������� �ִ�.
		//�׷��� Statement�� ��ӹ޴� ���� PreparedStatement�� �ִ�.
		int affectedCount = stmt.executeUpdate(sql);
		if(affectedCount > 0) {
			System.out.println("�Է¿Ϸ�");
		}else {
			System.out.println("�Է½���");
		}
		stmt.close();
		con.close();
		
	}
	
	public void query1() throws ClassNotFoundException, SQLException {
		Connection con = this.getConnection();
		String sql = "INSERT INTO testTBL2(id, userNAME) "
				+ "VALUES(5, 200)";
//		int i = 1;
//		String sql = "INSERT INTO testTBL2(id, userNAME) "
//				+ "VALUES("+i+", 200)"; ȿ���� ���� ����
		//id�� 2���� userNAME�� lee�� �����ϴ� ������ �ۼ�.
		sql = "UPDATE testTBL2 SET userNAME = 'lee' WHERE id = 2";
		//userNAME�� ������ �ڷḦ ��� �����ϴ� ���� �ۼ�.
		sql = "DELETE FROM testTBL2 WHERE userNAME = '200'";
//		Statement stmt = con.createStatement();
//		int affectedCount = stmt.executeUpdate(sql);
//		if(affectedCount > 0) {
//			System.out.println("�Է¿Ϸ�");
//		}else {
//			System.out.println("�Է½���");
//		}
//		stmt.close();
//		con.close();
	}
	
	
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Connection con = null;
		String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.OracleDriver";
		String id = "hr";
		String pwd = "1234";
		
		
		Class.forName(driver);
		con = DriverManager.getConnection(jdbcURL, id, pwd);
		if(con!=null) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		return con;
		
	}

}
