package com.demo.linkedlist;

import com.demo.beans.Employee;

public class EmployeeList {
	Node head=null;
	class Node{
		Employee data;
		Node next;
		public Node() {
			super();
		}
		public Node(Employee data) {
			super();
			this.data = data;
			this.next = null;
		}
		
		
		
	}
	public void addData(Employee ob) {
		Node newNode=new Node(ob);
		
		if(head==null) {
			head=newNode;
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	
	public void display() {
		if(head==null) {
			System.out.println("List is empty");
		}else {
			Node temp=head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		System.out.println("...............");
	}
	
    public void deleteById(int id) {
    	Node temp1=head;
    	while(temp1!=null) {
    	Node temp=head;
    	if(head.data.getEmpid()==id) {
    		head=temp.next;
    		temp.next=null;
    		temp=null;
    	}
    	else {
    		Node prev=null;
    		while(temp!=null && temp.data.getEmpid()!=id) {
    			prev=temp;
    			temp=temp.next;
    			}
    		if(temp!=null && temp.data.getEmpid()==id) {
    			prev.next=temp.next;
    			temp.next=null;
    			temp=null;
    		}
    		else {
    			System.out.println("Id Not found");
    		}
    	}
    	temp1=temp1.next;
    	
    }
    	 
    	    
    }
    	public void searchById(int id) {
    		Node temp=head;;
    		while(temp!=null && temp.data.getEmpid()!=id) {
    			
    			temp=temp.next;
    		}
    		if(temp!=null && temp.data.getEmpid()==id) {
    			System.out.println("Id found"+temp.data);
    			
    		}else {
    			System.out.println("IId not found");
    		}
    		
    	}


}












