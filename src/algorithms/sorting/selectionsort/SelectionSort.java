package algorithms.sorting.selectionsort;

import java.util.Arrays;

/*
     Selection Sort is a simple comparison-based sorting algorithm that repeatedly selects the smallest (or largest)
     element from the unsorted portion of the array and swaps it with the first unsorted element.
     Works by dividing the array into sorted and unsorted parts.
     Each pass moves the next smallest element into its correct position.
 */
public class SelectionSort {

    public static void selectionSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int minIndex = i;
            for(int j = i+1; j < array.length; j++) {
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if(minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int [] myArray = {4, 2, 6, 5, 1, 3};
        selectionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
