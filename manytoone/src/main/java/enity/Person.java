package enity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
public class Person {
	@Column(name = "S_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@ManyToOne
	@JoinTable(name = "person_add", joinColumns =
	@JoinColumn(name = "id"),
	inverseJoinColumns = @JoinColumn(name = "addid"))
	private Address addes;

	public Person() {
	}
	
	public Person(String firstname,
			String lastname, Address addess) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.addes = addess;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", addes=" + addes + "]";
	}

}
