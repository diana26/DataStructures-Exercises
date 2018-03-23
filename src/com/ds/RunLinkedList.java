package com.ds;

public class RunLinkedList {

	public static void main(String[] args) {
		LinkedList<String> LS = new LinkedList<String>();
		LS.add("Diana");
		LS.display();
		LS.add("Hugo");
		LS.add("Stannis");
		LS.add("Cafeino");
		LS.display();
		System.out.println("After deleted: ");
		LS.delete();
		LS.display();
	}

}
