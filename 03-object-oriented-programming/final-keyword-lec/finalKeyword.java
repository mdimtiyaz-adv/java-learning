// if we dont want to inherit our class we make the class constant using final keyword
final class Calc {
    // if we dont want to inherit our method we make the method final
    public final void show() {
        System.out.println("in clac class");
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

// here someone want to inherit our class and if we want to not inherit then we
// make the class final
class advCalc {
    public void show() {
        System.out.println("in advCal");

    }

    public int add(int n1, int n2) {
        return (n1 + n2);
    }
}

public class finalKeyword {
    // final keyword is used to make a variable , class, or method a constant. if we
    // want no one can use the parts of our code then we use final keyword
    // variable
    public static void main(String[] args) {
        // int a = 12;
        // final String name = "imtiyaz";
        // System.out.println(a);
        // System.out.println(name);
        // name="rehan"; doesnt work because of final keyword

        Calc obj = new Calc();
        obj.show();
        int r = obj.add(2, 5);
        System.out.println(r);
    }
}
