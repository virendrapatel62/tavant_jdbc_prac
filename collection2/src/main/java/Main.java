import java.util.List;
import java.util.Optional;

import com.tavant.collection.dao.EmployeeDaoImpl;
import com.tavant.collection.models.Employee;
import com.tavant.collection.service.EmployeeService;
import com.tavant.collection.service.EmployeeServiceImpl;

public class Main {
	public static void main(String[] args) throws Exception {

//		getAll()

//		getById();
		
//		isExists();
		
//		saveEmployee();
		
		
//		updateEmployee();
		
	}

//	private static void deleteEmployeeById() {
//		EmployeeService employeeService = new EmployeeServiceImpl();
//		System.out.println(employeeService.deleteEmploye(1771).get());
//	}
//
//	private static void saveEmployee() {
//		EmployeeService employeeService =  new EmployeeServiceImpl();
//		Employee employee = new Employee();
//		employee.setEmail("patelvirendra62@gmail.com");
//		employee.setFirstName("Virendra Kumar");
//		employee.setLastName("Patel");
//		employee.setJobTitle("Software Eng.. traineee");
//		employee.setExtention("A");
//		employee.setOfficeCode("1");
//		employee.setReportsTo(1002);
//		employee.setEmployeeId(1771);
//		
//		boolean saved = employeeService.addEmployee(employee);
//		System.out.println(saved);
//		
//	}
//	
//	private static void updateEmployee() throws Exception {
//		EmployeeService employeeService = new EmployeeServiceImpl();
//		Employee employee = new Employee();
//		employee.setEmail("updated@gmail.com");
//		employee.setFirstName("Updated Kumar");
//		employee.setLastName("Updated");
//		employee.setJobTitle("Updated Eng.. traineee");
//		employee.setExtention("A");
//		employee.setOfficeCode("1");
//		employee.setReportsTo(1076);
//		
//		Optional<Employee> savedOptional = employeeService.updateEmployee(1771,employee);
//		if(savedOptional.isPresent()) {
//			System.out.println("EMployee Updated ..");
//			System.out.println(savedOptional.get());
//		}else {
//			System.out.println("Not Updated..");
//		}
//		
//	}

//	private static void isExists() {
//		EmployeeService employeeService =  new EmployeeServiceImpl();
//		System.out.println(employeeService.isExists(1003));
//	}
//
//	private static void getAll() {
//		EmployeeService employeeService =  new EmployeeServiceImpl();
//		employeeService.getEmployees().get().forEach(System.out::println);
//	}
//
//	private static void getById() {
//		EmployeeService employeeService =  new EmployeeServiceImpl();
//		Optional<Employee> optional = employeeService.getEmployeeById(1002);
//
//		if (optional.isPresent())
//			System.out.println(optional.get());
//		else
//			System.out.println("Not Found");
//	}
}
