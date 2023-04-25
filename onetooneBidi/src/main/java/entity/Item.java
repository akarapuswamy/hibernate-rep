package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String itemId;
	@Column
	private Double itemTotal;
	@Column
	private Integer quantity;
	
	@OneToOne(mappedBy = "item", cascade = CascadeType.PERSIST)
	private Cart cart;

	public Item() {
		
	}

	public Item(String itemId, Double itemTotal, Integer quantity) {
		this.itemId = itemId;
		this.itemTotal = itemTotal;
		this.quantity = quantity;
	}

	public Item( String itemId, Double itemTotal, Integer quantity, Cart cart) {
		this.itemId = itemId;
		this.itemTotal = itemTotal;
		this.quantity = quantity;
		this.cart = cart;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Double getItemTotal() {
		return itemTotal;
	}

	public void setItemTotal(Double itemTotal) {
		this.itemTotal = itemTotal;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemId=" + itemId + ", itemTotal=" + itemTotal + ", quantity=" + quantity
				+ ", cart=" + cart + "]";
	}
}
