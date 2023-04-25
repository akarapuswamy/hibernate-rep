package com.annotion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="shiva")
public class Student {
	@Column(name="StudentId",length = 20,unique=true)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="firstname",length=30,nullable= false)
	private String name;
	@Column(name ="lastname",length =30,nullable=false)
	private String lastname;
	@Column(name="Studentfee",length =5,precision = 2,nullable = true)
	private double fee;
	public Student(int id, String name, String lastname, double fee) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.fee = fee;
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
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", lastname=" + lastname + ", fee=" + fee + "]";
	}
	
	
	

}
