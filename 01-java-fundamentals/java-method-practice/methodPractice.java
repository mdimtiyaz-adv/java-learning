import java.util.Scanner;

class Computer {
    public String brand(String brand) {
        return brand;
    }

    public void product(double cost) {
        if (cost >= 10000 && cost <= 20000)
            System.out.println("your budget range get you asus");
        else if (cost >= 20000 && cost <= 30000)
            System.out.println("your budget range get you acer");
        else if (cost >= 30000 && cost <= 50000)
            System.out.println("your budget range get you lenovo");

        else if (cost > 50000)
            System.out.println("your budget range get you apple");

        else
            System.out.println("your budget range is not in range");

    }
}

public class methodPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a laptop brand");
        String str = sc.nextLine();
        System.out.println("enter your budget");
        double cost = sc.nextDouble();
        sc.close();
        Computer obj1 = new Computer();
        String result = obj1.brand(str);
        System.out.println("your type is " + result);
        obj1.product(cost);

    }

}
