package test;

import dao.StudentDaoImpl;
import model.Student;

public class Test {
	public static void main(String[] args) {
		StudentDaoImpl ss = new StudentDaoImpl();
		Student s = new Student(1, "swamy", 3200.00, "swamy@gmail.com");
		ss.save(s);
	}

}
