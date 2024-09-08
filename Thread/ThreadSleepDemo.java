public class ThreadSleepDemo extends Thread {

    public static void main(String[] args) {
        
        Thread thread = new Thread("MyThread");
        System.out.println("Thread Name :" + thread);

        try{

            for(int i=8 ; i>0; i--)
             {
                 System.out.println("Hello");    
                Thread.sleep(1000);
            }
        }catch(InterruptedException e)
        {
            System.out.println("Main thread interrupt");
        }
        

    }
}
