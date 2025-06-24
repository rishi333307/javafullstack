package TAsk;
import java.util.Scanner;
public class Greatest_Number_Among_Three_Variable_Using_Nested_IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter The First Number : " +a);
        int b = sc.nextInt();
        System.out.println("Enter The First Number : " +b);
        int c = sc.nextInt();
        System.out.println("Enter The First Number : " +c);
        if(a>b)
        {
            if (a>c)
            {
                System.out.println("A is greater number : "+a);
            }
        }
        else
        {
            if (b>a)
            {
                if (b>c)
                {
                    System.out.println("B number is greater : "+b);
                }
                else
                {
                    System.out.println("C number is greater : " + c);
                }
            }
        }
    }
}
