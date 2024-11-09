package com.demo.linkedlist;

public class SinglyLinkedList {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
		
	}
    Node head ;
	public SinglyLinkedList() {
		super();
		this.head = null;
		
	}
	public  void addNode (int val) {
		
		Node newnode= new Node(val);
		if(head==null)
		{
			head=newnode;
			
		}else {
			Node temp =head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
			
		}
		
		
		
	}
	
	/*public int searchByValue(int val) {
		int pos=1;
		Node temp=head;
		if(head==null) {
			System.out.println("The list is empty");
		}else {
			while(temp!=null && temp.data!=val) {
				System.out.println("pos "+pos);
				temp=temp.next;
				pos++;
			}
			
		}
		if(temp!=null) {
		return pos;
		}
		return -1;
	}*/
	
	public int searchByValue(int val) {
		Node temp =head; 
		int pos=1;
		if(head==null) {
			System.out.println("List is empty");
			}
		else {
			while(temp!=null && temp.data!=val ) {
				temp=temp.next;
			pos++;
			}
		}
		if(temp!=null) {
			return pos;
		}
		return -1;
			
	}
	
	
	
	
	
	
	
	public void addByPosition(int val,int pos) {
		Node newnode=new Node(val);
		Node temp=head;
		if(pos==1) {
			newnode.next=head;
			head=newnode;
		}else {
		
		for(int i=1; temp!=null && i<=pos-2 ; i++ ) {
			  temp=temp.next;
		}
		if(temp!=null) {
		newnode.next=temp.next;
		temp.next=newnode;
		
		}else {
			System.out.println("The given position beyond the limit of list");
		}
		}
		
		

	}
	
	public void deleteByValue(int val) {
		Node temp=head;
		Node prev=null;
		if(head.data==val) {
			temp.next=head;
			temp.next=null;
			temp=null;
		}
		while(temp!=null && temp.data!=val ) {
			prev=temp;
			temp=temp.next;
		
		}
		
		prev.next=temp.next;
		temp.next=null;
		temp=null;
	}
	public void deleteByPosition(int pos) {
		Node temp=head;
		int size=1;
		while(size<pos-1) {
			System.out.println("size "+size);
			temp=temp.next;
			size++;
		}
		temp.next=temp.next.next;
	}
	
	public void display() {
  	Node temp=head;
  	if(head==null) {
  		System.out.println("list is empty");
  	}
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
			
		}
	}
	

}
