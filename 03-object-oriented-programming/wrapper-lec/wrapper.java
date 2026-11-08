public class wrapper {
    public static void main(String[] args) {
        int num = 12;
        // Integer num1=new Integer(8); depreceted
        Integer num1 = num;// autoboxing: we are assigning an integer to an object class.
        System.out.println(num1);

        // Integer num2 = num1.intValue();//unboxing
        Integer num2 = num1;// auto unboxing
        System.out.println(num2);
        if (num1 instanceof Object)
            System.out.println("true");
        else
            System.out.println(false);

        String str = "15";
        int num3 = Integer.parseInt(str);
        System.out.println(num3 * 3);

        double d = 12.5;
        Double d1 = d;
        System.out.println(d1.doubleValue());
    }
}
