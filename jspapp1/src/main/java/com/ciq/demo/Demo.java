package com.ciq.demo;

public class Demo {
	 int id;
	 String name;
	 
	 
	static Demo d1= new Demo(1,"vamshi");
	public static Demo getintance(){
		 return d1 ;
		 
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
	public Demo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + "]";
	}
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
}
