package com.example.ComparatorExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorEampleUsingJava8 {

	public static void main(String[] args) {
	
		List<Employee> empList = new ArrayList<Employee>();
		CreateEmployeeList(empList);
		System.out.println("Employee list before sorting ");
		empList.forEach(emp -> System.out.println(emp.getName()+ "-"+emp.getCity()+ "-" + emp.getId()));
		empList.sort(Comparator.comparing(Employee::getCity));
		System.out.println("Employee list After sorting ");
		empList.forEach(emp -> System.out.println(emp.getName()+ "-"+emp.getCity()+ "-" + emp.getId()));
}
	public static void CreateEmployeeList(List<Employee> emplist) {

		Employee e1= new Employee();
		e1.setId(1);
	    e1.setName("Girish");
	    e1.setCity("PUNE");
	    
	    Employee e2= new Employee();
	    e2.setId(2);
	    e2.setName("Rajesh");
	    e2.setCity("Nashik");
	    
	    Employee e3= new Employee();
	    e3.setId(3);
	    e3.setName("Navya");
	    e3.setCity("BANGLURU");
	    
	    Employee e4= new Employee();
	    e4.setId(1);
	    e4.setName("Dimple");
	    e4.setCity("Hydrabad");
	    
	    Employee e5= new Employee();
	    e5.setId(1);
	    e5.setName("Zeno");
	    e5.setCity("South India");
	    
	    Employee e6= new Employee();
	    e6.setId(1);
	    e6.setName("fatima");
	    e6.setCity("chennai");
	    
	    Employee e7= new Employee();
	    e7.setId(1);
	    e7.setName("vivek");
	    e7.setCity("PUNE");
	}
}