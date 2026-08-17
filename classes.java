class calculator {

    public int add(int n1, int n2)

    {
        int r = n1 + n2;
        return r;
    }
}

public class classes {
    public static void main(String a[]) {
        // lets say we have to make a calculator. sowe need to have some method and
        // properties. for this we make class above
        int n1 = 2;
        int n2 = 3;
        calculator calc = new calculator();
        int result = calc.add(n1, n2);
        System.out.println(result);
    }
}