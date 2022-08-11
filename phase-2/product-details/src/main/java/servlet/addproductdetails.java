package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Product;

/**
 * Servlet implementation class addproductdetails
 */
@WebServlet("/addproductdetails")
public class addproductdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productid=request.getParameter("productid");
		String productname=request.getParameter("productname");
		String productprice=request.getParameter("productprice");
		List<Product> addproduct = new ArrayList<>();
		
		Product product= new Product(productid, productname, productprice);
		addproduct.add(product);
		
		request.setAttribute("myproducts", addproduct);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/product.jsp");
		rd.forward(request, response);
		
		
	}

}
