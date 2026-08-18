class Calculator {
    int num = 6; // instance variable

    public int add(int n1, int n2) {
        return n1 + n2;// local variable
    }
}

public class methods {
    public static void main(String[] args) {
        Calculator obj1 = new Calculator();
        Calculator obj2 = new Calculator();

        int r = obj1.add(3, 4);
        System.out.println(r);
        obj1.num = 8;
        obj2.num = 8;
        System.out.println(obj1.num);
        System.out.println(obj2.num);
        System.out.println(obj2.num == obj1.num);

    }
}
