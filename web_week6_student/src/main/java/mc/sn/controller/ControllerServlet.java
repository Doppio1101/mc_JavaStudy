package mc.sn.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mc.sn.service.BusinessService;

public class ControllerServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init");
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("work");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<h1>Welcome! Servlet</h1>");
		BusinessService bs = new BusinessService();
		//String result = bs.checkWorkingDatabase();
		ArrayList<String> result = bs.checkWorkingDatabase();
		if(result != null) {
			out.print("db is working");
		}else {
			out.print("db is not working");
		}
		HttpSession session = req.getSession();
		session.setAttribute("result", result);
		//�տ����� Ű������ �ڿ��Ÿ� ���ǿ� �־���´�. �ڿ����� ������ƮŸ��
		resp.sendRedirect("./day27/output_view.jsp"); 
		//���� �Ķ���Ͱ� url�� �����ǵ�
		//������ ����̶�� �͵� �ִ�.
	}
	
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}
}
