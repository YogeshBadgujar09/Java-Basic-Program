import java.util.HashMap;
import java.util.Scanner;

public class StudentGradesManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Map of student -> (subject -> grade)
        HashMap<String, HashMap<String, Integer>> studentGrades = new HashMap<>();

        System.out.print("Enter number of students: ");
        int numStudents = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numStudents; i++) {
            System.out.print("\nEnter student name: ");
            String studentName = scanner.nextLine();

            HashMap<String, Integer> grades = new HashMap<>();
            System.out.print("Enter number of subjects for " + studentName + ": ");
            int numSubjects = Integer.parseInt(scanner.nextLine());

            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter subject name: ");
                String subject = scanner.nextLine();

                System.out.print("Enter grade for " + subject + ": ");
                int grade = Integer.parseInt(scanner.nextLine());

                grades.put(subject, grade);
            }

            studentGrades.put(studentName, grades);
        }

        // Display student report cards
        System.out.println("\n--- Student Report Cards ---");
        for (String student : studentGrades.keySet()) {
            HashMap<String, Integer> grades = studentGrades.get(student);
            System.out.println("\nStudent: " + student);
            int total = 0;

            for (String subject : grades.keySet()) {
                int grade = grades.get(subject);
                total += grade;
                System.out.println("  " + subject + ": " + grade);
            }

            double average = (double) total / grades.size();
            System.out.println("  Average Grade: " + average);
        }

        scanner.close();
    }
}
