package service;

import java.util.List;

import dao.EmployeImp;
import model.Employee;

public class ServiceImp  implements ServiceDao{
	EmployeImp dao= new EmployeImp();

	public Employee save(Employee employee) {
		return dao.save(employee);
	}

	public Employee update(Employee employee) {
		return dao.save(employee);
	}

	public List<Employee> findAll() {
		return dao.getall();
	}

	public void delete(Employee id) {
		dao.delect(id);
		
	}

	public void delete(int id) {
		;
		
	}

	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	
}
