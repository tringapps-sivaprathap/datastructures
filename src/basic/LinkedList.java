package basic;

public class LinkedList {
	Node head;
	
	// Inserting at the end
	public void insertEnd(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
		}
		else {
			// traverse to the end and insert
			Node temp = head;
			while(temp.next != null)
				temp = temp.next;
			temp.next = node;
		}
		System.out.println("Successfully inserted");
	}
	
	// Inserting at a particular position
	public void insertAt(int index,int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(index == 0) {
			node.next = head;
			head = node;
		}
		else {
		Node n = head;
		for(int i=0; i < index-1; i++) {
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
		}
		System.out.println("Successfully inserted at index: " + index);
	}
	
	// Deleting from a particular position
	public void deleteAt(int index) {
		if(index == 0) {
			head = head.next;
		}
		else {
			Node temp = head;
			Node n = null;
			for(int i=0; i < index-1; i++) {
				temp = temp.next;
			}
			n = temp.next;
			temp.next = n.next;
			n = null;
		}
		System.out.println("Successfully deleted.");
	}
	
	// Displaying the LinkedList
	public void display() {
		Node node = head;
		
		while(node.next != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		
		System.out.println(node.data);
	}
}