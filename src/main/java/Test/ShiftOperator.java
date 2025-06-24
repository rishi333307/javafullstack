package Test;

public class ShiftOperator {
    public static void main(String[] args) {
        int a = 3;

        System.out.println(2>>a ); // using formula x/2^n
        System.out.println(2<<a);  // using formula x*2^n
        System.out.println(a>>>2);
    }
}
