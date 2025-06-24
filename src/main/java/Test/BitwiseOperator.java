package Test;

public class BitwiseOperator {
    public static void main(String[] args)
    {
        int a = 2; // 0010 --> 1101
        int b = 3;
        System.out.println(a&b);
        System.out.println(a|b); //
        System.out.println(+a^b); // a --> 0010  and b -->0011 so output is  0001 which is 1 in decimal
        System.out.println(+ ~a); // using this formula  -(x+1)
        System.out.println(2>>a ); // using formula x/2^n
        System.out.println(2<<a);  // using formula x*2^n
        System.out.println(a>>>2);

    }
}
