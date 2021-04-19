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
	//기본 생성자 만들어서 list 인스턴스 생성해서 할당하는 코드 작성하시오.
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
		//파일에 접속해서 해당 라인 읽어와서 아래와 같이 분리해서 리스트 저장
		//제너릭
		File file = new File("C:\\dev\\workspace\\data\\Abc1115.csv");
		
		if(file.exists()) {
//			System.out.println("파일 존재");
			FileReader fr = new FileReader(file); //IOExeption이 나올 수 있음.
			BufferedReader br = new BufferedReader(fr); //IOExeption이 나올 수 있음. 
			String line = null;
			while((line = br.readLine()) != null) {
				String temp = line;//"990001,addx, 17,29,16,49,43,154,C,A,C";
				String[] data = temp.split(",");
				StudentDTO dto = new StudentDTO();
				int i = Integer.parseInt(data[0]);
				dto.setStdNo(i);
				dto.setEmail(data[1]);
				i = Integer.parseInt(data[2].trim());//띄어쓰기를 자동으로 처리.
				dto.setKor(i);
				dto.setEng(Integer.parseInt(data[3].trim())); //Integer.parseInt이렇게만 있으면
				dto.setMath(Integer.parseInt(data[4].trim())); //NumberFormatException이 발생할 수 있음.
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
//			System.out.println("파일 존재xxxx");
//
//		}
	}
	public void quiz2() throws ClassNotFoundException, SQLException {
		//기사 테이블의 내용을 조회
		//지역코드가 B이고 국어+영어 점수가 최대인 것 조회
		String sql = "select max(kor+eng) from gisaTBL "
								+ "where localcode = ?";
		
		Connection con = this.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, "B");
		
		ResultSet rs = pstmt.executeQuery();//리턴타입이 테이블을 처리할 수 있는 타입이어야 한다.
		//그게 ResultSet
		//테이블 처리 방법
		while(rs.next()) {
			
			int stdNo = rs.getInt(1);
			
			System.out.println("max value is"+stdNo);
		}//행이 몇개인지 모른다 -> 우리가 넣은 정보일 때 말고
		//rs.next()를 하면 다음 행에 데이터가 없을 때, false를 반환함.
		// 다음 라인에 정보가 있으면 True
		rs.close();
		pstmt.close();
		con.close();
	}

	
	
	public void query5() throws ClassNotFoundException, SQLException {
		//기사 테이블의 내용을 조회
		//지역코드가 B이고 국어+영어 점수가 최대인 것 조회
		String sql = "select stdNo,email,kor,eng from gisaTBL "
								+ "where localcode = ?";
		
		Connection con = this.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, "B");
		
		ResultSet rs = pstmt.executeQuery();//리턴타입이 테이블을 처리할 수 있는 타입이어야 한다.
		//그게 ResultSet
		//테이블 처리 방법
		while(rs.next()) {
			
			int stdNo = rs.getInt("stdNo");
			String email = rs.getString("email");
			int kor = rs.getInt("kor");
			int eng = rs.getInt("eng");
			
			System.out.println(stdNo+","+email+","+kor+","+eng);
		}//행이 몇개인지 모른다 -> 우리가 넣은 정보일 때 말고
		//rs.next()를 하면 다음 행에 데이터가 없을 때, false를 반환함.
		// 다음 라인에 정보가 있으면 True
		rs.close();
		pstmt.close();
		con.close();
	}
	
	public void query4() throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		//데이터 천 개 입력부분으로 이미 만든것과 겹치기때문에 주석처리.
		//this.makeGisaData();
		System.out.println(list.size());
		//gisaTBL에 한 줄의 값을 삽입.
		//StudentDTO dto = list.get(1);//이미 있음 바꿔야 됨 -> 삭제함
		Connection con = this.getConnection();
		String sql = "INSERT INTO gisaTBL VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		//psstmt가 생성되면서 "INSERT INTO gisaTBL VALUES ()"; 이게 컴파일된다.
		// 이때 컴파일 한 번으로 몇번이든 상관없이 입력이 가능하다.
		// 입력할 데이터는 물음표로 표시한다.
		// 전용도로가 생긴다고 생각하면 된다. 
		//이 도로를 통해 보내질 데이터를 따로 정의한다.
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
			//스키마 타입과 맞을 때만 넣어주고 아닐 때는 튕긴다.
			//System.out.println(sql);
		//		Statement stmt = con.createStatement();
		//		stmt.executeUpdate(sql);
		//		stmt.close();
		//		con.close();
				
			//여러개의 다른 데이터 타입을 넣을 때 더럽게 나오고
			// 객체를 넣지 못하고, 매번 컴파일이 되는 불편함이 있다.
			//그래서 Statement를 상속받는 것이 있다.
			int affectedCount = pstmt.executeUpdate();
			if(affectedCount > 0) {
				System.out.println("입력완료");
			}else {
				System.out.println("입력실패");
			}
		}
		pstmt.close();
		con.close();
		
	}	
	
	public void query3() throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		
		this.makeGisaData();
		System.out.println(list.size());
		//gisaTBL에 한 줄의 값을 삽입.
		StudentDTO dto = list.get(1);//이미 있음 바꿔야 됨 -> 삭제하
		Connection con = this.getConnection();
		String sql = "INSERT INTO gisaTBL VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		//psstmt가 생성되면서 "INSERT INTO gisaTBL VALUES ()"; 이게 컴파일된다.
		// 이때 컴파일 한 번으로 몇번이든 상관없이 입력이 가능하다.
		// 입력할 데이터는 물음표로 표시한다.
		// 전용도로가 생긴다고 생각하면 된다. 
		//이 도로를 통해 보내질 데이터를 따로 정의한다.
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
		//스키마 타입과 맞을 때만 넣어주고 아닐 때는 튕긴다.
		//System.out.println(sql);
