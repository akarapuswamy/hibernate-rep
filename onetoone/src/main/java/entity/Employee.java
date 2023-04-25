package entity;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String name;
	@Column
	private double salary;
	@Column
	private Date jioningdate;
	
	@AttributeOverrides({ @AttributeOverride(name = "doorNo", column = @Column(name = "Door_NO")),
		@AttributeOverride(name = "area", column = @Column(name = "AREA_Name")),
		@AttributeOverride(name = "state", column = @Column(name = "STATE_NAME"))
})
	@Embedded
	private Address address;

	public Employee() {
		super();
	}

	public Employee( String name, double salary, Date jioningdate, Address address) {
		super();
		
		this.name = name;
		this.salary = salary;
		this.jioningdate = jioningdate;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getJioningdate() {
		return jioningdate;
	}

	public void setJioningdate(Date jioningdate) {
		this.jioningdate = jioningdate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + 
				", salary=" + salary + ", jioningdate=" + jioningdate
				+ ", address=" + address + "]";
	}

}
