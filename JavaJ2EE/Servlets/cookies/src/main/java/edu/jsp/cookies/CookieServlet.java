 package edu.jsp.cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie")
public class CookieServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		Cookie c1 = new Cookie("email", email);
		c1.setMaxAge(60*60);
		resp.addCookie(c1);
		Cookie c2 = new Cookie("pass", pass);
		c2.setMaxAge(60*60);
		resp.addCookie(c2);
		resp.getWriter().print("<h1>Cookies added Successfully...!</h1>");
	}

}
