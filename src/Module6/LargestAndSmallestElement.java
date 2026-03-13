package Module6;

public class LargestAndSmallestElement {
    public static void main(String[] args) {
        int[] arr={4,2,3,7,8,2,9};
        int max=arr[0];
        int min=arr[0];
        for(int num:arr){
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }
        System.out.println("Smallest :"+min+" Largest :"+max);
    }
}