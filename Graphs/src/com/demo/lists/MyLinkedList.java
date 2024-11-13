package com.demo.lists;

public class MyLinkedList {
		Node head;
	class Node{
		
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
		
		
		
	}
	public MyLinkedList(Node head) {
		super();
		this.head = head;
	}
	 
	public void addValue(int val) {
		Node newnode=new Node(val);
		if(head==null) {
			head=newnode;
		}else {
			head.next=newnode;
			head=newnode;
		}
	}
	public boolean searchByValue(int val) {
		if(head==null) {
			return false;
		}else {
			Node temp=head;
			while(head.data!=val && temp!=null) {
				temp=temp.next;
			}
			if(head.data==val && temp!=null) {
				return true;
			}else
				return false;
			
		}
		
		
	}
	public boolean deletedata(int val) {
		if(head==null) {
			return false;
		}else {
			Node temp=head;
			if(head.data==val){
				head=head.next;
				temp.next=null;
				temp=null;
			}else {
				Node prev=null;
				while(temp.data!=val && temp!=null) {
					temp=temp.next;
				}if(temp.data==val 	) {
					prev.next=temp.next; 	
				}else
					return false;
			}
			
		}
		return false;
		
	}
	public void displaylist(){
		if(head==null) {
			System.out.println("List is empty");
		}else {
			Node temp=head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.print("null");
			System.out.println();
			
		}
		
	}
		
}
