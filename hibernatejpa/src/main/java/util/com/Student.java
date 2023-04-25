package util.com;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@Column
	private String Studentarea;
	
	public Student() {
		super();
	}
	public Student( Date dob, String studentarea) {
		
			this.dob = dob;
		Studentarea = studentarea;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getStudentarea() {
		return Studentarea;
	}
	public void setStudentarea(String studentarea) {
		Studentarea = studentarea;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", dob=" + dob + ", Studentarea=" + Studentarea + "]";
	}
}
