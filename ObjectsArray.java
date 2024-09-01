public class ObjectsArray {

    public void demoFunction()
    {
        System.out.println("Hello");
    }

    public static void main(String args[])
    {
       ObjectsArray[] obj = {
       
         new ObjectsArray(), new ObjectsArray()
        };

        obj[0].demoFunction();
        obj[1].demoFunction();

        
    }
    
}
