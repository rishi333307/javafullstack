package JavaAssigment1;
import java.util.Scanner;

public class Variable
{
    public static void main(String[] args)
    {
Scanner object = new Scanner(System.in);
        System.out.println("enter The Integer : ");
        int a = object.nextInt();
        byte b = 125;
        System.out.println("enter The Short Value : ");
        short c =object.nextShort();
        long  d = 65615566165L;
        float e = 1531311313351131521f;
        System.out.println("enter The Float Value : ");
        float f = object.nextFloat();
        double g =55665365351313d;
        char hee = 'f';
        boolean isResult = true;
        System.out.println("enter The Single Word String : ");
        String hu = object.nextLine();
        System.out.println("enter The Line : ");
        String huu =object.next();
        System.out.println("Enter Integer = "+a);
        System.out.println("Enter No Byte = "+b);
        System.out.println("Enter No Short = "+c);
        System.out.println("Enter long = "+d);
        System.out.println("enter float Number = "+e);
        System.out.println("enter float Number = "+f);
        System.out.println("enter Double Number = "+g);
        System.out.println("enter Boolean Number = "+isResult);
        System.out.println("enter Single word " +hu);
        System.out.println("enter Line String " +huu);



        
    }
}
