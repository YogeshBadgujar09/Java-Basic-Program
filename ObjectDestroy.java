public class ObjectDestroy
{
    private int a;
    private int b;

    public void setValue(int a,int b)
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
        obj.setValue(10,20);
        obj.getValue();

       obj = null;

        try{
          obj.getValue();
        }
        catch(NullPointerException e){
            System.out.println("String is Null");
        }
    }
}
