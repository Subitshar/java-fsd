

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateProduct
 */
@WebServlet("/updateproduct")
public class UpdateProduct extends HttpServlet {
	Connection connection;

	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
			ServletContext context=config.getServletContext();
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
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String productname = request.getParameter("productname");
		String productprice = request.getParameter("prodectprice");


		try (PreparedStatement statement = connection.prepareStatement("update product set productprice =? where productname = ?");) {

			statement.setString(1, productprice);
			statement.setString(2, productname);
			int rowsUpdated = statement.executeUpdate();
			System.out.println("Number of rows Update: " + rowsUpdated);

			PrintWriter pw = response.getWriter();
			pw.write("Product updated successfully");
			pw.write("<p><a href=\"Home.html\">Home</a></p>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void destroy() {
		try {
			System.out.println("Updateproduct.destroy() method. DB connection closed");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
