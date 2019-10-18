package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginCon
 */
@WebServlet("/LoginCon")
public class LoginCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCon() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		String mId = request.getParameter("mID");
		String mPW = request.getParameter("mPW");
		
		out.print("mId :" + mId);
		out.print("mPW :" + mPW);
		
		Cookie[] cookies = request.getCookies();
		Cookie cookie = null;
		
		
		//��Ű �˻�
		for(Cookie c : cookies) {
			System.out.println("name"+c.getName()+"value"+c.getValue());
			
			if(c.getName().equals("memberId")) {
				cookie = c;
			}
			
		}
		//��Ű�� ������� ����
		if(cookie == null) {
			System.out.println("cookie is null");
			cookie = new Cookie("memberId", mId);
		}
		
		response.addCookie(cookie);
		cookie.setMaxAge(60*60);//(��Ű�� ����ð� �ð���*Ƚ��)
		
		response.sendRedirect("loginOK.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
