package com.ds;

public class RunLinkedListD {

	public static void main(String[] args) {
		LinkedListD<String> LS = new LinkedListD<String>();
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
