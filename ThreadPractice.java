import java.util.Random;

class MathOp extends Thread{

    int setValueForAdd(int a , int b) throws InterruptedException
    {
        sleep(2000);
        return a+b;
    }

}



public class ThreadPractice {

    public static void main(String[] args) throws InterruptedException {

        MathOp mathOp = new MathOp();
        Random random = new Random();

        for(int i=0 ; i<5 ; i++)
        {
            int a = random.nextInt(10);
            int b = random.nextInt(10);

            int c = mathOp.setValueForAdd(a,b);

            System.out.println("Add = " + c);

        }


    }
}
