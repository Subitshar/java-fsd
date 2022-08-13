package User;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/showflight")
public class Showflight extends HttpServlet {

	Connection connection;

	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
			ServletContext context = config.getServletContext();
			System.out.println("ReadUserSevlet.init() method. DB connection created");
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(context.getInitParameter("dburl"),
					context.getInitParameter("dbuser"), context.getInitParameter("dbpassword"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Source=request.getParameter("source");
		String DOT=request.getParameter("dateoftravel");
		String destination=request.getParameter("destination");
		String persons=request.getParameter("noofpersons");
		
		
		try (PreparedStatement statement = connection.prepareStatement("select * from flight where source= ? and destination= ? and date= ?");) {
			response.setContentType("text/html");

			statement.setString(1, Source);
			statement.setString(2,destination );
			statement.setString(3,DOT );
			

			ResultSet results = statement.executeQuery();
			PrintWriter out = response.getWriter();
			
			out.println("<table>");
			out.println("<tr>");
			out.println("<th>Source</th>");
			out.println("<th>Destination</th>");
			out.println("<th>Date</th>");
			out.println("<th>Name</th>");
			out.println("<th>Price</th>");
			out.println("</tr>");
			
			if (results.next()) {
				out.println("<tr>");
				out.println("<td>" + results.getString(1) + "</td>");
				out.println("<td>" + results.getString(2) + "</td>");
				out.println("<td>" + results.getString(3) + "</td>");
				out.println("<td>" + results.getString(4) + "</td>");
				out.println("<td>" + results.getInt(5) + "</td>");
				out.println("</tr>");
				out.println("</table>");
				out.println("<p><a href='PersonalDetails.html'>Book Now</a></p>");
			}
			else {
					out.println("<h1>No flights are available right now</h1>");
					out.println("<p><a href=userhome.html'>Home Page</a></p>");}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void destroy() {
		try {
			System.out.println("ReadUserSevlet.destroy() method. DB connection closed");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
