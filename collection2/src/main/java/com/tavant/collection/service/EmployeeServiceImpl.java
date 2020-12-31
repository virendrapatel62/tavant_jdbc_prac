package com.tavant.collection.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tavant.collection.dao.EmployeeDao;
import com.tavant.collection.exceptions.InvalidNameException;
import com.tavant.collection.exceptions.InvalidSalaryException;
import com.tavant.collection.models.Employee;

@Service("EmployeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public boolean addEmployee(Employee emp) {
		return this.employeeDao.addEmployee(emp);
	}

	@Override
	public Optional<Employee> updateEmployee(Integer empId, Employee employee)
			throws InvalidNameException, InvalidSalaryException {
		return this.employeeDao.updateEmployee(empId, employee);
	}

	@Override
	public Optional<List<Employee>> getEmployees() {

		return this.employeeDao.getEmployees();
	}

	@Override
	public Optional<Employee> deleteEmploye(Integer empid) {
		return this.employeeDao.deleteEmploye(empid);
	}

	@Override
	public Optional<Employee> getEmployeeById(Integer empid) {
		return this.employeeDao.getEmployeeById(empid);
	}

	@Override
	public boolean isExists(Integer empId) {
		return this.employeeDao.isExists(empId);
	}

}
