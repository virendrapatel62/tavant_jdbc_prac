package com.tavant.collection.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.tavant.collection.exceptions.InvalidNameException;
import com.tavant.collection.exceptions.InvalidSalaryException;
import com.tavant.collection.models.Employee;

@Repository("employeeDaoImpl2")
public class EmployeeDaoImpl2 implements EmployeeDao {

	public EmployeeDaoImpl2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<Employee> updateEmployee(Integer empId, Employee employee)
			throws InvalidSalaryException, InvalidNameException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> deleteEmploye(Integer empid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> getEmployeeById(Integer empid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isExists(Integer empId) {
		// TODO Auto-generated method stub
		return false;
	}

}
