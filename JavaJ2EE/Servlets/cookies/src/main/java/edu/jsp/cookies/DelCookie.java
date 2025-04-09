package edu.jsp.cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deletecookie")
public class DelCookie extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie cookie[] = req.getCookies();
		
		for (Cookie c2 : cookie) {
			
			if (c2.getName().equals("pass")) {
				c2.setMaxAge(0);
				resp.addCookie(c2);
				resp.getWriter().print("<h1>Cookie Deleted Successfully...!</h1>");
			}
			
		}
		
	}
}
