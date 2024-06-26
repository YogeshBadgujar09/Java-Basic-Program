//import java.util.HashSet;
import java.util.Set;




public class HashSet{

    public static void main(String[] args)

    {

        Set<String> STR= new HashSet<String>() {{

            add("DS");

            add("C++");

            add("C");

            add("OS");

        } };

        System.out.println(STR);

    }
}