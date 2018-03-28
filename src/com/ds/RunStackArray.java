package com.ds;

import java.util.Scanner;

public class RunStackArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		StackArray<Integer> stack = new StackArray<Integer>(n);
		for(int i = 0; i < n; i++) {
		i = scan.nextInt();
		stack.push(i);
		}
		while(!stack.isEmpty())
		System.out.println(stack.pop());
		stack.pop();
		
	}

}
