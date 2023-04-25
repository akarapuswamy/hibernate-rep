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
public class AddtoCart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Pid;
	@Column
	private String ItemName;
	@Column
	private Long ItemId;
	@Column
	private Double ItemPrize;
	@Column
	private Integer quantity;
	@OneToOne(mappedBy = "flipkar_productid")
	private Flipkart flipkart;
	
	public AddtoCart() {
		
	}
	

	public AddtoCart(String itemName, Double itemPrize, Integer quantity, Flipkart flipkart) {
		super();
		ItemName = itemName;
		ItemPrize = itemPrize;
		this.quantity = quantity;
		this.flipkart = flipkart;
	}


	public AddtoCart( String itemName, Long itemId, 
			Double itemPrize, 
			Integer quantity, 
			Flipkart flipkart) {
		ItemName = itemName;
		ItemId = itemId;
		ItemPrize = itemPrize;
		this.quantity = quantity;
		this.flipkart = flipkart;
		
	}

	public long getPid() {
		return Pid;
	}


	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public Long getItemId() {
		return ItemId;
	}


	public Double getItemPrize() {
		return ItemPrize;
	}

	public void setItemPrize(Double itemPrize) {
		ItemPrize = itemPrize;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Flipkart getFlipkart() {
		return flipkart;
	}

	public void setFlipkart(Flipkart flipkart) {
		this.flipkart = flipkart;
	}

	@Override
	public String toString() {
		return "AddtoCart [Pid=" + Pid + ", ItemName=" + ItemName + 
				", ItemId=" + ItemId + ", ItemPrize=" + ItemPrize
				+ ", quantity=" + quantity + ", flipkart=" + flipkart + "]";
	}



	
}
