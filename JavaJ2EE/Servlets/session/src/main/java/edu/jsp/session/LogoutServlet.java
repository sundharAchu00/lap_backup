package edu.jsp.session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);
		
		if (session != null) {
			session.invalidate();
			resp.getWriter().print("<h1>Logout Successfully</h1>");
		} else {
			resp.getWriter().print("<h1>Sorry Your Not Loged in yet...</h1>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("inbox.html");
			dispatcher.include(req, resp);
		}
	}
}
