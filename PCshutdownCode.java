import java.io.IOException ;

public class PCshutdownCode {
    public static void main(String[] args) {

        try{
            //shutdown PC
            Runtime.getRuntime().exec("shutdown /s /t /1");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

}
