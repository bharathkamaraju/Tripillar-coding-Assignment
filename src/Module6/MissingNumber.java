package Module6;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7,8};
        int n=arr.length+1;
        int totalsum=n*(n+1)/2;
        int arraysum=0;
        for(int num:arr){
            arraysum+=num;
        }
        int Missingnumber=totalsum-arraysum;
        System.out.println("Missing number in an array is: "+Missingnumber);
    }
}