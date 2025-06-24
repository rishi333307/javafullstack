package TAsk;
import java.util.Scanner;

public class CheckVoveuls
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Char");
        char a = sc.next().charAt(0);
        if (a=='a'|| a=='e' || a == 'i' || a== 'o'|| a== 'u')
        {
            System.out.println("wovel found");
        }
        else
        {
            System.out.println("enter charcter is not voveul");
        }




    }
}
