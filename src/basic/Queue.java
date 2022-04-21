package basic;

import java.util.ArrayList;
import java.util.List;

public class Queue {
	List<Integer> queue = new ArrayList<>();
	int front = -1, rear = -1, size;
	
	// Inserting data at rear
	public void enuqeue(int data) {
		queue.add(data);
		front = 0;
		rear++;
		size++;
	}
	
	// Removing data from front
	public void dequeue() {
		if(front == -1) {
			System.out.println("Queue is empty.");
		}
		queue.remove(front);
		rear--;
		size--;
		System.out.println("Successfully removed.");
	}
	
	// Displaying the Queue
	public void display() {
		for(int n : queue)
			System.out.println(n + " ");
	}
}