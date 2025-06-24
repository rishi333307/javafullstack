public class Operatotrr
{
    public static void main(String[] args)
    {
     byte b = 2;
     byte b1 = 3;
     int b3 = 4;
     int b4 = 5;
     int b5 = 7;


     b+= 5;
     b1-= 2;
     b5*= 3;
     b3/=3;
     b4%=2;

         System.out.println(b1); //output 1
         System.out.println(b3); //output 1
         System.out.println(b4); //output 1
         System.out.println(b5); //output 21
         System.out.println(b); // output 7
        //  for b3 == 4/3 --> remainder is 1 and output is 1 so answer is 1
        // for b4 == 5%2 --> remainder is 1 and output is 2 so answere is 1

    }
}

