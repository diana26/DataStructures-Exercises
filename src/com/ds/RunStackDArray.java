package com.ds;

public class RunStackDArray {

	public static void main(String[] args) {
		StackDArray<Integer> st = new StackDArray<Integer>(2);
		st.push(15);
		st.push(145);
		System.out.println("Size od the stack: " + st.getsize());
		st.push(78);
		System.out.println("Size od the stack: " + st.getsize());
		st.push(96);
		st.push(21);
		System.out.println("Size od the stack: " + st.getsize());
	}

}
