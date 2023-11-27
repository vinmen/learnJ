package com.codebottle.problems;

public class Polynomial {
	
	private class Node {
		private int coeff = 0;
		private int exp = 0;
		private Node next = null;
		
		private Node(int coeff, int exp) {
			this.coeff = coeff;
			this.exp = exp;
		}
	}	
	
	private Node head = null;	
	
	public Polynomial() {
		super();
	}
	
	public void Create(int[][] data) {
		for (int[] i : data) {			
			if (head != null) {
				Node node = head;
				while(node.next != null) {
					node = node.next;
				}
				node.next = new Node(i[0], i[1]);			
			} else {
				head = new Node(i[0], i[1]);
			}
		}
	}
	
	public void Print() {
		if(head == null)
			System.out.println("NO DATA");
		
		Node node = head;
		while(node != null) {
			if(node.exp > 1)
				System.out.print(node.coeff + "x" + node.exp + "+");
			else if(node.exp == 1)
				System.out.print(node.coeff + "x+");
			else
				System.out.print(node.coeff);
			
			node = node.next;
		}
	}
	
}
