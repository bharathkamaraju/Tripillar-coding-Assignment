package Module8;

import java.util.HashMap;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String s="Malayalam";
        HashMap<Character,Integer> map=new HashMap<>();
        for (char ch:s.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
    }
}