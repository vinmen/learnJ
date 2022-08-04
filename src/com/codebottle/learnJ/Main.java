package com.codebottle.learnJ;

import com.codebottle.ds.*;

public class Main {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(10);
		stack.push(20);
		
		System.out.println(stack.peek());
		
		stack.push(30);
		
		System.out.println(stack.isEmpty());
		
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack.isEmpty());

	}

}
