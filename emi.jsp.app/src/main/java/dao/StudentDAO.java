package dao;

import java.util.List;

import model.Student;

public interface StudentDAO {
	void save(Student student);

	void update(Student student);

	List<Student> getAllStudent();

	int delete(int id);

	Student getByName(String name);

	Student getById(int id);

}
