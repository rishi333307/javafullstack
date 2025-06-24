package TAsk;
import java.util.Scanner;

public class GradeSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks (0-100): ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println(" Please enter a value between 0 and 100 ");
            return;
        }

        switch (marks / 10) {

            case 9:
                System.out.println("Grade: A (Excellent)");
                break;
            case 8:
                System.out.println("Grade: B (Very Good)");
                break;
            case 7:
                System.out.println("Grade: C (Good)");
                break;
            case 6:
                System.out.println("Grade: D (Average)");
                break;
            case 5:
                System.out.println("Grade: E (Below Average)");
                break;
            default:
                System.out.println("Grade: F (Fail)");
        }
    }
}
