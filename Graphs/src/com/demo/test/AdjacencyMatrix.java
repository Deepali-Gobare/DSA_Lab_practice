package com.demo.test;

import java.util.Scanner;

public class AdjacencyMatrix {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter The Number of Vertices");
	int v=sc.nextInt();
	int [][]g = new int[v][v];
	storegraph(g);
	displayGraph(g);

	}

	private static void displayGraph(int[][] g) {
		for(int i=0;i<g.length;i++) {
			for(int j=0;i<g[i].length;j++) {
				System.out.print(g[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

	private static void storegraph(int[][] g) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<g.length;i++) {
			for(int j=0;j<g[i].length;j++) {
				System.out.println("Edge between"+i+"---"+j);
				g[i][j]=sc.nextInt();
			}
		}
	}

}
