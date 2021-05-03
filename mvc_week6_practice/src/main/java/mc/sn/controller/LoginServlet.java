package mc.sn.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mc.sn.dao.UserDAO;
import mc.sn.vo.LoginVO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Login Served at: ").append(request.getContextPath());
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println(id+","+pw);
		UserDAO dao = new UserDAO();
		LoginVO vo = dao.checkMember(id, pw);
		
		HttpSession storage = request.getSession();
		storage.setAttribute("vo", vo);
		response.sendRedirect("./page/result.jsp");
		System.out.println(vo.getId()+","+vo.getName()+","+vo.getPwd());

	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
