class Human {
    String name;
    String password;
    int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class thisKeyword {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setName("imtiyaz");
        obj.setAge(19);
        obj.setPassword("imtiyaz123");
        System.out.println(obj.getName());

    }
}
