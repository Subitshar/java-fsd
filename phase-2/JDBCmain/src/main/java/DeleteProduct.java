

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
 * Servlet implementation class DeleteProduct
 */
@WebServlet("/deleteproduct")
public class DeleteProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
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
		try (PreparedStatement statement = connection.prepareStatement("delete from product where productname =?");) {

			statement.setString(1, productname);
			int rowsDeleted = statement.executeUpdate();
			System.out.println("Number of rows Deleted: " + rowsDeleted);

			PrintWriter pw = response.getWriter();
			pw.write("product deleted successfully");
			pw.write("<p><a href=\"Home.html\">Home</a></p>");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
