package datastructureAssignment;
	import java.util.Random;
	public class Comparsion {

	    public static void main(String[] args) {

	        int size = 1000;

	        // Original random array
	        int[] original = new int[size];

	        Random random = new Random();

	        for (int i = 0; i < size; i++) {
	            original[i] = random.nextInt(10000);
	        }
	        
	        int[] mergeArray = original.clone();
	        int[] selectionArray = original.clone();
	        int[] bubbleArray = original.clone();
	        int[] insertionArray = original.clone();

	        // MERGE SORT 

	        long start = System.nanoTime();

	        MergeSort.mergeSort(mergeArray, 0, mergeArray.length - 1);

	        long end = System.nanoTime();

	        long mergeTime = end - start;


	        // SELECTION SORT

	        start = System.nanoTime();

	        SelectionSort.selectionSort(selectionArray);

	        end = System.nanoTime();

	        long selectionTime = end - start;


	        // BUBBLE SORT

	        start = System.nanoTime();

	        BubbleSort.bubbleSort(bubbleArray);

	        end = System.nanoTime();

	        long bubbleTime = end - start;


	        // INSERTION SORT

	        start = System.nanoTime();

	        InsertionSort.insertionSort(insertionArray);

	        end = System.nanoTime();

	        long insertionTime = end - start;


	        // COMPARISON 

	        System.out.println("==============================================");
	        System.out.println("       SORTING ALGORITHM COMPARISON");
	        System.out.println("==============================================");

	        System.out.println("Array Size: " + size);
	        System.out.println();

	        System.out.println("Algorithm       Execution Time       Complexity");
	        System.out.println("------------------------------------------------");

	        System.out.println("Merge Sort      " + mergeTime
	                + " ns          O(n log n)");

	        System.out.println("Selection Sort  " + selectionTime
	                + " ns          O(n^2)");

	        System.out.println("Bubble Sort     " + bubbleTime
	                + " ns          O(n^2)");

	        System.out.println("Insertion Sort  " + insertionTime
	                + " ns          O(n^2)");

	        System.out.println("==============================================");
	    }
	}

