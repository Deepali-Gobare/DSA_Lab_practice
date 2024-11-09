package com.demo.test;

import com.demo.beans.Customer;
import com.demo.queue.CustomerCircularQueue;

public class testCustomerCircular {
	
		public static void main(String[] args) {
			CustomerCircularQueue q=new CustomerCircularQueue(5);
			q.enqueue(new Customer(1,"rohit","aaaa"));
			q.enqueue(new Customer(2,"sheeta","bbbb"));
			q.enqueue(new Customer(3,"geeta","ccc"));
			q.enqueue(new Customer(4,"rani","ddddd"));
		
			System.out.println("Dequeue: "+q.dequeue());
		
		}

	

}
