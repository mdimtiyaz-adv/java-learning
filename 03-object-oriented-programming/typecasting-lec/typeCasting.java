class A {
    public void show1() {
        System.out.println("in A show");
    }
}
// compiler always see reference type so here in upcasting its already said that
// it has the reference of type of A .so show1 is called. but show2 is not in A
// so it gives error. but in B obj a also extend . here down casting is down
// means B has also the reference of A so both method of A and B is called.

class B extends A {
    public void show2() {
        System.out.println("in B show");
    }
}

public class typeCasting {
    public static void main(String[] args) {
        A obj1 = (A) new B();// upcasting
        obj1.show1();
        B obj2 = (B) obj1;// downcasting
        obj2.show2();
        obj2.show1();

    }
}
