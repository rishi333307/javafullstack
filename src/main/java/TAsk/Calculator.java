package TAsk;
import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the operand first");
        int a = sc.nextInt();
        System.out.println("Enter the operand second");
        int b = sc.nextInt();
        System.out.println("Enter the  arithmetic operator ");
        int operator = sc.nextInt();
        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = (b!=0)?a/b:0;
        String c = "|| 1 for Addition ||";
        String d = "|| 2 for Subtraction ||";
        String e = "|| 3 for Multiplication ||";
        String f = "|| 4 for Division ||";



        if(operator<=4 )
        {
            if (operator==1 )
                System.out.println("Addition of two number --> "+"\n" +"first number is : "+a + "\n" +  "Second number is : " +b+ "\n" +"addition is performed == "+add);
            if (operator==2 )
                System.out.println("subtraction of two number --> "+"\n" +"first number is : "+a + "\n" + "Second number is : " +b+ "\n" +"subtraction is performed == "+sub);
            if (operator==3 )
                System.out.println("multiplication of two number --> "+"\n" +"first number is : "+a + "\n" + "Second number is : " +b+ "\n" +"multiplication is performed == "+mul);
            if (operator==4 )
                System.out.println("division of two number --> "+"\n" +"first number is : "+a + "\n" + "Second number is : " +b+ "\n" +"division is performed == "+div);
        }
        else
             System.out.println("Please select the correct one operation number --> " + "\n" + c + "\n" + d + "\n" + e + "\n" + f );

        System.out.println((operator==1)?String.valueOf(add) :
                (operator==2)?String.valueOf(sub) :
                        (operator==3)?String.valueOf(mul) :
                                (operator==4)?(b != 0 ? String.valueOf(div) : "denominator can not be zero") :
                                        """
    Enter the number less than four according to condition
    || 1 for Addition ||+
    || 2 for Subtraction ||
    || 3 for Multiplication ||
    || 4 for Division |
    |""" );
    }
}
