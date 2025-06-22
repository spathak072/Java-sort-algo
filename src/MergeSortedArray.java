import java.util.Arrays;

//Problem statement
//   You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively,
//   merge them into a third array/list such that the third array is also sorted.
public class MergeSortedArray {
    public static int[] merge(int[] arr1, int[] arr2) {
        //Your code goes here
        int arr1ElementCount = arr1.length;
        int arr2ElementCount = arr2.length;
        int totalElement = arr1ElementCount + arr2ElementCount;
        int[] result = new int[totalElement];
        int i=0,j=0,k=0;
        while (i<arr1ElementCount &&  j<arr2ElementCount){
            if(arr1[i]<arr2[j]) {
                result[k] = arr1[i];
                i++;
            }else{
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i<arr1ElementCount){
            result[k] = arr1[i];
            i++;
            k++;
        }

        while (j<arr2ElementCount){
            result[k] = arr2[j];
            j++;
            k++;
        }

        return  result;

    }

    public static void main(String[] args) {
        System.out.println("Merge Sorted Array");
        int[] arr1 = {1, 3, 4, 7, 11};
        int[] arr2 = {2, 4, 6, 13};
        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }

}
