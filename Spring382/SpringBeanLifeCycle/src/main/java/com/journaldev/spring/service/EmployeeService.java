package com.journaldev.spring.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.journaldev.spring.bean.Employeee;

public class EmployeeService implements InitializingBean, DisposableBean{

	private Employeee employee;
	
	
	
	public Employeee getEmployee() {
		return employee;
	}

	public void setEmployee(Employeee employee) {
		this.employee = employee;
	}
	
	public EmployeeService(){
		System.out.println("EmployeeService no-args constructor called");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("EmployeeService Closing resources");
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("EmployeeService initializing to dummy value");
		if(employee.getName() == null){
			employee.setName("Pankaj");
		}
		
	}

}
