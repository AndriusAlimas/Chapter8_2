package com.example.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import foo.other.*;


public class MyController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String p_name = request.getParameter("person_name");
		Person person = new Person();
		
		// to see  result we need change scope to different than bean object:
		HttpSession session = request.getSession();
		session.setAttribute("person_object", (Object) person);
		
		RequestDispatcher rd = request.getRequestDispatcher("go.jsp");
		rd.forward(request, response);
	}
}
