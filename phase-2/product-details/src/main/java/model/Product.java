package model;

public class Product {
	private String productid;
	private String productname;
	private String productprice;
	public Product(String productid, String productname, String productprice) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productprice = productprice;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductprice() {
		return productprice;
	}
	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", productprice=" + productprice
				+ "]";
	}
	
	

}
