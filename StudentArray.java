import java.util.*;

 class StudentArray {
    Scanner s = new Scanner(System.in);
    private int id;
    private String name;
    private float fees;
    
    public void getdata(){
        System.out.println("Enter the Student Id : ");
        id = s.nextInt();
        System.out.println("Enter the Student Name : ");
        name = s.next();
        System.out.println("Enter the Student Fees : ");
        fees = s.nextFloat();
        
    }

    public void Display(){
        System.out.println("Student Id is : "+id);
        System.out.println("Student Name is :"+name);
        System.out.println("Student Fees is : "+fees);
    }
    
    public static void main(String[] args) {

        StudentArray s[] = new StudentArray();

        /*for(int i=0 ; i<5 ; i++){
            s[i].getdata();
        }

        for(int i=0 ; i<5 ; i++){

            s[i].Display();
        }*/

        s[0].getdata();
        s[0].Display();
         
      
    }
}
