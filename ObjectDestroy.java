public class ObjectDestroy
{
    private String a;
    private String b;

    public void setValue(String a,String b)
    {
        this.a = a;
        this.b = b;
    }

    public void getValue()
    {
        System.out.println(this.a + " " + this.b );
    }



    public static void main(String[] args) {

        ObjectDestroy obj = new ObjectDestroy();
        obj.setValue("Rahul","Rohit");
        obj.getValue();

        obj = null;

        try{
            obj.getValue();
        }
        catch(NullPointerException e)
        {
            System.out.println("String is NULL ");
        }


    }
}
