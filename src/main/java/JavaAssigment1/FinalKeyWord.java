package JavaAssigment1;

public class FinalKeyWord
{
    final static  int a = 20; // Static final Constant
    final int b = 21; // Nonstatic Final Constant
    public static void main(String[] args)
    {
        final int c = 22; // Local Final  Constant
        System.out.println("Enter Local Final Constant : "+c);
        System.out.println("Enter Static Final Constant : "+a); // Accessing Static Final Constant
        FinalKeyWord bc = new FinalKeyWord(); // Creating Object
        System.out.println("Enter Nonstatic Final Constant : "+bc.b); // Accessing Nonstatic Final Constant
        bc.add();
    }
    void add()
    {
     int c = 2; // Local Final  Constant
        System.out.println("Enter Local Final Constant : "+c);
        System.out.println("Enter Static Final Constant : "+a); // Accessing Static Final Constant
        System.out.println("Enter Nonstatic Final Constant : "+b); // Accessing Nonstatic Final Constant
    }

}
