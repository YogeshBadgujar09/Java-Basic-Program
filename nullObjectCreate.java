public class nullObjectCreate{
    
    public void demoFunction(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
    
        System.out.println("****Create first Object.****");
        nullObjectCreate obj = new nullObjectCreate();
        obj.demoFunction();

        System.out.println("\n****Create second Object.****");
        nullObjectCreate obj1 = new nullObjectCreate();
        obj1 = null ;
        obj1.demoFunction();
    }
}