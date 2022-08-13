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
import javax.servlet.http.HttpSession;

@WebServlet("/booktickets")
public class BookTickets extends HttpServlet {
	private static final long serialVersionUID = 1L;

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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String Source = request.getParameter("source");
		String DOT = request.getParameter("dateoftravel");
		String destination = request.getParameter("destination");
		String persons = request.getParameter("noofpersons");
		String name = request.getParameter("flight");
		try (PreparedStatement statement = connection
				.prepareStatement("select * from flight where source= ? and destination= ? and name= ? and date= ?");) {

			statement.setString(1, Source);
			statement.setString(2, destination);
			statement.setString(3, name);
			statement.setString(4, DOT);

			ResultSet results = statement.executeQuery();
			PrintWriter out = response.getWriter();

			int person = Integer.parseInt(persons);

			String Source1, DOT1, destination1, name1;
			int ticket_price = 0;

			while (results.next()) {
				Source1 = results.getString(1);
				DOT1 = results.getString(2);
				destination1 = results.getString(3);
				name = results.getString(4);
				ticket_price = results.getInt(5);
			}
			int total = person * ticket_price;
			System.out.println(total);
			
			
			response.setContentType("text/html");

			out.println("The total Amout is:" + total);
			out.println("the final amount is ok for you ypo continue");
			out.println("<p><a href=\"personaldetails.html\">Personal Details</a></p>");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		String Source = request.getParameter("source");
//		String DOT = request.getParameter("dateoftravel");
//		String destination = request.getParameter("destination");
//		String persons = request.getParameter("noofpersons");
//		String name = request.getParameter("flight");
//		HttpSession session = request.getSession();
//		session.setAttribute("source", Source);
//		session.setAttribute("dateoftravel", DOT);
//		session.setAttribute("destination",destination );
//		session.setAttribute("noofpersons", persons);
//		session.setAttribute("flight", name);

		doGet(request, response);
	}

	@Override
	public void destroy() {
		try {
			System.out.println("LoginSevlet.destroy() method. DB connection closed");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
