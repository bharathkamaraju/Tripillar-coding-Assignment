package Assignment4_Module8_Strings_hashing_bitmanipulationandCollections;

public class SpaceReplacer {
    public static void main(String[] args) {
        String input = "Hello World Java ";

        // Simple one-liner
        String result = input.replace(" ", "%20");

        System.out.println("Original: " + input);
        System.out.println("Encoded:  " + result);
    }
}