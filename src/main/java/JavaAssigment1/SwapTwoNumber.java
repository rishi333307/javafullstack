package JavaAssigment1;
import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {


        Scanner hii = new Scanner(System.in);
        System.out.println("Enter num1 number :");
        int num1 = hii.nextInt();
        System.out.println("Enteer num2 munber :");
        int num2 = hii.nextInt();
         num1 = (num1 + num2)-num1;
         num2 = (num1 + num2)-num2;
        System.out.println("num1 = " +num1);
        System.out.println("num2 = " +num2);
        SwapTwoNumber.haa();


    }
    static public  void haa()   {

int a= 2;
int b=4;
 a=(a^b)^a;

        b=(b^a)^b;
        b=(b^a)^a;

       System.out.println(a);
        System.out.println(b);
    }
}