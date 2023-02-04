package com.model;

public class Employee {
	private int id;
	private String name; 
	private String lastname;
	private double Salary;
	
	
	
	public Employee() {
		super();
	}
	
		
	
	public Employee(String name, String lastname, double salary) {
		super();
		this.name = name;
		this.lastname = lastname;
		Salary = salary;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastname=" + lastname + ", Salary=" + Salary + "]";
	}

}
