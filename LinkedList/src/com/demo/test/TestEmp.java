package com.demo.test;

import com.demo.beans.Employee;
import com.demo.linkedlist.EmployeeList;

public class TestEmp {
	public static void main(String[] args) {
		EmployeeList el=new EmployeeList();
		el.addData(new Employee(1,"abc","pune"));
		el.addData(new Employee(2,"xyz","latur"));
		el.addData(new Employee(8,"rahul","pune"));
		el.addData(new Employee(8,"ram","umarga"));
		el.addData(new Employee(4,"ram","umarga"));
		//el.deleteById(2);
		el.deleteById(8);
//		el.searchById(1);
		el.display(); 
		
	}

}
