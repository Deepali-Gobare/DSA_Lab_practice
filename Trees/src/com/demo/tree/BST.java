package com.demo.tree;

public class BST {
         class Node{
        	 int data;
        	 Node left;
        	 Node right;
			public Node(int data) {
				super();
				this.data = data;
				this.left = null;
				this.right = null;
			}
        	 
         }
         Node root=null;
         
         public void insertValue(int val) {
        	 root=insertData(root,val);
        	 
         }
         private Node insertData(Node root,int val) {
        	 Node newNode=new Node(val);
        	 if(root==null) {
        		 root=newNode;
        		 return root;
        	 }
        	 else if(val<root.data) {
        		 root.left=insertData(root.left,val);
        	 }else
        	 {
        		 root.right=insertData(root.right,val);
        	 }
        	
        	 return root;
         }
         public void inorder() {
        	 inorderTraversal(root);
 			System.out.println("------------");
         }
		private void inorderTraversal(Node root) {
			if(root!=null) {
			inorderTraversal(root.left);
			System.out.println(root.data);
			inorderTraversal(root.right);
			}
		
			
		}
		public void preorder() {
			preorderTraversal(root);
			System.out.println("------------");
		}
		private void preorderTraversal(Node root) {
			if(root!=null) {
				System.out.println(root.data);
				preorderTraversal(root.left);
				preorderTraversal(root.right);
			}
			
			
		}
		public void postorder() {
			postorderTraversal(root);
			System.out.println("------------");
		}
		private void postorderTraversal(Node root) {
			if(root!=null) {
				postorderTraversal(root.left);
				
				postorderTraversal(root.right);
				System.out.println(root.data);
			}
		}
		
		public boolean binarysearchByValue(int val) {
			return binarySearchByData(root,val);
			
		}
		private boolean binarySearchByData(Node root, int val) {
			if(root==null) {
				return false;
			}
			if(root.data==val) {
				return true;
			}
			else if(val<root.data) {
				return binarySearchByData(root.left,val);
			}
			else {
				return binarySearchByData(root.right,val);
			}
			
			
			
		}
         
}
