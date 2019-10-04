package com.servlet;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletEx
 */
@WebServlet("/servletEx")
public class servletEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("--- dopost ----");
		String name="hello";// = (String)request.getParameter("m_name");
		String password=null;//= (String)request.getAttribute("m_password");
		String[] hobby=null;// = null;

		System.out.println(name);
		System.out.println(password);

		//String name = request.getParameter("m_name");
		//String password = request.getParameter("m_password");
		//String[] hobby= request.getParameterValues("m_hobby");
		request.setAttribute("w_name", name);
		request.setAttribute("w_password", password);
		request.setAttribute("w_hobby", hobby);

		ServletContext context=getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher("/mSignUp.jsp");
		dispatcher.forward(request, response);
	}

}
