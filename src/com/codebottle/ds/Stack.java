package com.codebottle.ds;

public class Stack<T> {
	
	private T data = null;
	private Stack<T> top = null;	
	private Stack<T> previous = null;	
	
	public Stack() {
		super();
	}
	
	public void push(T input) {
		Stack<T> temp = new Stack<T>();
		temp.data = input;	
		
		if(top == null) {			
			top = temp;	
		}
		else {			
			temp.previous = top;
			top = temp;			
		}
	}
	
	public T pop() {
		if(isEmpty()) {
			return null;
		}
		T output = top.data;
		if(top.previous == null) {
			top = null;			
		}
		else {
			top = top.previous;
		}		
		return output;
	}
	
	public T peek() {
		if(isEmpty()) {
			return null;
		}
		return top.data;
	}
	
	public boolean isEmpty() {
		if(top == null) {
			return true;
		}
		return false;
	}
}
