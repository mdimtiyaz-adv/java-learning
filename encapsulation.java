class Login {
    private String name;
    private String password;
    private int age;

    // we can only ascess this by using some methods.if we want to give the ascess
    // then some can use it.
    public void setName(String n) {
        name = n;
    }

    public void setPassword(String p) {
        password = p;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    // we can also set our details by some methods

}

public class encapsulation {
    // Encapsulation--> lets say someone want to know our name . we can give our
    // name. even email. but if he want our facebook password we cant give. this is
    // private. so in the software we have to make some variable or something
    // private. we can only use that in our own class. we can only ascess it by some
    // methods
    public static void main(String[] args) {
        Login details = new Login();
        // System.out.println(details.name);
        // but we have to make this information private. so we use private keyword.
        // here we can ascess
        // System.out.printf(
        // details.getName() + "%n" + "password:" + details.getPassword() + "%n" +
        // "Age:" + details.getAge());
        details.setName("imtiyaz");
        details.setPassword("imtiyaz123");
        details.setAge(19);
        // System.out.println(details.getName());
        // System.out.println(details.getName());
        System.out.printf(
                details.getName() + "%n" + "password:" + details.getPassword() + "%n" +
                        "Age:" + details.getAge());
    }

}
