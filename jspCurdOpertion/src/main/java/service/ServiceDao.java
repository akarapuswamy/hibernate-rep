package service;

import java.util.List;

import model.Employee;

public interface ServiceDao {
	Employee save(Employee employee);

	Employee update(Employee employee);

	List<Employee> findAll();

	void delete(int id);

	Employee getById(int id);

}
