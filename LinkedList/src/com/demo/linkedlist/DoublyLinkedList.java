package com.demo.linkedlist;

public class DoublyLinkedList {
	
	class Node{
		int data;
		Node next,prev;
		
		
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
			this.prev = null;
		}


		public Node() {
			super();
		}
		
		
	}
		Node head;

	public void addNode(int val) {
		
		Node newnode=new Node(val);
		if(head==null) {
			head=newnode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
			  temp=temp.next;			
			}
			temp.next=newnode;
			newnode.prev=temp;
		}
	}

	public void displaydata() {
		if(head==null) {
			System.out.println("List is empty");
		}
		else{
			Node temp=head;
			while(temp!=null) {
			  System.out.println(temp.data); 
		temp=temp.next;
				}
		}
		
	}
     
	public void addBeforPosition(int val,int key) {
		if(head==null) {
			System.out.println("List not found");
		}else {
		Node newNode=new Node(val);
		if(head.data==key) {
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}else {
			Node temp=head;
			while(temp!=null && temp.data!=key) {
				temp=temp.next;
			}
			if(temp!=null) {
				newNode.next=temp;
				newNode.prev=temp.prev;
				temp.prev.next=newNode;
				temp.prev=newNode;
			
				
			}else {
				System.out.println("key not found");
			}
		}
		}
	}
	
	public void addByPosition(int pos,int val) {
		Node newNode=new Node(val);
          if(pos==1) {
        	  if(head==null) {
        		  head=newNode;
        	  }
        	  newNode.next=head;
        	  head.prev=newNode;
        	  head=newNode;
          }else {
        	  Node temp=head;
        	  for(int i=1;i<=pos-2;i++) {
        		  temp=temp.next;
        	  }
        	  newNode.next=temp.next;
        	  temp.next.prev=newNode;
        	  temp.next=newNode;
        	  newNode.prev=temp;
          }
		
	}

	public void deleteByPosition(int pos) {
		Node temp=head;
		if(pos==1) {
			if(head!=null) {
				head=head.next;
				if(temp.next!=null) {
					temp.next.prev=null;
					temp.next=null;
					temp=null;
				}
			}
			
		}else {
			for(int i=1; temp!=null && i<=pos-1;i++) {
				temp=temp.next;
			}
			temp.next.prev=temp.prev;
			temp.prev.next=temp.next;
			temp.next=null;
			temp.prev=null;
			temp=null;
		}
		
		
	}

	public void addAfterPosition(int val, int key) {
		if (head==null) {
			System.out.println("list Is empty");
		}else {
				Node temp=head;
				while(temp!=null && temp.data!=key) {
					temp=temp.next;
				}
				if(temp!=null) {
					Node newnode=new Node(val);
					newnode.next=temp.next;
					newnode.prev=temp;
					if(temp.next!=null) {
						temp.next.prev=newnode;
					}
					temp.next=newnode;
				}
				
		
		}
		
		
	}

	public void displayReverseData() {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		while(temp.prev!=null) {
		  System.out.println(temp.data);
		  temp=temp.prev;
		}
		
	}
}
