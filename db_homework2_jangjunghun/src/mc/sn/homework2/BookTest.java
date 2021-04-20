package mc.sn.homework2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookTest {
	private ArrayList<BookDTO> list;
	public BookTest() {
		list = new ArrayList<BookDTO>();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookTest bt = new BookTest();
		
		try {
			bt.makeBookData();
			for(BookDTO dto : bt.list) {
				bt.insertBook(dto);
			}
			bt.printBookData();

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void printBookData() throws ClassNotFoundException, SQLException {
		Connection con = this.getConnection();
		String sql = "SELECT * FROM bookTBL";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		System.out.println("*********************** 도서 목록 ***********************");
		while(rs.next()) {
			
			int isbn = rs.getInt("isbn");
			String title = rs.getString("title");
			String author = rs.getString("author");
			String publisher = rs.getString("publisher");
			int price = rs.getInt("price");
			String description = rs.getString("description");
			
			
			System.out.println(isbn+"\t| "+title+"\t| "+author+"\t| "+publisher+"\t| "+price+"\t| "+description);
		}	
		
		rs.close();
		pstmt.close();
		con.close();
		
	
	}
	
	public void insertBook(BookDTO book) throws SQLException, ClassNotFoundException{
		
		String sql = "INSERT INTO bookTBL VALUES(?,?,?,?,?,?)";
		Connection con = this.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setInt(1, book.getisbn());
		pstmt.setString(2, book.getTitle());
		pstmt.setString(3, book.getAuthor());
		pstmt.setString(4, book.getPublisher());
		pstmt.setInt(5, book.getPrice());
		pstmt.setString(6, book.getDesc());
		pstmt.executeUpdate();
		pstmt.close();
		con.close();
		
	}
	
	public void makeBookData() throws NumberFormatException, IOException {
			int[] isbnData = {21414,33455,55355,35332,35355};
			String[] titleData = {"Java Basic","JDBC Pro","Servlet/JSP","Android App","OOAD 분석,설계"};
			String[] authorData = {"김하나","김철수","박자바","홍길동","소나무"};
			String publisher = "Jaen.kr";
			int[] priceData = {15000,23000,41000,25000,30000};
			String[] descData = {"Java 기본 문법","","Model2 기반","Lightweight Framework",""};
			
			BookDTO dto; 
			
			for(int i=0; i<isbnData.length; i++) {
				dto = new BookDTO();
				dto.setisbn(isbnData[i]);
				dto.setTitle(titleData[i]);
				dto.setAuthor(authorData[i]);
				dto.setPublisher(publisher);
				dto.setPrice(priceData[i]);
				dto.setDesc(descData[i]);
	
				list.add(dto);
			}
			
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
