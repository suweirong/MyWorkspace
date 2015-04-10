package com.demo.easymock.one;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SampleServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if ("test".equals(username) && "123456".equals(password)) {
			ServletContext context = getServletContext();
			RequestDispatcher dispatcher = context.getRequestDispatcher("dispather");
			dispatcher.forward(request, response);
		} else {
			throw new RuntimeException("Login error");
		}

	}

}
