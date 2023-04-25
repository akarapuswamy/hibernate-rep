package dao;

import java.util.List;

import model.Employee;

public interface EmployeeDao {
	Employee save(Employee employee);
	Employee update(Employee employee);
	Employee delect (Employee employee);
	List<Employee> getall();
	Employee getById(int id);
}
