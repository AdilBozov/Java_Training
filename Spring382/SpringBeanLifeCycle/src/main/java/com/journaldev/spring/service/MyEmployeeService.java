package com.journaldev.spring.service;

import com.journaldev.spring.bean.Employeee;

public class MyEmployeeService {
	
	private Employeee employee;

	public Employeee getEmployee() {
		return employee;
	}

	public void setEmployee(Employeee employee) {
		this.employee = employee;
	}
	
	public MyEmployeeService(){
		System.out.println("MyEmployeeService no-args constructor called");
	}

	//pre-destroy method
	public void destroy() throws Exception {
		System.out.println("MyEmployeeService Closing resources");
	}

	//post-init method
	public void init() throws Exception {
		System.out.println("MyEmployeeService initializing to dummy value");
		if(employee.getName() == null){
			employee.setName("Pankaj");
		}
	}

}
