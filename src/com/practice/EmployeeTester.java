package com.practice;

public class EmployeeTester{
	public static void main(String[] args) {
		Employee e1 = new Employee("shane", 10000);
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		System.out.println(e1.getClass());
	}
	
}

class Employee {
	String name;
	double salary;
	
	public Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}
}


