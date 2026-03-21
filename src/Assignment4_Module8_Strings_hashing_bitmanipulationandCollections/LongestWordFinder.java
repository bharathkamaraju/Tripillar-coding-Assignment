package Assignment4_Module8_Strings_hashing_bitmanipulationandCollections;



public class LongestWordFinder {
    public static void main(String[] args) {
        String sentence = "The quick browne fox jumps over the lazy dog";
        String longest = findLongestWord(sentence);

        System.out.println("Sentence: " + sentence);
        System.out.println("Longest word: " + longest);
        System.out.println("Length: " + longest.length());
    }

    public static String findLongestWord(String sen) {
        // Replace non-alphabetic characters with spaces and split
        // This ensures punctuation like "." or "," doesn't count towards length
        String[] words = sen.replaceAll("[^a-zA-Z ]", "").split("\\s+");

        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}