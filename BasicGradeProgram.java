class BasicGradeProgram {
    public static void main(String[] args) {
        int score = 85;

        // Check if score is between 80 and 90 (inclusive)
        if (score >= 80 && score <= 90) {
            System.out.println("Grade: B");
        }

        // Check if score is less than 60 or greater than 90
        if (score < 60 || score > 90) {
            System.out.println("Invalid grade");
        }

        // Check if score is not equal to 100
        if (score != 100) {
            System.out.println("Not a perfect score");
        }
    }
}