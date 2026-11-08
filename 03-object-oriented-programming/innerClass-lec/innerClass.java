class A {
    int price;

    public void show() {
        System.out.println("in A class");
    }

    static class B {
        public void show1() {
            System.out.println("in B class");
        }
    }
}

public class innerClass {
    // we make a class .it has variables and methods. but if we want to make another
    // class inside a class .then it is called inner class. it also has variables
    // and method.we can also make the class as an static so we dont need to make an
    // object of it. we cannot make a outer class a static.it gives error. in
    // ascessing time we write A$b means b belongs to A and and while making object
    // we need to ascess through the object.static class dont ascess the non static
    // variable or data of upper class. but it can ascessthe static variable and
    // methods.
    public static void main(String[] args) {
        // ascessing or method calling
        A obj = new A();
        obj.show();

        // A.B obj1 = obj.new B();
        // by making the class static because static doesnt need any object
        A.B obj1 = new A.B();
        obj1.show1();
    }
}
