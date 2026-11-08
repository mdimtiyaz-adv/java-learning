import java.util.Scanner;

public class conditional {
    public static void main(String arg[]) {
        // simple conditional
        // int a = 4;
        // int b = 3;
        // if (a > b)
        // System.out.println(a);
        // else
        // System.out.println(b);

        // multiple condition
        // greatest among the number
        // int a = 17;
        // int b = 19;
        // int c = 30;
        // if (a > b && b > c)
        // System.out.printf(" %d is greatest", a);
        // else if (b > c)
        // System.out.printf("%d is greatest", b);
        // else
        // System.out.printf("%d is greatest", c);
        // or use string concatenation or string.format
        // ternary operator
        // String result = (a > b && b > c) ? "true" : ((b > c) ? "false" : "no");
        // System.out.println(result);
        // switch and break statement
        // i
        // simple calculator
        // scanner sc new input lene ka kaam aata hai aur syatem.in ek file ki trah ya
        // ek resources ki trah behave karta hai jo input store karta hai aur sc.close
        // kaam hone k bad file ko close karne ka kaam karta hai

        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int a = sc.nextInt();

        System.out.println("enter 2nd number");
        int b = sc.nextInt();

        System.out.println("enter operator (+,-,*,/):");
        char operator = sc.next().charAt(0);
        sc.close();

        switch (operator) {
            case '+':
                int result = a + b;
                System.out.println(result);
                break;
            case '-':
                int result1 = a - b;
                System.out.println(result1);
                break;
            case '*':
                int result2 = a * b;
                System.out.println(result2);
                break;
            case '/':
                int result3 = a / b;
                System.out.println(result3);
                break;

            default:
                System.out.println("enter a valid operator");
                break;
        }

    }
}
