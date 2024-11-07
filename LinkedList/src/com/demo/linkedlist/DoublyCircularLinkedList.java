package com.demo.linkedlist;

public class DoublyCircularLinkedList {

	
	class Node{
		int data;
		Node next,prev;
		public Node(int data) {
			super();
			this.data = data;
			this.next=null;
			this.prev=null;
		}
		
        		

	}
	
	Node head=null;
	public void addNode(int val) {
		Node newnode=new Node(val);
		if(head==null) {
			head=newnode;
			newnode.next=newnode;
			newnode.prev=newnode;
		}else{
			 Node tail =head.prev;
			 tail.next=newnode;
			 newnode.prev=tail;
			 newnode.next=head;
			 head.prev=newnode;
			
		}
}
	public void dsiplayData() {
		Node temp= head;
		while(temp.next!=head){
			System.out.println(temp.data);
			temp=temp.next;
			
	}
		System.out.println(temp.data);
		
	}
}