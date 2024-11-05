package com.demo.linkedlist;

public class SortedLinkedList {
	
	class Node{
		
		Node next;
		int data;
		public Node(int data) {
			super();
			this.next = null;
			this.data = data;
		}
		
		
		
	}

	Node head=null;
	
	public void deleteByValue(int val) {
		Node temp=head;
		if(head.data==val) {
			head=temp.next;
			temp.next=null;
			temp=null;
		}else {
			Node prev=null;
			while(temp!=null && temp.data<val) {
				prev=temp;
				temp=temp.next;
			}
			if(temp!=null && temp.data==val) {
				prev.next=temp.next;
				temp.next=null;
//				temp=null;
			}else {
				System.out.println("data not found");
			}
		}
	}
	
	public void addInsortedlist(int val) {
		
		Node newnode= new Node(val);
		if(head==null) {
			head=newnode;
		}
		else {
			if(head.data>val) {
				newnode.next=head;
				head=newnode;
			}
			else {
				Node temp=head,prev=null;
				while(temp!=null && temp.data<val) {
					prev=temp;
					temp=temp.next;
					}
					newnode.next=temp;
					prev.next=newnode;
					
			}
		}
		
		
			
		}
	public void displayList() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
			
		}
			
		
	}
	
	
	
}
