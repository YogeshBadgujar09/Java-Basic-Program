class StringBuilderExample4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Initial string: " + sb);

        // Append a string
        sb.append(" World!");
        System.out.println("After append: " + sb);

        // Insert a string
        sb.insert(6, "Beautiful ");
        System.out.println("After insert: " + sb);

        // Replace a substring
        sb.replace(6, 15, "Wonderful");
        System.out.println("After replace: " + sb);

        // Delete a substring
        sb.delete(6, 16);
        System.out.println("After delete: " + sb);

        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
