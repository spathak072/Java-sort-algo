//Problem statement
//        You have been given an array/list and a number k. You have to find the kth smallest number.
//
//        Example:
//        Input: ‘N’ = 5 , 'k' = 2
//        ‘A’ = [3, 2, 11, 5, 1]
//
//        Output: 2
//
//        Explanation: For nums = [3, 2, 11, 5, 1],
//        In the given array, smallest element is 1 and 2nd smallest element is 2 and the value of k is 2. So, our output will be 2.
//        Detailed explanation ( Input/output format, Notes, Images )
//        Input format :
//        The first line contains an Integer 'N', which denotes the size of the array/list.
//
//        The second line contains 'N' single space-separated integers representing the elements in the array/list.
//
//        The third line contains the value of k.
//        Output Format :
//        Return the kth smallest number.

import java.util.Arrays;

public class KthSmallest {
    public static int kthSmallest(int[] arr, int n, int k){
        //Your code goes here
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
        return arr[k-1];
    }

    public static void main(String[] args) {
        int[] A = {3, 2, 11, 5, 1};
        System.out.println(kthSmallest(A,5,2));
    }
}
