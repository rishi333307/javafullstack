package JavaAssigment1;

public class VariableShadowigUsingThisKeyword
{
   static int  a = 4;
   int c = 4 ;
    public static void main(String[] args)
    {
        int a = 2;
        System.out.println("Enter Local Variable : "+a);
        System.out.println("Enter Static Variable : "+VariableShadowigUsingThisKeyword.a); // Variable Shadowing in Static and Local Variable
        VariableShadowigUsingThisKeyword bc = new VariableShadowigUsingThisKeyword();
        bc.Hii();

    }
    void Hii()
    {
        int c = 6;
        System.out.println("Enter The Local Variable : "+c);
        System.out.println("Enter the Nonstatic Variable"+ this.c); // Variable  Shadowing in Nonstatic Variable and local Variable
    }

}
