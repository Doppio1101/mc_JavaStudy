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
		//앞에꺼를 키값으로 뒤에거를 세션에 넣어놓는다. 뒤에꺼는 오브젝트타입
		resp.sendRedirect("./day27/output_view.jsp"); 
		//내가 파라미터값 url로 보낼건데
		//포워드 방법이라는 것도 있다.
	}
	
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}
}
