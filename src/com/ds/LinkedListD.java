package com.ds;

public class LinkedListD<T> {
	NodeD head;
	public LinkedListD() {
		head = null;
	}
	public void add(Object value) {
		NodeD newnode = new NodeD(value, null, null);
		if(head == null) {
			head = newnode;
		}
		else
			newnode.next = head;
			head.previous = newnode;
			head = newnode;
	}
	public void delete() {
		head = head.next;
		head.previous = null;
	}
	public void display() {
		NodeD n = head;
		while(n != null) {
			System.out.println((T)n.value);
			n = n.next;
		}
	}
}
