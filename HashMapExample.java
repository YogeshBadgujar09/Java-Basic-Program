import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);
        map.put("Mango", 40);

        // Print the map
        System.out.println("Original HashMap: " + map);

        // Access a value by key
        System.out.println("Value for key 'Banana': " + map.get("Banana"));

        // Check if a key exists
        System.out.println("Contains key 'Apple'? " + map.containsKey("Apple"));

        // Check if a value exists
        System.out.println("Contains value 30? " + map.containsValue(30));

        // Remove a key-value pair
        map.remove("Orange");
        System.out.println("HashMap after removing 'Orange': " + map);

        // Iterate through the HashMap
        System.out.println("Iterating through the map:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
