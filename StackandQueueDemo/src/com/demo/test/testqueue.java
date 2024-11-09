package com.demo.test;

import com.demo.queue.queueArray;
import com.demo.queue.queueLinkedList;

public class testqueue {
        
	       public static void main(String[] args) {
	    	queueArray ql= new queueArray();
//			queueLinkedList ql=new queueLinkedList();
			ql.enqueue(3);
			ql.enqueue(2);
			ql.enqueue(5);
			ql.enqueue(8);
			ql.enqueue(6);
			while(!ql.isEmpty()) {
				System.out.println(ql.dequeue());
			}
		}
}
