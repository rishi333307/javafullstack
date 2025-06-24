package JavaAssigment1;

public class Bitwise_NotOperator
{
    public static void main(String[] args)
    {
        // bitwise not operator replace 0 --> 1 and 1 --> 0 formula is -(n+1) ex.
        int num = 2; // binary of is 0000 0010
        int bitwiseNotOperator = ~num; // not bitwise operator
        System.out.println(bitwiseNotOperator); //  output is -3 (1111 1101)
        Bitwise_NotOperator bc = new Bitwise_NotOperator();
        bc.question();
        bc.question2();
        bc.ternaryOperator();
    }
    void question()
    {
        int x= 1;
        int y = 2;
        int z = 3;


     x *= y+z; // it will work like x = x*(y+z)
        System.out.println("result of x *= y+z : "+x); // output is 5
    }
    int question2()
    {
        //  NOTE-->  += this sign is used  for automatically  type conversion but does not use in boolean
        byte a = 10;
        a +=5;
        System.out.println("result of a +=5 : "+a);  //  output is int ka 15 , because its cate type conversion
        return 0;
    }
    void ternaryOperator()
    {
        // ternary operation means (condition) ? {Statement 1} : {Statement 2}  if the condition id true --> statement 1 execute or if condition is false --> statement 2 is execute
        int a = 5;
        int b = 3;
        int max = (a>b) ? 10:20;
        System.out.println("Print The maximun Number : "+max);
        System.out.println(5 + 3 + "Java"); // 5 and 3 are integer type so it perform addition operator --> 8 + java  , 8 is integer and java is string do it conconates into string
        System.out.println(a+++ ++a); // it print 5 and then increment(6) and for secound it increment first (7) and then print 7 , 5+7 = 12
        System.out.println(10/3); // 10 and 3 are integer in data type so output is 3
        System.out.println(10/3.0); // 10 is integer and 3.0 is boolean  so it treat 10 as boolean 10.0 so output is 3.3333333333333335


    }
}