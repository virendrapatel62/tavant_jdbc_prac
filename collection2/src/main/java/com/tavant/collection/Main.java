package com.tavant.collection;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tavant.collection.config.DBConfig;
import com.tavant.collection.service.EmployeeService;
import com.tavant.collection.utils.DBUtils;

public class Main {
	public static void main(String[] args) throws Exception {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);

		Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);

		System.out.println(context.getBean(DBUtils.class));
//		System.out.println(context.getBean("employeeDaoImpl"));

		
		System.err.println("--------ALL Employeesss-------");
		EmployeeService employeeService = (EmployeeService)context.getBean("EmployeeServiceImpl");
		employeeService.getEmployees().get().forEach(e->{
			System.err.println(e.getFirstName());
		});
		

	}
}
