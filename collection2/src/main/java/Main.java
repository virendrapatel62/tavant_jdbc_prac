import java.util.List;
import java.util.Optional;

import com.tavant.collection.dao.EmployeeDaoImpl;
import com.tavant.collection.models.Employee;
import com.tavant.collection.service.EmployeeService;
import com.tavant.collection.service.EmployeeServiceImpl;

public class Main {
	public static void main(String[] args) {

//		getAll()

		getById();
	}

	private static void getAll() {
		EmployeeService employeeService = EmployeeServiceImpl.getInstance();
		employeeService.getEmployees().get().forEach(System.out::println);
	}

	private static void getById() {
		EmployeeService employeeService = EmployeeServiceImpl.getInstance();
		Optional<Employee> optional = employeeService.getEmployeeById("1002");

		if (optional.isPresent())
			System.out.println(optional.get());
		else
			System.out.println("Not Found");
	}
}
