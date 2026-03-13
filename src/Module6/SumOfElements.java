package Module6;

public class SumOfElements {
    public static void main(String[] args) {
        int[] arr={4,3,5,3,2,5};
        int sum=0;
        for(int num:arr){
            sum=sum+num;
        }
        System.out.println(sum);
    }
}
