package Test;

public class increment
{
    public static void main(String[] args) {
        int a = 2;
       // a++; //post increment
       // ++a; // pre increment
        System.out.println("Post Increment "+a++);
        System.out.println("Pre  Increment "+ ++a);




    }
}
// 1 --> a
// 2 --> c
// 3 --> c
// 4 --> c
// 5 --> a
// 6 --> a
// 7 --> b
// 8 --> a
// 9 --> c
// 10 --> c