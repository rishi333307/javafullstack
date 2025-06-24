package JavaAssigment1;

public class Left_Right_Shift {
    public static void main(String[] args)
    {


        int a = 2; // binary of 2 is 0000 0010
        int leftshift1 = a << 1; // shift all bit left by 1 and add 0 at right side
        int leftshift2 = a << 2; // shift all bit left by 2 and add 0 at right side
        System.out.println(leftshift1); // Output is 0000 0100 is 4
        System.out.println(leftshift2); // output is 0000 1000 is 8
        int b = 1; // binary of 1 is 0000 0001
        int rightShift1 = b >> 1; // shift all bit right by 1 and add 0 at left side
        int rightShift2 = b >> 2; // shift all bit right by 2 and add 0 at left side
        System.out.println(rightShift1); // output is 0000 0000 is 0
        System.out.println(rightShift2); // output is 0000 0000 is 0

    }
}