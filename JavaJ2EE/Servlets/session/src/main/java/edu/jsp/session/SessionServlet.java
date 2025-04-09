package edu.jsp.session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class SessionServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String mail = req.getParameter("mail");
		String pass = req.getParameter("pass");

		if (mail.equals("tom@gmail.com") && pass.equals("123")) {
			
			HttpSession httpSession = req.getSession();
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("/inbox");
			dispatcher.include(req, resp);
			
		}else {
			resp.getWriter().print("<h1>Invalid UserCredials...!</h1>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("index.html");
			dispatcher.include(req, resp);
		}

	}
}
