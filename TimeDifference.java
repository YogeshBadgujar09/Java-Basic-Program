//Program 3: Time Difference


import java.time.LocalTime;
import java.time.Duration;

public class TimeDifference {
    public static void main(String[] args) {
        LocalTime startTime = LocalTime.of(10, 0, 0);
        LocalTime endTime = LocalTime.of(12, 0, 0);
        
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Time Difference: " + duration);
    }
}
