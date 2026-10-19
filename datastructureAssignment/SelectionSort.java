package datastructureAssignment;
	import java.util.Random;

	public class SelectionSort {

	    public static void selectionSort(int[] arr) {

	        for (int i = 0; i < arr.length - 1; i++) {

	            int minIndex = i;

	            for (int j = i + 1; j < arr.length; j++) {

	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }

	            int temp = arr[i];
	            arr[i] = arr[minIndex];
	            arr[minIndex] = temp;
	        }
	    }

	    public static void main(String[] args) {

	        int[] arr = new int[1000];

	        Random random = new Random();

	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = random.nextInt(10000);
	        }

	        long start = System.nanoTime();

	        selectionSort(arr);

	        long end = System.nanoTime();

	        System.out.println("Selection Sort");
	        System.out.println("Array Size: " + arr.length);
	        System.out.println("Execution Time: " + (end - start) + " nanoseconds");
	        System.out.println("Time Complexity: O(n^2)");
	    }
	}

