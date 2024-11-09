package com.demo.beans;

public class Hashing {
	 Node head=null;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
		
		}
	public void addNode(int val) {
		Node newnode=new Node(val);
		if(head==null) {
			head=newnode;
		}
		else {
			newnode.next=head;
			head=newnode;
		}
		
	}
	
	public boolean searchByval(int val) {
		Node temp=head;
		if(head==null) {
			return false;
		}else {
			
			while(temp!=null && temp.data!=val) {
				temp=temp.next;
				
			}
			if(temp!=null && temp.data==val) {
			return true;
			}else 
			{
		return false;
	}
	}
}
	
	public boolean deleteByval(int val) {
		Node temp=head;
		if(head==null) {
		return false;
		}
		else {
			Node prev= null;
			if(head.data==val) {
				head=head.next;
				
			}else {
			while(temp!=null && temp.data!=val) {
				prev=temp;
				temp=temp.next;
			}
			if(temp.data==val) {
				prev.next=temp.next;
				
			}else {
				return false;
			}
			}
			temp.next=null;
			temp=null;
			return true;
			
		}
		
		
	}
  public void displayData() {
	  Node temp=head;
  
	  if(head==null) {
		  System.out.println("List is Empty");
	  }
	  else {
		  while(temp!=null) {
			  System.out.println(temp.data);
			  temp=temp.next;
		  }
		  
		  }
	  }
  }

