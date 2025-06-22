//Problem statement
//        You are given an integer array 'arr' of size 'N'.
//
//        Note:
//        Change in the input array itself. You don't need to return or print the elements.

import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] arr, int size) {
        //Your code goes here
        for (int i = 1; i < size; i++) {
            int j = i - 1, temp = arr[i];
            while (j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Insertion Sort");
        int[] arr = {9, 3, 6, 2, 0};
        int size = arr.length;
        System.out.println(Arrays.toString(insertionSort(arr,size)));
    }
}
