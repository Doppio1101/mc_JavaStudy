package mc.sn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
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
			out.print("<html>");
			out.print("<head>");
			out.print("<style> h1{color:blue} </style>");
			out.print("</head>");
			out.print("<body>");
			out.print("<h1>Welcome! Servlet!</h1>");
			out.print("</body>");
			out.print("</html>");
	}
	@Override
		public void destroy() {
			// TODO Auto-generated method stub
			super.destroy();
			System.out.println("destroy");
		}
}
