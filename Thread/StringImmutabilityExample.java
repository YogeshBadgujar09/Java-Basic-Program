class StringImmutabilityExample {
    public static void main(String[] args) {
        // Create a String object
        String originalString = "Hello, World!";
        System.out.println("Original String: " + originalString);

        // Create a new thread that attempts to modify the String object
        Thread modifierThread = new Thread(() -> {
            try {
                // Attempt to modify the String object
                System.out.println("Modifier Thread: Attempting to modify the String...");
                String newString = originalString + " Modified!";
                System.out.println("Modifier Thread: New String: " + newString);
            } catch (Exception e) {
                System.out.println("Modifier Thread: Exception caught: " + e.getMessage());
            }
        });

        // Create a new thread that reads the String object
        Thread readerThread = new Thread(() -> {
            try {
                // Read the String object
                System.out.println("Reader Thread: Reading the String...");
                System.out.println("Reader Thread: String value: " + originalString);
            } catch (Exception e) {
                System.out.println("Reader Thread: Exception caught: " + e.getMessage());
            }
        });

        // Start both threads
        modifierThread.start();
        readerThread.start();

        // Wait for both threads to finish
        try {
            modifierThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread: Exception caught: " + e.getMessage());
        }

        // Print the final value of the String object
        System.out.println("Final String value: " + originalString);
    }
}