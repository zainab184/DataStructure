package datastructureAssignment;
import java.util.Random;

	public class InsertionSort {

	    public static void insertionSort(int[] arr) {

	        for (int i = 1; i < arr.length; i++) {

	            int key = arr[i];

	            int j = i - 1;

	            while (j >= 0 && arr[j] > key) {

	                arr[j + 1] = arr[j];

	                j--;
	            }

	            arr[j + 1] = key;
	        }
	    }

	    public static void main(String[] args) {

	        int[] arr = new int[1000];

	        Random random = new Random();

	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = random.nextInt(10000);
	        }

	        long start = System.nanoTime();

	        insertionSort(arr);

	        long end = System.nanoTime();

	        System.out.println("Insertion Sort");
	        System.out.println("Array Size: " + arr.length);
	        System.out.println("Execution Time: " + (end - start) + " nanoseconds");
	        System.out.println("Time Complexity: O(n^2)");
	    }
	}

