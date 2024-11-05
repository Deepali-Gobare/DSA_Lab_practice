package com.demo.beans;

public class Employee {
	
	private int empid;
	private String enmae;
	private String address;
	
	public Employee() {
		super();
	}

	public Employee(int empid, String enmae, String address) {
		super();
		this.empid = empid;
		this.enmae = enmae;
		this.address = address;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEnmae() {
		return enmae;
	}

	public void setEnmae(String enmae) {
		this.enmae = enmae;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", enmae=" + enmae + ", address=" + address + "]";
	}
	
	
	
	

}
