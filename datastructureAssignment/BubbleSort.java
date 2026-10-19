package datastructureAssignment;
	import java.util.Random;

	public class BubbleSort {

	    public static void bubbleSort(int[] arr) {

	        for (int i = 0; i < arr.length - 1; i++) {

	            boolean swapped = false;

	            for (int j = 0; j < arr.length - i - 1; j++) {

	                if (arr[j] > arr[j + 1]) {

	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;

	                    swapped = true;
	                }
	            }

	            if (!swapped) {
	                break;
	            }
	        }
	    }

	    public static void main(String[] args) {

	        int[] arr = new int[1000];

	        Random random = new Random();

	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = random.nextInt(10000);
	        }

	        long start = System.nanoTime();

	        bubbleSort(arr);

	        long end = System.nanoTime();

	        System.out.println("Bubble Sort");
	        System.out.println("Array Size: " + arr.length);
	        System.out.println("Execution Time: " + (end - start) + " nanoseconds");
	        System.out.println("Time Complexity: O(n^2)");
	    }
	}

