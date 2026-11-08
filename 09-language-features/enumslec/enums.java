// lets say we are making an application . we want to give the status of any update. when user is logged in we want to give the status of success, or if failed them failed. here we use enums . it is a class we can use different status. all of them are object. are treated like a constant.we can also show the index of the status using ordinal method.so enum is afixed set of predefined value. har constat enum ka object hota hai.

enum Status {
    Running, Failed, Pending, Success;
}

public class enums {
    public static void main(String[] args) {
        Status[] ss = Status.Running.values();
        // System.out.println(s.ordinal());
        // status is a class so it also has some methods. if want to return all the
        // constant of status then we use values method.it returns an array
        // System.out.println(s[1]);
        for (Status s : ss) {
            System.out.println(s);
        }

    }
}
