package datastructureAssignment;
	import java.util.Scanner;
	public class Arrayoperations {
	    static Scanner c = new Scanner(System.in);
	    // Function for adding a number
	    static int Add() {
	        System.out.print("Enter the number: ");
	        return c.nextInt();
	    }
	    public static void main(String[] args) {
	        int[] numbers = new int[10];
	        int current = 0;
	        int choice;
	        do {
	            System.out.println("\n----- ARRAY MENU -----");
	            System.out.println("1. Add value");
	            System.out.println("2. Insert at index");
	            System.out.println("3. Fill array");
	            System.out.println("4. Delete last element");
	            System.out.println("5. Delete by index");
	            System.out.println("6. Display");
	            System.out.println("7. Search value");
	            System.out.println("8. Get value at index");
	            System.out.println("9. Replace/Update value at index");
	            System.out.println("10. Size");
	            System.out.println("11. Exit");
	            System.out.print("Enter your choice: ");
	            choice = c.nextInt();
	            switch (choice) {
	                case 1:
	                    if (current == numbers.length) {
	                        System.out.println("Array is full.");
	                    } else {
	                        numbers[current] = Add();
	                        current++;
	                        System.out.println("Number added successfully.");
	                    }
	                    break;
	                case 2:
	                    if (current == numbers.length) {
	                        System.out.println("Array is full.");
	                    } else {
	                        System.out.print("Enter the number you want to insert: ");
	                        int value = c.nextInt();

	                        System.out.print("Enter the index where you want to insert: ");
	                        int index = c.nextInt();

	                        if (index < 0 || index > current) {
	                            System.out.println("Invalid index.");
	                        } else {
	                            for (int i = current; i > index; i--) {
	                                numbers[i] = numbers[i - 1];
	                            }
	                            numbers[index] = value;
	                            current++;
	                            System.out.println("Number inserted successfully.");
	                        }
	                    }
	                    break;
	                case 3:
	                    if (current == numbers.length) {
	                        System.out.println("Array is already full.");
	                    } else {
	                        while (current < numbers.length) {
	                            numbers[current] = Add();
	                            current++;
	                            System.out.print(
	                                "Do you want to add another number? (1 = Yes, 0 = No): "
	                            );
	                            int more = c.nextInt();
	                            if (more == 0) {
	                                break;
	                            }
	                        }
	                        System.out.println("Array filled successfully.");
	                    }
	                    break;
	                case 4:
	                    if (current == 0) {
	                        System.out.println("Array is empty.");
	                    } else {
	                        current--;
	                        numbers[current] = 0;
	                        System.out.println("Last element deleted successfully.");
	                    }
	                    break;
	                case 5:
	                    if (current == 0) {
	                        System.out.println("Array is empty.");
	                    } else {
	                        System.out.print("Enter the index you want to delete: ");
	                        int index = c.nextInt();

	                        if (index < 0 || index >= current) {
	                            System.out.println("Invalid index.");
	                        } else {
	                            for (int i = index; i < current - 1; i++) {
	                                numbers[i] = numbers[i + 1];
	                            }
	                            current--;
	                            numbers[current] = 0;
	                            System.out.println("Number deleted successfully.");
	                        }
	                    }
	                    break;
	                case 6:
	                    if (current == 0) {
	                        System.out.println("Array is empty.");
	                    } else {
	                        System.out.println("Array elements are:");
	                        for (int i = 0; i < current; i++) {
	                            System.out.print(numbers[i] + " ");
	                        }
	                        System.out.println();
	                    }
	                    break;
	                case 7:
	                    if (current == 0) {
	                        System.out.println("Array is empty.");
	                    } else {
	                        System.out.print("Enter the value you want to search: ");
	                        int value = c.nextInt();

	                        boolean found = false;

	                        for (int i = 0; i < current; i++) {
	                            if (numbers[i] == value) {
	                                System.out.println(
	                                    "Value found at index " + i
	                                );
	                                found = true;
	                                break;
	                            }
	                        }
	                        if (!found) {
	                            System.out.println("Value not found.");
	                        }
	                    }
	                    break;
	                case 8:
	                    if (current == 0) {
	                        System.out.println("Array is empty.");
	                    } else {
	                        System.out.print("Enter the index: ");
	                        int index = c.nextInt();
	                        if (index < 0 || index >= current) {
	                            System.out.println("Invalid index.");
	                        } else {
	                            System.out.println(
	                                "Value at index " + index + " = "
	                                + numbers[index]
	                            );
	                        }
	                    }
	                    break;
	                case 9:
	                    if (current == 0) {
	                        System.out.println("Array is empty.");
	                    } else {
	                        System.out.print("Enter the index to update: ");
	                        int index = c.nextInt();
	                        if (index < 0 || index >= current) {
	                            System.out.println("Invalid index.");
	                        } else {
	                            System.out.print("Enter the new value: ");
	                            int newValue = c.nextInt();
	                            numbers[index] = newValue;
	                            System.out.println("Value updated successfully.");
	                        }
	                    }
	                    break;
	                case 10:
	                    System.out.println("Current size of array = " + current);
	                    break;
	                case 11:
	                    System.out.println("Program exited.");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 11);
	        c.close();
	    }
	}

