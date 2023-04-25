package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Flipkart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productid;
	@Column
	private String productName;
	@Column
	private String productitem;
	@OneToOne
	private AddtoCart addtocart;
	public Flipkart() {
		super();
	}
	
	
	public Flipkart(String productName, String productitem) {
		super();
		this.productName = productName;
		this.productitem = productitem;
	}


	public Flipkart( String productName, String productitem, AddtoCart addtocart) {
		
		this.productName = productName;
		this.productitem = productitem;
		this.addtocart = addtocart;
	}
	public Long getProductid() {
		return productid;
	}
	public void setProductid(Long productid) {
		this.productid = productid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductitem() {
		return productitem;
	}
	public void setProductitem(String productitem) {
		this.productitem = productitem;
	}
	public AddtoCart getAddtocart() {
		return addtocart;
	}
	public void setAddtocart(AddtoCart addtocart) {
		this.addtocart = addtocart;
	}
	@Override
	public String toString() {
		return "Flipkart [productid=" + productid + 
				", productName=" + productName +
				", productitem=" + productitem
				+ ", addtocart=" + addtocart + "]";
	}
}
