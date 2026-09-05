abstract class Car {
    abstract public void drive();

    public void music() {
        System.out.println("music playing....");

    }
}

class BMW extends Car {
    public void drive() {
        System.out.println("driving....");
    }

}

public class Abstract {
    // lets say we have to make a car.but we dont know how to drive. we want to make
    // a rule or prototype of it. so we make a class and it have different methods.
    // drive, manufacture, music. but we havent the knowedge of of drive method. so
    // we can create a method and leave it empty.but why do wemake a empty class. so
    // we use here abstarct keyword. points:
    // 1. for abstarct methods there should be a abstract class. we can write any
    // ethds in abstarct class.
    // 2 we cannot make an object of absctract class. we should inherit it to
    // anitheer class which extends abstract class and define abstracyt methods.
    // 3.there is a compulsion of use or define all the abstract method when we
    // inherit abstract class. if we wont then make another class and then use in
    // it.

    public static void main(String[] args) {
        BMW obj = new BMW();
        obj.drive();
        obj.music();
    }
}
