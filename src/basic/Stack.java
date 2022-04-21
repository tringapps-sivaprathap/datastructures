package basic;

import java.util.*;

public class Stack {
	List<Integer> stack = new ArrayList<>();
	int top = -1, size;
	
	// Defining the size of the stack
	Stack(int size) {
		this.size = size;
	}
	
	// Pushing the data
	public void push(int data) {
		if(top == size-1) {
			System.out.println("Stack Overflow.");
		}
		stack.add(data);
		top++;
	}
	
	// Popping the data
	public void pop() {
		if(top == -1) {
			System.out.println("Stack is empty.");
		}
		stack.remove(top);
		top--;
		System.out.println("Successfully poped.");
	}
	
	// Showing the top element
	public void showTop() {
		System.out.println("Top element: " + stack.get(top));
	}
	
	// Displaying the stack
	public void display() {
		for(int n : stack)
			System.out.println(n + " ");
	}
}