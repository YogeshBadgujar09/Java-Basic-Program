
class StringBuilderThreadExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                sb.append("Thread 1: ");
                sb.append(i);
                sb.append("\n");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                sb.append("Thread 2: ");
                sb.append(i);
                sb.append("\n");
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(sb.toString());
    }
}