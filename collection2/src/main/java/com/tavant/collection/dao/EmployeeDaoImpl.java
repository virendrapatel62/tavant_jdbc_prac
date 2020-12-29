package com.tavant.collection.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.tavant.collection.exceptions.InvalidNameException;
import com.tavant.collection.exceptions.InvalidSalaryException;
import com.tavant.collection.models.Employee;
import com.tavant.collection.utils.DBUtils;

public class EmployeeDaoImpl implements EmployeeDao {

	private static EmployeeDao employeeDao;
	private DBUtils dbUtils = DBUtils.getInstance();

	private EmployeeDaoImpl() {
	}

	public static EmployeeDao getInstance() {
		if (employeeDao == null) {
			synchronized (EmployeeDaoImpl.class) {
				if (employeeDao == null) {
					employeeDao = new EmployeeDaoImpl();
				}
			}
		}

		return employeeDao;
	}

	@Override
	public boolean addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<Employee> updateEmployee(String empId, Employee employee)
			throws InvalidSalaryException, InvalidNameException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		List<Employee> employees = new ArrayList<>();
		Connection connection = dbUtils.getConnection();
		try {

			Statement statement = connection.createStatement();
			String query = "SELECT * FROM employees ";

			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				Employee employee = new Employee();
				employee.setEmployeeId(resultSet.getInt("employeeNumber"));
				employee.setLastName(resultSet.getString("lastName"));
				employee.setFirstName(resultSet.getString("firstName"));
				employee.setExtention(resultSet.getString("extension"));
				employee.setEmail(resultSet.getString("email"));
				employee.setOfficeCode(resultSet.getString("officeCode"));
				employee.setReportsTo(resultSet.getInt("reportsTo"));
				employee.setJobTitle(resultSet.getString("jobTitle"));

				employees.add(employee);

			}

			return Optional.of(employees);
		} catch (Exception e) {

		} finally {
			dbUtils.closeConnection(connection);
		}
		return Optional.empty();
	}

	@Override
	public Optional<Employee> deleteEmploye(String empid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> getEmployeeById(String empid) {
		
		Employee employee = null;
		Connection connection = dbUtils.getConnection();
		
		try {
			Statement statement = connection.createStatement();
			String query = String.format("SELECT * FROM employees where employeeNumber = %s", empid);
			ResultSet resultSet = statement.executeQuery(query);

			if (resultSet.next()) {
				employee = new Employee();
				employee.setEmployeeId(resultSet.getInt("employeeNumber"));
				employee.setLastName(resultSet.getString("lastName"));
				employee.setFirstName(resultSet.getString("firstName"));
				employee.setExtention(resultSet.getString("extension"));
				employee.setEmail(resultSet.getString("email"));
				employee.setOfficeCode(resultSet.getString("officeCode"));
				employee.setReportsTo(resultSet.getInt("reportsTo"));
				employee.setJobTitle(resultSet.getString("jobTitle"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbUtils.closeConnection(connection);
		}
		return Optional.ofNullable(employee);

	}

	@Override
	public boolean isExists(String empId) {
		// TODO Auto-generated method stub
		return false;
	}

}
