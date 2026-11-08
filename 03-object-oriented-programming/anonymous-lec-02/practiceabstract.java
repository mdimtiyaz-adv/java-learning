
abstract class A {
    public abstract void show();

    public abstract void show2();
}
// class B{
// public void show(){

// }
// }
// here we can simply make an anonymous class to define the class and method .
public class practiceabstract {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("in class A");
            }
            // wecan use multiple methods in this class

            public void show2() {
                System.out.println("in show 2");
                show3();
            }

            public void show3() {
                System.out.println("in show 3");
            }

        };
        obj.show();
        obj.show2();

    }
}
