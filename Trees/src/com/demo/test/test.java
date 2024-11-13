package com.demo.test;

import com.demo.tree.BST;

public class test {
	public static void main(String[] args) {
		BST bt=new BST();
		bt.insertValue(35);
		bt.insertValue(25);
		bt.insertValue(22);
		bt.insertValue(40);
		bt.insertValue(38);
		bt.insertValue(35);
		bt.insertValue(40);
		bt.insertValue(15);
		bt.insertValue(32);
		bt.insertValue(10);
		bt.insertValue(33);
		bt.inorder();
		bt.preorder();
		bt.postorder();
		
		if (bt.binarysearchByValue(38)) {
			System.out.println("Value Found");
		}else {
			System.out.println("Value Not Found");
		}
		if(bt.binarysearchByValue(100)) {
			System.out.println("Value Found");
		}else {
			System.out.println("Value Not Found");
		}
	}

}
