package Module8;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,2,3,3,2,4};
        HashSet<Integer> unique=new HashSet<>();
        for(int num:arr){
            unique.add(num);
        }
        System.out.println("removed array :"+unique);
    }
}