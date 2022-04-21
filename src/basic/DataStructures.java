package basic;

import java.util.Scanner;

public class DataStructures {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int flag = 0, data, index;
		
		System.out.println("What do you want to use? 1.LinkedList, 2.Stack, 3.Queue");
		System.out.print("Enter choice: ");
		int choice = s.nextInt();
		
		if(choice == 1) {
			// LinkedList
			LinkedList obj = new LinkedList();
			while(flag == 0) {
				// LinkedList Methods
				System.out.println("Options: 1.insertEnd, 2.insertAt, 3.deleteAt, 4.display, 5.exit");
				int ch = s.nextInt();
				switch(ch) {
				case 1:
					System.out.print("Enter data: ");
					data = s.nextInt();
					obj.insertEnd(data);
					break;
				case 2:
					System.out.print("Enter index: ");
					index = s.nextInt();
					System.out.print("Enter data: ");
					data = s.nextInt();
					obj.insertAt(index, data);
					break;
				case 3:
					System.out.print("Enter index: ");
					index = s.nextInt();
					obj.deleteAt(index);
					break;
				case 4:
					obj.display();
					break;
				default:
					flag = 1;
					System.out.println("Thank You.");
					break;
				}
			}
		}
		else if(choice == 2) {
			// Stack
			Stack obj = new Stack(5);
			while(flag == 0) {
				// Stack Methods
				System.out.println("Options: 1.push, 2.pop, 3.showTop, 4.display, 5.exit");
				int ch = s.nextInt();
				switch(ch) {
				case 1:
					System.out.print("Enter data: ");
					data = s.nextInt();
					obj.push(data);
					break;
				case 2:
					obj.pop();
					break;
				case 3:
					obj.showTop();
					break;
				case 4:
					obj.display();
					break;
				default:
					flag = 1;
					System.out.println("Thank You.");
					break;
				}
			}
			
		}
		else if(choice == 3) {
			// Queue
			Queue obj = new Queue();
			while(flag == 0) {
				// Queue Methods
				System.out.println("Options: 1.enqueue, 2.dequeue, 3.display, 4.exit");
				int ch = s.nextInt();
				switch(ch) {
				case 1:
					System.out.print("Enter data: ");
					data = s.nextInt();
					obj.enuqeue(data);
					break;
				case 2:
					obj.dequeue();
					break;
				case 3:
					obj.display();
					break;
				default:
					flag = 1;
					System.out.println("Thank You.");
					break;
				}
			}
		}
		else {
			System.out.println("Choice doesn't exist.");
		}
		s.close();
	}
}