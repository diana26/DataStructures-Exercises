package com.ds;

public class LinkedList<T> {
	node head;
	public LinkedList() {
		head = null;
	}
	public void add(Object value) {
		node newnode = new node(value, null);
		if(head == null) {
			head = newnode;
		}
		else
			newnode.next = head;
			head = newnode;
	}
	public void delete() {
		head = head.next;
	}
	public void display() {
		node n = head;
		while(n != null) {
			System.out.println((T)n.value);
			n = n.next;
		}
	}
}