//		Statement stmt = con.createStatement();
//		stmt.executeUpdate(sql);
//		stmt.close();
//		con.close();
		
		//여러개의 다른 데이터 타입을 넣을 때 더럽게 나오고
		// 객체를 넣지 못하고, 매번 컴파일이 되는 불편함이 있다.
		//그래서 Statement를 상속받는 것이 있다.
		int affectedCount = pstmt.executeUpdate();
		if(affectedCount > 0) {
			System.out.println("입력완료");
		}else {
			System.out.println("입력실패");
		}
		pstmt.close();
		con.close();
		
	}
	
	public void query2() throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		
		this.makeGisaData();
		System.out.println(list.size());
		//gisaTBL에 한 줄의 값을 삽입.
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
		//이렇게 작성해도 상관없는데 버퍼를 이용해서 넣어주느 게 더 좋다.
		//메모리 문제가 생긴다.
		System.out.println(sql);
//		Statement stmt = con.createStatement();
//		stmt.executeUpdate(sql);
//		stmt.close();
//		con.close();
		Statement stmt = con.createStatement();
		//여러개의 다른 데이터 타입을 넣을 때 더럽게 나오고
		// 객체를 넣지 못하고, 매번 컴파일이 되는 불편함이 있다.
		//그래서 Statement를 상속받는 것이 PreparedStatement이 있다.
		int affectedCount = stmt.executeUpdate(sql);
		if(affectedCount > 0) {
			System.out.println("입력완료");
		}else {
			System.out.println("입력실패");
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
//				+ "VALUES("+i+", 200)"; 효율이 좋지 않음
		//id가 2번인 userNAME을 lee로 변경하는 쿼리를 작성.
		sql = "UPDATE testTBL2 SET userNAME = 'lee' WHERE id = 2";
		//userNAME이 유나인 자료를 모두 삭제하는 쿼리 작성.
		sql = "DELETE FROM testTBL2 WHERE userNAME = '200'";
//		Statement stmt = con.createStatement();
//		int affectedCount = stmt.executeUpdate(sql);
//		if(affectedCount > 0) {
//			System.out.println("입력완료");
//		}else {
//			System.out.println("입력실패");
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
			System.out.println("접속");
		}else {
			System.out.println("실패");
		}
		return con;
		
	}

}
