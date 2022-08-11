import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
	@Id
	@Column(name="Product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productid;
	
	@Column(name="Product_name")
	private String productname;
	
	@Column(name="Product_Price")
	private String productprice;
	
	public Product(String productname, String productprice) {
		super();
		this.productname = productname;
		this.productprice = productprice;
	}
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
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
