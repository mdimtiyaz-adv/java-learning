
public class Parent {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(5, 6);
        int r2 = obj.sub(10, 6);
        int r3 = obj.multi(5, 4);
        int r4 = obj.div(20, 5);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }

}
