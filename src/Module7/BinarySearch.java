package Module7;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,4,6,7,8,9,10,21,45};
        int target=7;
        int result=binarySearch(arr,target);
        if(result==-1){
            System.out.println("Element not present in array");
        }else{
            System.out.println("Target element is present in the index: "+result);
        }
    }
    public static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}