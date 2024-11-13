package com.demo.test;

import java.util.Scanner;

import com.demo.lists.Graph;

public class AdjacenecyList {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number of Vertices");
		int v= sc.nextInt();
		Graph g = new Graph(v);
		storeGraph(g,v);
		g.printgraph();
		
	}

	private static void storeGraph(Graph g, int v) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<v;i++) {
			for(int j=0;j<v;j++) {
				System.out.println("Edge between "+i+"--"+j);
				int val=sc.nextInt();
				if(val==1) {
					g.addEdge(j, val);
				}
			}
			
				
		}
		
	}
}
