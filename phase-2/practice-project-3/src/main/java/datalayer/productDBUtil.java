package datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import domain.Product;

public class productDBUtil {

	private  DataSource dataSource;

	public productDBUtil(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Product> getProduct() {
		List<Product> products = new ArrayList<>();

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = dataSource.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from product");

			while (rs.next()) {
				String productid = rs.getString(1);
				String productname = rs.getString(2);
				String productprice = rs.getString(3);
				Product product = new Product(productid, productname, productprice);
				products.add(product);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, stmt, rs);
		}

		return products;
	}

	public void addproduct(Product product) {
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = dataSource.getConnection();
			String sql = "insert into product(ProductID, ProductName, ProductPrice) values (?, ?, ?)";
			stmt = conn.prepareStatement(sql);

			stmt.setString(1, product.getProductid());
			stmt.setString(2, product.getProductname());
			stmt.setString(3, product.getProductprice());

			stmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, stmt, null);
		}
	}

	private  void close(Connection conn, Statement stmt, ResultSet rs) {

		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
