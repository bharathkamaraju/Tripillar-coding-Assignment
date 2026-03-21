package Assignment4_Module8_Strings_hashing_bitmanipulationandCollections;


import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class LetterCounter {


    public static void main(String[] args) {
        String input = "Hello assignment";

        int vowelsCount = 0;
        int consonantsCount = 0;

        // Define vowels in a Set for O(1) lookup
        Set<Character> vowels = new HashSet<>(Arrays.asList(
                'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'
        ));

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                if (vowels.contains(ch)) {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Vowels: " + vowelsCount);
        System.out.println("Consonants: " + consonantsCount);
    }
}