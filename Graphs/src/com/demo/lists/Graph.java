package com.demo.lists;

public class Graph {
	private MyLinkedList[] g;
	public Graph(int v) {
		g=new MyLinkedList[v];
		for(int i=0;i<v;i++) {
				g[i]=new MyLinkedList(null);	
			}
	}
	public void addEdge(int src,int des) {
		g[src].addValue(des);
	}
	
	public void printgraph() {
		for(int i=0;i<g.length;i++) {
			System.out.println(i);
			g[i].displaylist();
		}
	}
	
	

}
