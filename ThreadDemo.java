class MyClass extends Thread{

    public void show() throws InterruptedException
    {
        for(int i=0; i<10 ; i++)
        {
           System.out.println("Message");
           sleep(5000);
      }
   }

}

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException
    {
        MyClass myClass = new MyClass();
        myClass.show();

    }

}
