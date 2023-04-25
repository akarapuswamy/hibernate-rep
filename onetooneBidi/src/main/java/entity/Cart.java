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
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private Double total;
	@Column
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	private Item item;
	
	public Cart() {
		
	}
	

	public Cart(Long id, Double total, String name, Item item) {
		super();
		this.id = id;
		this.total = total;
		this.name = name;
		this.item = item;
	}


	public Cart(Double total, String name) {
		
		this.total = total;
		this.name = name;
	}


	public Cart( Double total, String name, Item item) {
		
		this.total = total;
		this.name = name;
		this.item = item;
	}

	public Long getId() {
		return id;
	}

	
	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", total="
	+ total + ", name=" + name + ", item=" + item + "]";
	}
}