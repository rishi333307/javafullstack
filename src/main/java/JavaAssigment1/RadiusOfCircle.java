package JavaAssigment1;
import java.util.Scanner;

public class RadiusOfCircle
{
    public static void main(String[] args)
    {
        Scanner bc = new Scanner(System.in);
        System.out.println("enter THe Radius");
        double  radiusOfCircle = bc.nextInt();
        double area  = radiusOfCircle*radiusOfCircle*Math.PI;
        System.out.println("Area Of Radius = "+area);



    }
}
