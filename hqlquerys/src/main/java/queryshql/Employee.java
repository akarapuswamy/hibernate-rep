package queryshql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "swamy")
public class Employee {
	@Column(name = "Empid", length = 20, unique = true)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int EmpId;

	@Column(name = "firstname", length = 30, nullable = false)
	private String name;
	@Column(name = "lastname", length = 30, nullable = false)
	private String lastname;
	@Column(name = "EmpSalary", length = 5, precision = 2, nullable = true)
	private double salary;

	public Employee(int empId, String name, String lastname, double salary) {
		super();
		EmpId = empId;
		this.name = name;
		this.lastname = lastname;
		this.salary = salary;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", name=" + name + ","
	  + " lastname=" + lastname + ", salary=" + salary + "]";
	}
	public Employee() {
		super();
	}
}
