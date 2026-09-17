// we can create our own exception and pass our own value by making class and constructor
class MyException extends Exception {
    public MyException(String string) {
        super(string);
    }
}

public class throwLec {
    public static void main(String[] args) {
        int i = 18;
        int j = 16;

        try {
            j = 16 / i;
            if (j == 0)
                throw new ArithmeticException("something is here");

        } catch (ArithmeticException e) {
            System.out.println("default value is 16" + e);

        }
        System.out.println("finished");

    }
}