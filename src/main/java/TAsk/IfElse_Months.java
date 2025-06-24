package TAsk;
import java.util.Scanner;
public class IfElse_Months
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The month");
       int num = sc.nextInt();
        IfElse_Months month = new IfElse_Months();
        if (num<=12)
        {
            month.number(num);
        }
        else
        {
            String err = "Sorry , Please Enter Valid Month number " ;
            System.out.println("Month Not found : " + err);
        }



    }
    int number (int num)
    {
        if (num == 1)
        {
            String jan = "January";
            System.out.println("You Are In Months of : " +jan);
        }
        if (num == 2)
        {
        String feb = "February";
        System.out.println("You Are In Months of : " +feb);
        }
        if (num == 3)
        {
        String mar = "march";
        System.out.println("You Are In Months of : " +mar);
        }
        if (num == 4)
        {
        String apr = "April";
        System.out.println("You Are In Months of : " +apr);
        }
        if (num == 5)
        {
        String may = "May";
        System.out.println("You Are In Months of : " +may);
        }
        if (num == 6)
        {
        String jun = "June";
        System.out.println("You Are In Months of : " +jun);
        }
        if (num == 7)
        {
        String jul = "July";
        System.out.println("You Are In Months of : " +jul);
        }
        if (num == 8)
        {
        String aug = "August";
        System.out.println("You Are In Months of : " +aug);
        }
        if (num == 9)
        {
        String sep = "September";
        System.out.println("You Are In Months of : " +sep);
        }
        if (num == 10)
        {
        String oct = "October";
        System.out.println("You Are In Months of : " +oct);
        }
        if (num == 11)
        {
        String nav = "November";
        System.out.println("You Are In Months of : " +nav);
        }
        if (num == 1)
        {
        String dec = "December";
        System.out.println("You Are In Months of : " +dec);
        }
        return num;

    }
}
