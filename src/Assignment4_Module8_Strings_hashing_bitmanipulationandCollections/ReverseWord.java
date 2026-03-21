package Assignment4_Module8_Strings_hashing_bitmanipulationandCollections;


public class ReverseWord {
    public static void main(String[] args) {
        String input = " Java World";
        String result = reverseEachWord(input);

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + result);
    }

    public static String reverseEachWord(String sentence) {
        // Split the sentence by whitespace
        String[] words = sentence.split(" ");
        StringBuilder finalResult = new StringBuilder();

        for (String word : words) {
            // Use StringBuilder's built-in reverse method
            StringBuilder temp = new StringBuilder(word);
            temp.reverse();

            // Append the reversed word and a space
            finalResult.append(temp.toString()).append(" ");
        }

        // trim() removes the trailing space added in the loop
        return finalResult.toString().trim();
    }
}