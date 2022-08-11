
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductAddServlet")
public class ProductAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ProductDAL productdal;

	public void init() throws ServletException {
		super.init();
		productdal = new ProductDAL();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Product> product = this.productdal.getProducts();

		request.setAttribute("product", product);

		RequestDispatcher rd = request.getRequestDispatcher("/list-product.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String productname = request.getParameter("productname");
			

		Product products = new Product(productname);

		this.productdal.addproduct(products);

		List<Product> product = this.productdal.getProducts();

		request.setAttribute("product",product);

		RequestDispatcher rd = request.getRequestDispatcher("/list-product.jsp");
		rd.forward(request, response);

}
}
