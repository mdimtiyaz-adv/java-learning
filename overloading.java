class calculator {
    public int addNumber(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int addNumber(int n1, int n2) {
        return n1 + n2;
    }
}

public class overloading {
    public static void main(String[] args) {
        calculator calc = new calculator();
        int result = calc.addNumber(3, 4, 5);
        // if we have to add only 2 number then we have to make another method with same
        // number. it only depends on number and type of parameter.
        int result2 = calc.addNumber(result, result);
        System.out.println(result2);
        System.out.println(result);

    }
}
