package Module9;

import java.util.ArrayList;
import java.util.List;

public class SubsetsOfNumber {
    public static void main(String[] args) {
        SubsetsOfNumber sn=new SubsetsOfNumber();
        int[] arr={4,5,6};
        List<List<Integer>> result=sn.subsets(arr);
        for(List<Integer> subset:result){
            System.out.println(subset);
        }
    }
    public static void find(int[] arr,List<Integer> output,int index,
                            List<List<Integer>> ans){
        if(index>=arr.length){
            ans.add(new ArrayList<>(output));
            return;
        }
        find(arr,output,index+1,ans);
        output.add(arr[index]);
        find(arr,output,index+1,ans);
        output.remove(output.size()-1);
    }
    public static List<List<Integer>> subsets(int[] arr){
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        find(arr,output,0,ans);
        return ans;
    }
}