package servletinterface;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class InterfaceDemo implements Servlet {
	
	ServletConfig config=null;

	@Override
	public void destroy() {
		System.out.println("In destroy() method");
	}

	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	@Override
	public String getServletInfo() {
		return "This is sample servlet info";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		System.out.println("Initialization complete");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter obj=res.getWriter();
		obj.print("<html>");
		obj.print("<body>");
		obj.print("In the service() method <br>");
		obj.print("</body>");
		obj.print("</html>");
		}

}
