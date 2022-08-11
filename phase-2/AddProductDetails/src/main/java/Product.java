


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productid;
	
	private String productname;
	
	
	public Product() {
		
	}
	
	public Product(String productname) {
		super();
		this.productname = productname;
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
	
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname +" ]";
	}
	
	

}
