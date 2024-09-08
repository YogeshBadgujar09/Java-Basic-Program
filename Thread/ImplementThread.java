class NewThread implements Runnable{

    Thread thread ;

    NewThread()
    {
        thread = new Thread(this,"Demo Thread");
        System.out.println("Child Thread :" + thread);
        thread.start();
    }

    public void run()
    {
        try{
                for(int i=5; i>0; i--)
                {
                    System.out.println("Child Thread :" + i) ;
                    Thread.sleep(500);
                }
        }
        catch(InterruptedException e){
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting Child Thread");
    }
}

class ImplementThread
{
    public static void main(String[] args) {
        
        new NewThread();

        try{
            for(int i=5; i>0; i--)
            {
                System.out.println("Main Thread :" + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread Interropted");
        }
        
        System.out.println("Main Thread Exiting");
    }
    
}