package enity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="addes")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addid;
	@Column
	private String area;
	@Column
	private String State;
	@OneToMany(mappedBy = "addes",cascade = CascadeType.ALL)
	
	private List<Person> person;

	public Address() {

	}


	public Address(String area, String state) {
		super();
		this.area = area;
		State = state;
	}


	public Address(String area, String state, List<Person> person) {
		super();
		this.area = area;
		State = state;
		this.person = person;
	}


	public Integer getAddid() {
		return addid;
	}

	public void setAddid(Integer addid) {
		this.addid = addid;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public List<Person> getPerson() {
		return person;
	}

	public void setPerson(List<Person> person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Address [addid=" + addid + ", area=" + area + ", State=" + State + ", person=" + person + "]";
	}


}
