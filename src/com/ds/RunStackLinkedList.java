package com.ds;

public class RunStackLinkedList {

	public static void main(String[] args) {
		StackLinkedList<String> st = new StackLinkedList<String>();
		//st.pop();
		st.push("Diana");
		st.push("Hugo");
		st.push("Cafeino");
		st.push("Laura");
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		}
	}

