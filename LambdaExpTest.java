@FunctionalInterface
interface Print {
    public String print();
}
        
public class LambdaExpTest {
    
    public static void main(String[] args) {
        // lambda expression with no parameter
        Print p = () -> {
            return "Hello, Lambda Expression!";
        };
        System.out.println("STRING = " + p.print());
    }
}