
import java.util.HashMap;

public class HashMapEx{
    public static void main(String[] args) {
        // Create a HashMap to store book information
        HashMap<String, String> bookCatalog = new HashMap<>();

        // Add books to the HashMap
        bookCatalog.put("1984", "George Orwell");
        bookCatalog.put("To Kill a Mockingbird", "Harper Lee");
        bookCatalog.put("Pride and Prejudice", "Jane Austen");

        // Access book author
        System.out.println("Author of 1984: " + bookCatalog.get("1984"));

        // Check if a book title exists
        if (bookCatalog.containsKey("To Kill a Mockingbird")) {
            System.out.println("To Kill a Mockingbird is in the catalog!");
        }

        // Get the set of book titles
        System.out.println("Book titles: " + bookCatalog.keySet());

        // Get the set of authors
        System.out.println("Authors: " + bookCatalog.values());

        // Remove a book from the HashMap
        bookCatalog.remove("Pride and Prejudice");

        // Check the number of books in the HashMap
        System.out.println("Number of books: " + bookCatalog.size());
    }
}
