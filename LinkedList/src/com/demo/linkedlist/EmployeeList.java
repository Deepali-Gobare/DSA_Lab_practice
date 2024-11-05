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
//    	Node temp1=head;
//    	while(temp1.next!=null) {
//    	Node temp=head;
//    	if(head.data.getEmpid()==id) {
//    		head=temp.next;
//    		temp.next=null;
//    		temp=null;
//    	}
//    	else {
//    		Node prev=null;
//    		while(temp!=null && temp.data.getEmpid()!=id) {
//    			prev=temp;
//    			temp=temp.next;
//    			}
//    		if(temp!=null && temp.data.getEmpid()==id) {
//    			prev.next=temp.next;
//    			temp.next=null;
//    			temp=null;
//    		}
//    		else {
//    			System.out.println("Id Not found");
//    		}
//    	}
//    	temp1=temp1.next;
//    	
//    }
    	  Node temp1 = head;

    	    // First, remove all nodes with the given ID at the start of the list
    	    while (head != null && head.data.getEmpid() == id) {
    	        Node temp = head;   // Temporary reference to the current head node
    	        head = head.next;    // Move head to the next node
    	        temp.next = null;    // Disconnect the node from the list
    	        temp = null;         // Allow garbage collection to clear the node
    	    }

    	    // Initialize previous node reference as null
    	    Node prev = null;

    	    // Traverse the rest of the list starting from temp1
    	    while (temp1 != null) {
    	        // Check if the current node's empId matches the given id
    	        if (temp1.data.getEmpid() == id) {
    	            if (prev != null) {
    	                // If there's a previous node, link it to the next node of temp1
    	                prev.next = temp1.next;
    	            }
    	            // Remove the current node by disconnecting it
    	            Node temp = temp1;
    	            temp1 = temp1.next;   // Move to the next node in the list
    	            temp.next = null;     // Disconnect temp from the list
    	            temp = null;          // Allow garbage collection to clear the node
    	        } else {
    	            // If current node's empId doesn't match, just move forward
    	            prev = temp1;         // Set prev to the current node
    	            temp1 = temp1.next;   // Move to the next node in the list
    	        }
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












