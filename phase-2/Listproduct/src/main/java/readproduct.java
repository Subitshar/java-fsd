

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class readproduct
 */
@WebServlet("/readproduct")
public class readproduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection connection;
	@Override
	public void init(ServletConfig config)  throws ServletException {
		try {
			ServletContext context=config.getServletContext();
			System.out.println("Readproduct.init() method. DB connection created");
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(context.getInitParameter("dburl"),
					context.getInitParameter("dbuser"), context.getInitParameter("dbpassword"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String productid=request.getParameter("productid");
		
		try (PreparedStatement statement = connection.prepareStatement("select * from product where productid=?")) {
			
			statement.setString(1,productid);

			ResultSet results = statement.executeQuery();
			PrintWriter out = response.getWriter();
			out.println("<table>");
			out.println("<tr>");
			out.println("<th>Product ID</th>");
			out.println("<th>Product Name</th>");
			out.println("<th>Product Price</th>");
			out.println("</tr>");
			while (results.next()) {
				out.println("<tr>");
				out.println("<td>" + results.getString(1) + "</td>");
				out.println("<td>" + results.getString(2) + "</td>");
				out.println("<td>" + results.getString(3) + "</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			out.println("<p><a href=\"list.html\">Home</a></p>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
	
	
	public void destroy() {
		try {
			System.out.println("Readproduct.destroy() method. DB connection closed");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
