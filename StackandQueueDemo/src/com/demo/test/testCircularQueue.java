package com.demo.test;

import com.demo.queue.circularQueue;

public class testCircularQueue {
	public static void main(String[] args) {
		circularQueue qc=new circularQueue(5);
		qc.enqueue(4);
		qc.enqueue(5);
		qc.enqueue(1);
		qc.enqueue(13);
		System.out.println("Data : "+qc.dequeue());
		qc.enqueue(5);
		qc.enqueue(20);
		System.out.println("Data : "+qc.dequeue());
		System.out.println("Data : "+qc.dequeue());

	}


}
