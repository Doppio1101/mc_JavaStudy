package mc.sn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mc.sn.test2.BookTest;
import mc.sn.test2.HRResourceDAO;

public class FirstServlet extends HttpServlet {
//서블릿은 실행 클래스 아님
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("init");
	}
	
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			System.out.println("get");
			this.doPost(req, resp);
		}
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			System.out.println("post");
			resp.setContentType("text/html");//html 형식으로 파일을 받을거야
			PrintWriter out = resp.getWriter();
//			out.print("<html>");
//			out.print("<head>");
			out.print("<style> h1{color:blue} </style>");
//			out.print("</head>");
//			out.print("<body>");
			out.print("<h1>Welcome! Servlet!</h1>");
//			out.print("</body>");
//			out.print("</html>");
			BookTest bt = new BookTest();
			try {
//				Connection con = bt.getConnection();
//				if(con!=null) {
//					out.print("connect");
//				}else {
//					out.print("fails");
//				}
//				con.close();
				HRResourceDAO dao = new HRResourceDAO();
				String line = dao.selectJobs();
				out.print(line);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	@Override
		public void destroy() {
			// TODO Auto-generated method stub
			super.destroy();
			System.out.println("destroy");
		}
}
