package TAsk;
import java.util.Scanner;

public class EvenOdd_Using_IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String he = "Sorry" ;
        int num = sc.nextInt();

        System.out.println("Enter The Number : "+num);
        if(num%2==0)
        {
            System.out.println("Number Is even"+num);

        }
        else {
            System.out.println("Number is Odd: "+he);
        }
    }
}
