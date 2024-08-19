 class LogicalOperaterProgram {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // Check if x is less than y and y is greater than 15
        if (x < y && y > 15) {
            System.out.println("x is less than y and y is greater than 15");
        }

        // Check if x is not equal to y or y is equal to 20
        if (x != y || y == 20) {
            System.out.println("x is not equal to y or y is equal to 20");
        }

        // Check if x is greater than 5 and y is less than 25
        if (x > 5 && y < 25) {
            System.out.println("x is greater than 5 and y is less than 25");
        }
    }
}