package Module6;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr={4,2,6,2,6,3,7,3,3,4};
        int largest=arr[0];
        int secondLargest=arr[0];
        for(int num:arr){
            if (num > largest) {
                secondLargest = largest; // Update secondLargest to old largest
                largest = num;           // Update largest to current number
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println("Second Largest element :"+secondLargest);
    }
}