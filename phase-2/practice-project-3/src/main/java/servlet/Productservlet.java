package servlet;

import java.io.IOException;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import datalayer.productDBUtil;
import domain.Product;
 
@WebServlet("/Productservlet")
public class Productservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;  
	
	private productDBUtil productDBUtil;

	@Resource(name="jdbc/practice-project-3")
	private DataSource datasource;
	
	public void init() throws ServletException {
		super.init();
		this.productDBUtil = new productDBUtil(datasource);
	}
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Product> products = productDBUtil.getProduct();
		
		request.setAttribute("PRODUCT_LIST", products);
		
		RequestDispatcher rd = request.getRequestDispatcher("/list-product.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productid=request.getParameter("productid");
		String productname=request.getParameter("productname");
		String productprice=request.getParameter("productprice");
		
		Product product= new Product(productid, productname, productprice);
		
		productDBUtil.addproduct(product);
		
		doGet(request,response);

	}

}