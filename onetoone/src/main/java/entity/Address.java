package entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private int doornumber;
	private String area;
	private String State;

	public Address() {

	}

	public Address(int doornumber, String area, String state) {
		super();
		this.doornumber = doornumber;
		this.area = area;
		State = state;
	}

	public int getDoornumber() {
		return doornumber;
	}

	public void setDoornumber(int doornumber) {
		this.doornumber = doornumber;
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

	

}
