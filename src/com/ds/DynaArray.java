package com.ds;

public class DynaArray {

	public static void main(String[] args) {
		DynamicArray<Integer> dynamicArray = new DynamicArray<Integer>();
		dynamicArray.put(11);
		System.out.println("Size: " + dynamicArray.getSize());
		dynamicArray.put(15);
		System.out.println("Size: " + dynamicArray.getSize());
		dynamicArray.put(19);
		System.out.println("Size: " + dynamicArray.getSize());
		dynamicArray.put(23);
		System.out.println("Size: " + dynamicArray.getSize());
		dynamicArray.put(34);
		System.out.println("Size: " + dynamicArray.getSize());
		dynamicArray.put(47);
		System.out.println("Size: " + dynamicArray.getSize());
		dynamicArray.put(55);
		System.out.println("Size: " + dynamicArray.getSize());
		System.out.println("Element aved is:");

		for(int i = 0; i < dynamicArray.getSize(); i++) {
			System.out.println(dynamicArray.get(i));
		}
	}

}
