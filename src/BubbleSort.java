//Problem statement
//        You are given an integer array 'arr' of size 'N'.
//
//
//
//        You must sort this array using 'Bubble Sort'.
//
//
//
//        Note:
//        Change in the input array itself. You don't need to return or print the elements.
//        Example:
//        Input: ‘N’ = 7
//        'arr' = [2, 13, 4, 1, 3, 6, 28]
//
//        Output: [1 2 3 4 6 13 28]
//
//        Explanation: After applying bubble sort on the input array, the output is [1 2 3 4 6 13 28].

import java.util.Arrays;

public class BubbleSort {
    public static int[] sort(int[] A){
        int parse = A.length - 1;
        for (int i = 0; i < parse; i++) {
            for (int j = 0; j < parse - i; j++) {
                if(A[j] > A[j+1]){
                    var temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        return A;
    }
    public static void main(String[] args) {
        System.out.println("Bubble Sort");
        int[] A = {2, 13, 4, 1, 3, 6, 28};
        int[] sortedArray = sort(A);
        System.out.println(Arrays.toString(sortedArray));
    }
}
