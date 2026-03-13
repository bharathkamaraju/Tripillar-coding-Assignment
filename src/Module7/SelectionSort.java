package Module7;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,3,7,3,6,3,2,5,4};
        selectionSort(arr);
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int minIdx=i;
            for (int j = i+1; j <=arr.length-1; j++) {
                if(arr[j]<arr[minIdx]){
                    minIdx=j;
                }
                if(minIdx!=i){
                    int temp=arr[i];
                    arr[i]=arr[minIdx];
                    arr[minIdx]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}