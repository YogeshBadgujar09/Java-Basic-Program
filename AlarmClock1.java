import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

public class AlarmClock1 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            public void run() {
                System.out.println("Wake Up!");
            }
        };
        timer.schedule(task, 5000); // 5 seconds
    }
}
