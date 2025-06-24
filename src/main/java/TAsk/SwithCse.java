package TAsk;
import java.util.Scanner;

public class SwithCse
{
    public static void main(String[] args)
    {
        Scanner  sc =new Scanner(System.in);
       int marks = sc.nextInt();




       switch (marks)
       {
           case 1:
               if (marks<36)
               {
                   System.out.println("sorry you fail : "+" F ");
               }
               else
               {
                   if (36<marks && marks<=50)
                   {
                       System.out.println("you score average marks : "+" D  ");
                   }
               }
               break;
           case 66:
               if (50<marks && marks<=70) {
                   System.out.println("you score good marks : " + " C ");
               }
               else
               {
                   if (70<marks && marks<=90)
                   {
                       System.out.println("you score very good marks :"+" B ");
                   }
               }
               break;
           case 3:
               if (90<marks && marks<=100)
               {
                   System.out.println("you score excellent marks :"+" A ");
               }
               break;
           default:
               System.out.println("Enter marks in correct order");


       }



    }
}
