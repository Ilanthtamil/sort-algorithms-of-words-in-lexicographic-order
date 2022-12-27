package com.company;

public class Quick_Sort {
	    public static void quickSort(String[] words, int lowIndex, int highIndex)
	    {
	        //base case - stop if the index is pointing to the same element
	        if (lowIndex >= highIndex)
	            return;

	        //call partition function to swap the elements before pivot
	        int leftPointer = partition(words, lowIndex, highIndex);

	        //recursively do sorting for left of the pivot
	        quickSort(words, lowIndex, leftPointer-1);
	        //recursively do sorting for right of the pivot
	        quickSort(words, leftPointer+1, highIndex);
	    }

	    private static int partition(String[] words, int leftPointer, int rightPointer)
	    {

	        //choose first element as pivot
	        String pivot = words[leftPointer];
	        swap(words, leftPointer, rightPointer);

	        //choose the last element from array as pivot
	        //String pivot = words[rightPointer];
	        int highIndex = rightPointer;

	        //traverse the array
	        while (leftPointer < rightPointer)
	        {
	            //move leftPointer to the right until found an element bigger than pivot
	            while (words[leftPointer].compareToIgnoreCase(pivot) <= 0 && leftPointer < rightPointer)
	            {
	                leftPointer++;
	            }

	            //move rightPointer to the left until found an element smaller than pivot
	            while (words[rightPointer].compareToIgnoreCase(pivot) >= 0 && leftPointer < rightPointer)
	            {
	                rightPointer--;
	            }

	            //swap the elements
	            swap(words, leftPointer, rightPointer);
	        }

	        swap(words, leftPointer, highIndex);
	        //return as the position where the pivot is
	        return leftPointer;
	    }

	    private static void swap(String[] words, int index1, int index2)
	    {
	        String temp = words[index1];
	        words[index1] = words[index2];
	        words[index2] = temp;
	    }

}
