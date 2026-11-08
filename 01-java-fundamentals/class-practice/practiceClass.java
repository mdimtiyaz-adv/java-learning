import java.util.Scanner;

class Calculator {
    int r;

    public int operation(int num1, int num2, char C) {

        switch (C) {
            case '+':
                return r = num1 + num2;

            case '-':
                return r = num1 - num2;

            case '*':
                return r = num1 * num2;

            case '/':
                return r = num1 / num2;

            default:
                System.out.println("invalid operator");
                return 0;
        }

    }

}

public class practiceClass {
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num1 = sc.nextInt();
        System.out.println("enter another number");
        int num2 = sc.nextInt();
        System.out.println("enter a operator");
        char C = sc.next().charAt(0);
        Calculator calc = new Calculator();
        sc.close();
        int result = calc.operation(num1, num2, C);
        System.out.println(result);
    }
}
