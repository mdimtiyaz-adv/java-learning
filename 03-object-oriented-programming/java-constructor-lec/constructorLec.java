class Human {
    private String name;
    private int age;

    public Human() { // default constructor
        this(10, "imtiyaz");
    }

    public Human(int a, String n) // parameterized constructor
    {
        age = a;
        name = n;
    }

    public Human(String n) {
        age = 30;
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class constructorLec {
    public static void main(String[] args) {
        Human obj = new Human();
        // object which pass arguments
        Human obj1 = new Human(19, "imtiyaz");
        // we can give some sorts of variable and also assign some sort of variable in
        // constructor
        Human obj2 = new Human("imtiyaz");

        System.out.println(obj.getName() + ":" + obj.getAge());
        System.out.println(obj1.getName() + ":" + obj1.getAge());
        System.out.println(obj2.getName() + ":" + obj2.getAge());
        // note:BTS lets say if we have forgot to make constructor then java will
        // automatically make default constructor. and run the program
    }
}
