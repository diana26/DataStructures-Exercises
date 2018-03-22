package com.ds;

import java.util.Arrays;

public class DynamicArray<T> {
Object[] data;
int size;
	public DynamicArray() {
		size = 0;
		data = new Object[1];
	}
	public int getSize() {
		return data.length;
	}
	public T get(int index) {
		return (T) data[index]; //Casting from object to "T" data type 
	}
	public void put(Object element) {
		Capacity(size + 1);
		data[size++] = element;
	}
	public void Capacity(int minCap) {
		int oldCap = getSize();
		if(minCap > oldCap) {
			int newCap = oldCap * 2; // double the size of the array
			if(newCap < minCap) 
				newCap = minCap;
			data = Arrays.copyOf(data, newCap); //copy data to old array to new array
		}
	}
}
