class A {
    public void show() {
        System.out.println("in A class");

    }
}

class B extends A {
    public void show() {
        System.out.println("in B class");

    }
}

class C extends A {
    public void show() {
        System.out.println("in C class");

    }
}

class D {
    public void show() {
        System.out.println("in C class");

    }
}

public class polymerphism {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
        // obj = new D(); this is called dynamic method dispatch
        // obj.show();
    }

}