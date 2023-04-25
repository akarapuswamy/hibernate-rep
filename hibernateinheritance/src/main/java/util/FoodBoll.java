package util;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table
public class  FoodBoll extends Player  {
	@Column
	private double noofGoals;
	@Column
	private String teamName;
	
	
	public FoodBoll(String name, String bodytype) {
		super(name, bodytype);
	}


	public FoodBoll(String name, String bodytype, double noofGoals, String teamName) {
		super(name, bodytype);
		this.noofGoals = noofGoals;
		this.teamName = teamName;
	}


	public double getNoofGoals() {
		return noofGoals;
	}


	public void setNoofGoals(double noofGoals) {
		this.noofGoals = noofGoals;
	}


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	@Override
	public String toString() {
		return "FoodBoll [noofGoals=" + noofGoals + ", teamName=" + teamName + "]";
	}


		
	
}
	