// annotation is a meta data used in java to give extra information to the jvm or compiler about the code.lets say we want to override a method . and we have written the name of method wrong so here we use anotation . the compiler gives error.
class A {
    public void show() {
        System.out.println("in show A");
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("in show B");
    }
}

public class annotation {

    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}