import java.time.LocalTime;
import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to start");
        scanner.nextLine();
        LocalTime startTime = LocalTime.now();
        System.out.println("Started...");
        System.out.println("Press Enter to stop");
        scanner.nextLine();
        LocalTime endTime = LocalTime.now();
        System.out.println("Stopped...");
        System.out.println("Elapsed Time: " + Duration.between(startTime, endTime));
    }
}