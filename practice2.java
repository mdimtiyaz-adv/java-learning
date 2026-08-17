import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter a number");
        // int a = sc.nextInt();
        // int type;
        // if (a > 0)
        // type = 1;
        // else if (a < 0)
        // type = -1;
        // else
        // type = 0;

        // switch (type) {
        // case 1:
        // System.out.printf("number is positive");
        // break;

        // case -1:
        // System.out.printf("number is negative", a);
        // break;
        // case 0:
        // System.out.printf("number is zero");
        // break;
        // default:
        // System.out.println("invalid input");
        // break;
        // }
        // sc.close();

        // practice 2
        System.out.printf("%n Enter your marks");
        int marks = sc.nextInt();
        char grade;
        if (marks >= 90 && marks < 100)
            grade = 'A';
        else if (marks >= 80 && marks < 90)
            grade = 'B';
        else if (marks >= 70 && marks < 80)
            grade = 'C';
        else if (marks >= 60 && marks < 70)
            grade = 'D';
        else
            grade = 'E';

        switch (grade) {
            case 'A':
                System.out.println("your grade is A");
                break;
            case 'B':
                System.out.println("your grade is B");
                break;
            case 'C':
                System.out.println("your grade is C");
                break;
            case 'D':
                System.out.println("your grade is D");
                break;

            default:
                System.out.println("your grade is E ");
                break;
        }
        sc.close();
    }
}
