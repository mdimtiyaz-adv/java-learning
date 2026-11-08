class calculator {
    public void addNumber() {
        System.out.println("hey");
    }

    public int result(int num, int num1) {
        if (num != 0 && num1 != 0)
            return num * num1;
        else
            return num - num1;

    }

}

public class classes2 {
    public static void main(String[] args) {
        calculator calc = new calculator();
        calc.addNumber();
        int f = calc.result(0, 15);
        System.out.println(f);
    }
}
