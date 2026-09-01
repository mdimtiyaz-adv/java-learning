class A {
    public A() {
        System.out.println("without param");
    }

    public A(int n) {
        System.out.println("with param");
    }

}

class B extends A {
    public B() {
        System.out.println("without param in B");
    }

    public B(int m) {

        this();
        System.out.println("with param");
    }

}

public class Supper {

    public static void main(String[] args) {
        B obj = new B(5);

    }
}