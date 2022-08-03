
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JDBCDemo")
public class JDBCDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
		Properties props = new Properties();
		props.load(in);

		DBConnection conn;
		try {
			conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"),props.getProperty("password"));
			out.println("DB Connection initialized.<br>");
			conn.closeConnection();
			out.println("DB Connection closed.<br>");

			out.println("</body></html>");
			conn.closeConnection();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}
