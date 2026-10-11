package datastructureAssignment;
	import java.util.Scanner;
	public class ArrayOperation {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        final int MAX = 10;
	        int[] arr = new int[MAX];
	        int size = 0;
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
	            choice = input.nextInt();
	            switch (choice) {
	                case 1:
	                    if (size == MAX) {
	                        System.out.println("Array is full.");
	                    } else {
	                        System.out.print("Enter value: ");
	                        int value = input.nextInt();
	                        arr[size] = value;
	                        size++;
	                        System.out.println("Value added successfully.");
	                    }
	                    break;
	                case 2:
	                    if (size == MAX) {
	                        System.out.println("Array is full.");
	                    } else {
	                        System.out.print("Enter index: ");
	                        int index = input.nextInt();
	                        if (index < 0 || index > size) {
	                            System.out.println("Invalid index.");
	                        } else {
	                            System.out.print("Enter value: ");
	                            int newValue = input.nextInt();

	                            for (int i = size; i > index; i--) {
	                                arr[i] = arr[i - 1];
	                            }
	                            arr[index] = newValue;
	                            size++;
	                            System.out.println("Value inserted successfully.");
	                        }
	                    }
	                    break;
	                case 3:
	                    while (size < MAX) {
	                        System.out.print("Enter value: ");
	                        int num = input.nextInt();
	                        arr[size] = num;
	                        size++;
	                        if (size == MAX) {
	                            System.out.println("Array is now full.");
	                            break;
	                        }
	                        System.out.print("Do you want to add another value? (1 = Yes, 0 = No): ");
	                        int again = input.nextInt();
	                        if (again == 0) {
	                            break;
	                        }
	                    }
	                    break;
	                case 4:
	                    if (size == 0) {
	                        System.out.println("Array is empty.");
	                    } else {
	                        size--;
	                        System.out.println("Last element deleted successfully.");
	                    }
	                    break;
	                case 5:
	                    if (size == 0) {
	                        System.out.println("Array is empty.");
	                    } else {
	                        System.out.print("Enter index to delete: ");
	                        int deleteIndex = input.nextInt();

	                        if (deleteIndex < 0 || deleteIndex >= size) {
	                            System.out.println("Invalid index.");
	                        } else {
	                            for (int i = deleteIndex; i < size - 1; i++) {
	                                arr[i] = arr[i + 1];
	                            }
	                            size--;
	                            System.out.println("Element deleted successfully.");
	                        }
	                    }
	                    break;
	                case 6:
	                    if (size == 0) {
	                        System.out.println("Array is empty.");
	                    } else {
	                        System.out.println("Array elements:");

	                        for (int i = 0; i < size; i++) {
	                            System.out.print(arr[i] + " ");
	                        }
	                        System.out.println();
	                    }
	                    break;
	                case 7:
	                    if (size == 0) {
	                        System.out.println("Array is empty.");
	                    } else {
	                        System.out.print("Enter value to search: ");
	                        int searchValue = input.nextInt();
	                        boolean found = false;
	                        for (int i = 0; i < size; i++) {
	                            if (arr[i] == searchValue) {
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
	                    if (size == 0) {
	                        System.out.println("Array is empty.");
	                    } else {
	                        System.out.print("Enter index: ");
	                        int getIndex = input.nextInt();

	                        if (getIndex < 0 || getIndex >= size) {
	                            System.out.println("Invalid index.");
	                        } else {
	                            System.out.println(
	                                "Value at index " + getIndex +
	                                " = " + arr[getIndex]
	                            );
	                        }
	                    }
	                    break;
	                case 9:
	                    if (size == 0) {
	                        System.out.println("Array is empty.");
	                    } else {
	                        System.out.print("Enter index: ");
	                        int updateIndex = input.nextInt();
	                        if (updateIndex < 0 || updateIndex >= size) {
	                            System.out.println("Invalid index.");
	                        } else {
	                            System.out.print("Enter new value: ");
	                            int updatedValue = input.nextInt();
	                            arr[updateIndex] = updatedValue;
	                            System.out.println("Value updated successfully.");
	                        }
	                    }
	                    break;
	                case 10:
	                    System.out.println("Current size of array = " + size);
	                    break;
	                case 11:
	                    System.out.println("Program exited.");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }

	        } while (choice != 11);
	        input.close();
	    }
	}

