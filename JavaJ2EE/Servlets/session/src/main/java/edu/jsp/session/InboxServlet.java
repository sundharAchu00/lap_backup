package edu.jsp.session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/inbox")
public class InboxServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		HttpSession session = req.getSession(false);
		
		if (session != null) {
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("inbox.html");
			dispatcher.forward(req, resp);
		} else {
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("index.html");
			dispatcher.forward(req, resp);
		}
	}
}
