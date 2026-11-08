class Products {
    String brand;
    int price;
    static String name;

    static {

        name = "laptop";
        System.out.println("in static");
    }
    // result-->
    // here constructor called every times when obj is initialized but static calls
    // one time because system
    // loader class load theclass one timeos static also.but what if we dont make
    // any obj then the there is nothing on console. but what if we want to call the
    // static method. so we use class.className. it will load the class and hence
    // the static method also loaded

    // here we make a constructor
    public Products() {
        brand = "apple";
        price = 1000;
        System.out.println("in constructor");
        // static String name; we know it is static it should have made one time can be
        // used overall program.so we make a static variable

    }

    // public void result() {
    // System.out.println(brand + ":" + price + ":" + name);
    // }

    // public static void result1(Products obj) {
    // System.out.println(obj.brand + ":" + obj.price + ":" + name);
    // }

}

public class staticVariable {

    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Products");
        // Products obj1 = new Products();
        // obj1.brand = "Asus";
        // obj1.price = 1500;

        // Products obj2 = new Products();
        // obj2.brand = "MacBook";
        // obj2.price = 2019;

        // Products.name = "laptop";
        // lets say here name of product is same so we use static keyword for this
        // sharing of same name and this is called static variable
        // now we also have static method

        // obj1.result();
        // obj2.result();
        // method-->
        // Products.result1(obj1);
        // here name works because nameis common but brand and price not work because
        // result doesnot now which object should i target , so we provide obj as
        // parameter. we use static in main method beacuse if dont use static here we
        // have to create an obeject of demo class to use main method . so
        // now we know the constructor call on loading automatically. everytime we
        // create an object java create a constructer and call it. in the entire program
        // class called one time and at that the static keyword called

    }
}
