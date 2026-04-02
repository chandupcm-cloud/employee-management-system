package com.employeemanagement.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagement.Entity.Employee;
import com.employeemanagement.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	
	public List<Employee>getAllEmployees(){
		 return repo.findAll();
	 }
	
	public Employee saveEmployee(Employee emp) {
		return repo.save(emp);
	}

	public List<Employee> getEmployeeByID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee findByID(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
	
}
