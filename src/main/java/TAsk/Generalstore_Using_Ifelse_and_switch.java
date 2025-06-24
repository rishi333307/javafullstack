package TAsk;
import java.util.Scanner;

public class Generalstore_Using_Ifelse_and_switch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Generalstore_Using_Ifelse_and_switch obj =new Generalstore_Using_Ifelse_and_switch();
        obj.customer();
        obj.categories();

    }
    void customer()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("|| enter you are new or old customer ||");
        String type = sc.nextLine();

        switch (type)
        {
            case "new" :
                System.out.println("|| Please Enter Basic detail || ");
                System.out.println(" ** Welcome ** ");
                break;
            case "old":
                System.out.println(" ** welcome ** ");
                break;

        }


    }

    void categories()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ----- please select grocery categories ------ \n"+
                "---> Fruits & Vegetables == 1 \n"+
                "---> Bakery & Breads == 2 \n"+
                "---> Dairy Products == 3 \n"+
                "---> Meat, Fish & Eggs ==4 \n"+
                "---> Oils & Spices ==5 \n"+
                "---> Packaged & Canned Foods ==6 \n"+
                "---> Grains & Pulses ==7 \n"+
                "---> Snacks & Sweets == 8 \n"+
                "---> Household & Personal Care ==7 \n");
        int num = sc.nextInt();

        if (0<num&&num<=9){
            switch (num){
                case 1:
                    System.out.println("*** please select item ***\n"+"1-->apple\n"+"2-->mango");
                    int a = sc.nextInt();
                    System.out.println();
                    if (0<a&&a<=2){
                    switch (a)
                    {
                        case 1:
                            System.out.println("apple");
                            break;
                        case 2:
                            System.out.println("mango");
                            break;

                    }
                    }
                case 2:
                    System.out.println("*** please select item ***\n"+"1-->Cookies\n"+"2-->Muffins");
                    int b = sc.nextInt();
                    System.out.println();
                    if (0<b&&b<=2){
                        switch (b)
                        {
                            case 1:
                                System.out.println("Cookies");
                                break;
                            case 2:
                                System.out.println("Muffins");
                                break;

                        }
                    }
                case 3:
                    System.out.println("*** please select item ***\n"+"1-->Milk\n"+"2-->Paneer");
                    int c = sc.nextInt();
                    System.out.println();
                    if (0<c&&c<=2){
                        switch (c)
                        {
                            case 1:
                                System.out.println("Milk");
                                break;
                            case 2:
                                System.out.println("Paneer");
                                break;

                        }
                    }
                case 4:
                    System.out.println("*** please select item ***\n"+"1-->Chicken\n"+"2-->Fish");
                    int d = sc.nextInt();
                    System.out.println();
                    if (0<d&&d<=2){
                        switch (d)
                        {
                            case 1:
                                System.out.println("Chicken");
                                break;
                            case 2:
                                System.out.println("Fish");
                                break;

                        }
                    }
                case 5:
                    System.out.println("*** please select item ***\n"+"1-->Pepper\n"+"2-->salt");
                    int k = sc.nextInt();
                    System.out.println();
                    if (0<k&&k<=2){
                        switch (k)
                        {
                            case 1:
                                System.out.println("Pepper");
                                break;
                            case 2:
                                System.out.println("salt");
                                break;

                        }
                    }
                case 6:
                    System.out.println("*** please select item ***\n"+"1-->Biscuits\n"+"2-->chips");
                    int e = sc.nextInt();
                    System.out.println();
                    if (0<e&&e<=2){
                        switch (e)
                        {
                            case 1:
                                System.out.println("Biscuits");
                                break;
                            case 2:
                                System.out.println("chips");
                                break;

                        }
                    }
                case 7:
                    System.out.println("*** please select item ***\n"+"1-->rice\n"+"2-->Oats");
                    int f = sc.nextInt();
                    System.out.println();
                    if (0<f&&f<=2){
                        switch (f)
                        {
                            case 1:
                                System.out.println("rice");
                                break;
                            case 2:
                                System.out.println("Oats");
                                break;

                        }
                    }
                case 8:
                    System.out.println("*** please select item ***\n"+"1-->Chocolates\n"+"2-->popcorn");
                    int g = sc.nextInt();
                    System.out.println();
                    if (0<g&&g<=2){
                        switch (g)
                        {
                            case 1:
                                System.out.println("Chocolates");
                                break;
                            case 2:
                                System.out.println("popcorn");
                                break;

                        }
                    }
                case 9:
                    System.out.println("*** please select item ***\n"+"1-->Shampoo\n"+"2-->soap");
                    int h = sc.nextInt();
                    System.out.println();
                    if (0<h&&h<=2){
                        switch (h)
                        {
                            case 1:
                                System.out.println("Shampoo");
                                break;
                            case 2:
                                System.out.println("soap");
                                break;

                        }
                    }

            }

        }


    }
}
