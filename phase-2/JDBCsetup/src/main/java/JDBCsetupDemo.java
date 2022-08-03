

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JDBCsetupDemo
 */
@WebServlet("/JDBCsetupDemo")
public class JDBCsetupDemo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection connection = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			try {
				connection= DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "SUBITSHA2002*r");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		try (Statement statement = connection.createStatement();) {

			ResultSet results = statement.executeQuery("select * from product");
			PrintWriter out = response.getWriter();
			out.println("<table>");
			out.println("<tr>");
			out.println("<th>ProductId</th>");
			out.println("<th>Product Name</th>");
			out.println("<th>Product price</th>");
			out.println("</tr>");
			while (results.next()) {
				out.println("<tr>");
				out.println("<td>" + results.getInt(1) + "</td>");
				out.println("<td>" + results.getString(2) + "</td>");
				out.println("<td>" + results.getInt(3) + "</td>");
				out.println("</tr>");
			}
			out.println("</table>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	

}
