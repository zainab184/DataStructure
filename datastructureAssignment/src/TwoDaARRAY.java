package datastructureAssignment;
import java.util.Scanner;
public class TwoDaARRAY {
    static Scanner sc = new Scanner(System.in);
    static int[][] arr = new int[3][3];
    static int size = 0;
    static int MAX = 9;
    static void insert() {
        if (size == MAX) {
            System.out.println("Array is Full!");
            return;
        }
        System.out.print("Enter value: ");
        int value = sc.nextInt();

        int row = size / 3;
        int col = size % 3;

        arr[row][col] = value;
        size++;

        System.out.println("Value inserted successfully.");
    }

    static void display() {
        if (size == 0) {
            System.out.println("Array is Empty!");
            return;
        }
        System.out.println("2D Array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i * 3 + j) < size)
                    System.out.print(arr[i][j] + " ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
    static void search() {
        System.out.print("Enter value to search: ");
        int value = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (arr[i][j] == value && (i * 3 + j) < size) {
                    System.out.println("Value found at Row " + i +
                                       ", Column " + j);
                    return;
                }
            }
        }
        System.out.println("Value not found.");
    }
    static void update() {
        System.out.print("Enter row (0-2): ");
        int row = sc.nextInt();
        System.out.print("Enter column (0-2): ");
        int col = sc.nextInt();
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            System.out.println("Invalid position.");
            return;
        }
        System.out.print("Enter new value: ");
        arr[row][col] = sc.nextInt();

        System.out.println("Value updated successfully.");
    }
    static void delete() {
        if (size == 0) {
            System.out.println("Array is Empty!");
            return;
        }
        int row = (size - 1) / 3;
        int col = (size - 1) % 3;
        arr[row][col] = 0;
        size--;
        System.out.println("Last value deleted successfully.");
    }
    static void size() {
        System.out.println("Size = " + size);
    }
    static void isEmpty() {
        if (size == 0)
            System.out.println("Array is Empty.");
        else
            System.out.println("Array is not Empty.");
    }
    static void isFull() {
        if (size == MAX)
            System.out.println("Array is Full.");
        else
            System.out.println("Array is not Full.");
    }
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n----- 2D ARRAY MENU -----");
            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Search");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Size");
            System.out.println("7. isEmpty");
            System.out.println("8. isFull");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    insert();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    update();
                    break;
                case 5:
                    delete();
                    break;
                case 6:
                    size();
                    break;
                case 7:
                    isEmpty();
                    break;
                case 8:
                    isFull();
                    break;
                case 9:
                    System.out.println("Program Ended.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 9);
        sc.close();
    }


}
