class A {
    public void show() {
        System.out.println("hey 1");
    }
}

// class B extends A {
// public void show() {
// System.out.println("hey 2");
// }
// }

public class anonymousInnerClass {
    // lets say there is 2 class . class A and B . b extends A. and the function of
    // b class is to only to extends A and override the method of A class. in this
    // clase why we need to define the class for just 1 method and to override . so
    // here we pass and aninymous class. it links with the main file class and named
    // it as an integer.
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("hey 2");
            }
        };
        obj.show();
    }
}
