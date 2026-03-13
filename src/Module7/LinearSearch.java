package Module7;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={2,3,7,3,6,3,2,5,4};
        int target=7;
        int result=linearSearch(arr,target);
        if(result==-1){
            System.out.println("Element not present in array");
        }else{
            System.out.println("Target element is present in the index: "+result);
        }

    }
    static int linearSearch(int[] arr,int target){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}