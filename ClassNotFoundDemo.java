public class ClassNotFoundDemo {
    public static void main(String[] args) {
        try {
            // Trying to load a class that doesn't exist
            Class.forName("com.example.NonExistingClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found exception occurred!");
            e.printStackTrace();
        }
    }
}
