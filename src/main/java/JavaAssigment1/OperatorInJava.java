package JavaAssigment1;

public class OperatorInJava
{
    public static void main(String[] args)
    {
        //What happens when you divide an integer by 0 in Java? What about a floating-point number?
int c = 2;
        int a =2;
       // int b = 0; it give run time error
        int b = 2;
       int  divide = a/b ; // this give run time error in which java does not allow an integer divisible by zero
        System.out.println(c);
        System.out.println(divide);
        float g = 2.0f / 0;
        System.out.println(g); // this result in  infinite as output
        int j = 5/2 ;
        System.out.println(j); // Output is 2 , it divide  5 by 2 and the reminder remain 1, and it does not go further because it stores only integer value
        double x = 5.0 / 2 ;
        System.out.println(x); // its  output is infinite
    }


}
