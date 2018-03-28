package com.ds;

public class StackLinkedList<T> {

	node top;
	public StackLinkedList() {
		top = null;
	}
	public void push(Object value) {
		node newnode = new node(value, null);
		if(top == null) {
			top = newnode;
		}
		else
			newnode.next = top;
			top = newnode;
	}
	public T pop() {
		if(top == null) {
			System.out.println("Stack is empty");
			return null;
		}
		T value = (T)top.value;
		top = top.next;
		return value;
	
	}

}
