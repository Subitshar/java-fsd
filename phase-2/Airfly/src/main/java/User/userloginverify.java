package User;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userloginverify")
public class userloginverify extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HomeServet Get...");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println(request.getAttribute("message"));
		out.println("<p><a href=\"changepassword.html\">Change password</a></p>");
		out.println("<p><a href=\"Userhome.html\">admin page</a></p>");
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HomeServet Post...");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println(request.getAttribute("message"));
		out.println("<p><a href=\"changepassword.html\">Change password</a></p>");
		out.println("<p><a href=\"Userhome.html\">admin page</a></p>");
	}

}