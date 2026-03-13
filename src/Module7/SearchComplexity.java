package Module7;

public class SearchComplexity {

    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50};
        int key = 30;

        // Linear Search
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("Linear Search found at index: " + i);
                break;
            }
        }

        // Binary Search
        int low = 0;
        int high = arr.length-1;

        while(low<=high)
        {
            int mid = (low+high)/2;

            if(arr[mid]==key)
            {
                System.out.println("Binary Search found at index: " + mid);
                break;
            }
            else if(arr[mid] < key)
                low = mid+1;
            else
                high = mid-1;
        }

        System.out.println("Linear Search Time Complexity: O(n)");
        System.out.println("Binary Search Time Complexity: O(log n)");
    }
}
