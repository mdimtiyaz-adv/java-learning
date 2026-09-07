interface A {
    int age = 14;
    String name = "imtiyaz";

    // interface method is by default abstarct and public and also interface is
    // abstract.it is not a class.it has not memory like object and we cannot
    // declare variable
    // int but only final and static.it is compulsion to implement the methods of
    // interface after declaring it if B doesnot implement any method then it has to
    // be abstract and then we cannot make the object of B.
    // we can
    // implememt more than 1 interface. and we have compulsary to implement the
    // method of it otherwise make it abstract.
    // but in
    // abstract we can only
    // extends one abstract class. we can also extends the inheritance ti
    // inheritance

    void show();

    void show1();
}

interface X {
    void run();
}

interface Y extends X {

}

class B implements A, Y {
    public void show() {
        System.out.println("in show");
    }

    public void show1() {
        System.out.println("in show 1");
    }

    public void run() {
        System.out.println("in runn ");
    }
}

public class interfacelec {
    public static void main(String[] args) {
        // A obj=new B(); reference interface
        B obj = new B();
        obj.show();
        obj.show1();
        System.out.println(A.age);
        System.out.println(A.name);
        // when we make the reference of A interface we cannot use the X interface.
        // beacuse there is no any method of X in A.
        X obj2 = new B();
        obj2.run();
    }

}
