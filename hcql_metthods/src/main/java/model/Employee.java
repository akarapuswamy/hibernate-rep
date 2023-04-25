package model;

import javax.persistence.Column;
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
	private int EmpId;
	@Column
	private String EmpFirstName;
	@Column
	private String EmpLastName;
	@Column
	private double EmpSalary;
	@Column
	private String Address;

	public Employee() {
		super();
	}

	public Employee(int empId, String empFirstName, String empLastName, double empSalary, String address) {
		super();
		EmpId = empId;
		EmpFirstName = empFirstName;
		EmpLastName = empLastName;
		EmpSalary = empSalary;
		Address = address;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpFirstName() {
		return EmpFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		EmpFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return EmpLastName;
	}

	public void setEmpLastName(String empLastName) {
		EmpLastName = empLastName;
	}

	public double getEmpSalary() {
		return EmpSalary;
	}

	public void setEmpSalary(double empSalary) {
		EmpSalary = empSalary;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpFirstName=" + EmpFirstName + ", EmpLastName=" + EmpLastName
				+ ", EmpSalary=" + EmpSalary + ", Address=" + Address + "]";
	}

}
