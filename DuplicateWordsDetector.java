import java.util.HashMap;
import java.util.Scanner;

public class DuplicateWordsDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read paragraph from user
        System.out.println("Enter a paragraph:");
        String paragraph = scanner.nextLine().toLowerCase();

        // Remove punctuation and split into words
        paragraph = paragraph.replaceAll("[^a-zA-Z ]", "");
        String[] words = paragraph.split("\\s+");

        // Count word frequencies
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (word.isEmpty()) continue;
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Display duplicate words
        System.out.println("\nDuplicate words found:");
        boolean found = false;
        for (String word : wordCount.keySet()) {
            if (wordCount.get(word) > 1) {
                System.out.println(word + " - " + wordCount.get(word) + " times");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No duplicates found.");
        }

        scanner.close();
    }
}
