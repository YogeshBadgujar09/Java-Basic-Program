import java.util.HashMap;

public class PhoneNumberHashMap{
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, String> phoneBook = new HashMap<>();

        // Add elements to the HashMap
        phoneBook.put("John Doe", "1234567890");
        phoneBook.put("Jane Doe", "0987654321");
        phoneBook.put("Bob Smith", "5551112222");

        // Access elements in the HashMap
        System.out.println("John Doe's phone number: " + phoneBook.get("John Doe"));

        // Check if a key exists in the HashMap
        if (phoneBook.containsKey("Jane Doe")) {
            System.out.println("Jane Doe is in the phone book!");
        }

        // Get the set of keys in the HashMap
        System.out.println("Phone book entries: " + phoneBook.keySet());

        // Get the set of values in the HashMap
        System.out.println("Phone numbers: " + phoneBook.values());

        // Remove an element from the HashMap
        phoneBook.remove("Bob Smith");

        // Check the size of the HashMap
        System.out.println("Phone book size: " + phoneBook.size());
    }
}

