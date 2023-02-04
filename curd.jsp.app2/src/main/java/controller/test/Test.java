package controller.test;

import dao.StudentDaoImpl;
import model.Student;

public class Test {
public static void main(String[] args) {
	StudentDaoImpl ser = new StudentDaoImpl();
	Student s1 = new Student(1, "swamy", 3200.00, "swamy@gmail.com");
	ser.save(s1);
	
}

}
