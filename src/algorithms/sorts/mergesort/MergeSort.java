package algorithms.sorts.mergesort;

import java.util.Arrays;

public class MergeSort {

    public int[] merge(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while(i < array1.length && j < array2.length) {
            if(array1[i] < array2[j]) {
                mergedArray[index] = array1[i];
                index++;
                i++;
            } else {
                mergedArray[index] = array2[j];
                index++;
                j++;
            }
        }

        while(i < array1.length) {
            mergedArray[index] = array1[i];
            index++;
            i++;
        }

        while(j < array2.length) {
            mergedArray[index] = array1[j];
            index++;
            j++;
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arra1 = {1, 3, 7, 8};
        int[] arra2 = {2, 4, 5, 6};
        MergeSort mergeSort = new MergeSort();
        System.out.println(Arrays.toString(mergeSort.merge(arra1, arra2)));
    }
}
