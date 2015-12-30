package com.practice.cracking.datastructures;

public class LinkedLists {

	public static void main(String[] args) {
		Node n = new Node(10);
		n.appendToTail(15);
		

	}
	
	

}

class Node {
	Node next = null;
	int data;
	
	public Node (int d){
		data = d;
	}
	
	void appendToTail(int d){
		Node end = new Node(d);
		Node n = this;
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
}
