package com.ds;

import java.util.Arrays;

public class StackDArray<T> {
	Object[] ArrayStack;
	int size;
	int top;
	public StackDArray(int size) {
		this.size = size;
		ArrayStack = new Object[this.size];
		top = -1;
	}
	public void push(Object newItem) {
		Capacity(top + 2);
		top = top + 1;
		ArrayStack[top] = newItem;
	}
	public void Capacity(int minCap) {
		int oldCap = ArrayStack.length;
		if(minCap > oldCap) {
			int newCap = oldCap * 2; // double the size of the array
			if(newCap < minCap) 
				newCap = minCap;
			ArrayStack = Arrays.copyOf(ArrayStack, newCap); //copy data to old array to new array
		}
	}
	public boolean isFull() {
		return(top == size-1);
	}
	public T pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		T item = (T)ArrayStack[top];
		top = top - 1;
		return item;
	}
	public boolean isEmpty() {
		return(top == -1);
	}
	public int getsize() {
		return ArrayStack.length;
	}
}
