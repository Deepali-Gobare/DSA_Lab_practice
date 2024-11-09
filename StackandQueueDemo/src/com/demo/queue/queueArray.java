package com.demo.queue;

public class queueArray {
	int front;
	int rear;
	int [] arr;
	
	public queueArray() {
		front=0;
		rear=0;
		arr=new int [10];
	}

	public queueArray(int size) {
		super();
		this.front =0;
		this.rear = 0;
		this.arr = new int [size];
	}
	
	public boolean isFull() {
		return rear==arr.length;
	}
	public boolean isEmpty() {
		return front==rear;
	}
	public void enqueue(int val) {
		if(isFull()) {
			System.out.println("Th array is full");
		}else {
			arr[rear]=val;
			rear++;
		}
		
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("List is Empty");
		}
		int a=arr[front];
		front++;
		return a;
	}
	
	
}
	