import java.util.Vector;

class VectorExample3 {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();

        // Add elements to the Vector
        vector.addElement("Apple");
        vector.addElement("Banana");
        vector.addElement("Cherry");

        // Access elements using index
        System.out.println(vector.elementAt(0)); // Apple

        // Iterate over the Vector
        for (String fruit : vector) {
            System.out.println(fruit);
        }
    }
}
