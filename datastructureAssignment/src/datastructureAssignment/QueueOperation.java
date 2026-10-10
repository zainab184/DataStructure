package datastructureAssignment;
	import java.util.Scanner;
	public class QueueOperation{
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        final int MAX = 10;
	        int[] queue = new int[MAX];
	        int front = 0;
	        int rear = -1;
	        int choice;
	        do {
	            System.out.println("\n----- QUEUE MENU -----");
	            System.out.println("1. Enqueue");
	            System.out.println("2. Dequeue");
	            System.out.println("3. Display");
	            System.out.println("4. Size");
	            System.out.println("5. isEmpty");
	            System.out.println("6. isFull");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");
	            choice = input.nextInt();
	            switch (choice) {
	                case 1:
	                    if (rear == MAX - 1) {
	                        System.out.println("Queue is full.");
	                    } else {
	                        System.out.print("Enter token number: ");
	                        int value = input.nextInt();
	                        rear++;
	                        queue[rear] = value;
	                        System.out.println("Value added to queue successfully.");
	                    }
	                    break;
	                case 2:
	                    if (front > rear) {
	                        System.out.println("Queue is empty.");
	                    } else {
	                        int removed = queue[front];
	                        front++;
	                        System.out.println("Dequeued value: " + removed);
	                    }
	                    break;
	                case 3:
	                    if (front > rear) {
	                        System.out.println("Queue is empty.");
	                    } else {
	                        System.out.println("Queue elements (Front to Rear):");
	                        for (int i = front; i <= rear; i++) {
	                            System.out.print(queue[i] + " ");
	                        }
	                        System.out.println();
	                    }
	                    break;
	                case 4:
	                    if (front > rear) {
	                        System.out.println("Current size of queue = 0");
	                    } else {
	                        int size = rear - front + 1;
	                        System.out.println("Current size of queue = " + size);
	                    }
	                    break;
	                case 5:
	                    if (front > rear) {
	                        System.out.println("Queue is empty.");
	                    } else {
	                        System.out.println("Queue is not empty.");
	                    }
	                    break;
	                case 6:
	                    if (rear == MAX - 1) {
	                        System.out.println("Queue is full.");
	                    } else {
	                        System.out.println("Queue is not full.");
	                    }
	                    break;
	                case 7:
	                    System.out.println("Program exited.");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 7);
	        input.close();
	    }
	}

