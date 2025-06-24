package JavaAssigment1;

public class DifferentTypesOfMethod
{
     static int a = 2; // static variable
    int b = 55; // instance and nonstatic variable
    public static void main(String[] args)  // static class access static variable  and nonstatic variable with object creation
    {
        int c = 22; // local variable with in scope
        System.out.println(a); // access static variable
        DifferentTypesOfMethod obje = new DifferentTypesOfMethod(); //creating object
        System.out.println("Enter The Value Of Nonstatic Variable " +obje.b); // Accessing non static variable
        obje.add(); // accessing nonstatic  method

    }
    public int add()// nonstatic method
    {
        int g = 33;
        System.out.println("Local Variable "+g); //local variable
        System.out.println("Enter Static Variable "+a); // Accessing Static Variable
        System.out.println("Enter Non Sttaic Variable "+b); // Accessing Nonstatic Variable

    return 0;
    }

}
