// so basically we have method overloading and method over riding . method overloading is used when we want to do some extra operation by passing extra arguement with same method name. 
// method overriding is used when we want to do exact same operation with same no of operands with same method name. os first class's method is over ride by child class method.
class Calc {
    public int add(int a, int b) {
        return a + b;
    }
}

class B extends Calc {
    public int add(int a, int b) {
        return a + b + 1;
    }
}

public class methodoverriding {
    public static void main(String[] args) {
        B obj = new B();
        int result = obj.add(5, 5);
        System.out.println(result);
    }
}
