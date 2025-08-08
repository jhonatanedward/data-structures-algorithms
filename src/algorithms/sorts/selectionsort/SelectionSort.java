package algorithms.sorts.selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int maxIndex = i;
            for(int j = i+1; j < array.length; j++) {
                if(array[j] < array[maxIndex]) {
                    maxIndex = j;
                }
            }
            if(maxIndex != i) {
                int temp = array[i];
                array[i] = array[maxIndex];
                array[maxIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int [] myArray = {4, 2, 6, 5, 1, 3};
        selectionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
