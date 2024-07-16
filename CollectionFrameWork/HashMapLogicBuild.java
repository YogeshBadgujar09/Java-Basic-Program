import java.util.Map ;
import  java.util.HashMap ;
import java.util.Scanner;

public class HashMapLogicBuild {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map <String,String> info = new HashMap<String,String>();

        int choice ;

        do {

            System.out.println("Enter a choice : \n1.add \n2.remove \n3.display");
            choice = scanner.nextInt();


            switch (choice)
            {
                case 1 :
                    System.out.println("Enter Name :");
                    String name = scanner.next();
                    System.out.println("Enter Age :");
                    String age = scanner.next() ;

                    info.put(name,age);
                    break;

                case 2 :


                    if(!info.isEmpty())
                    {
                        System.out.println("Enter a name for Delete");
                        String rname = scanner.next();

                        boolean flag = false ;

                        for(String dname : info.keySet()){

                            if(dname.equals(rname))
                            {
                                flag  = true ;
                                info.remove(dname);
                            }

                        }
                        if(!flag)
                        {
                            System.out.println("Name not Available.");
                        }
                    }
                    else{
                        System.out.println("not any name Available.");
                    }

                    break;

                case 3 :

                    if(!info.isEmpty())
                    {
                        for (String sname : info.keySet())
                        {
                            System.out.println("[" + sname + "," + info.get(sname)  + "]");
                        }
                    }
                    else{
                        System.out.println("not any name Available.");
                    }




                    break;
            }


        }
        while(choice < 4);


    }

}
