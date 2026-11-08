// lets say we want to create obj of all the values like all names and store in
// a list we can do this

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    private int age;
    private String name;

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {

        this.name = name;
    }
}

public class ConstructorRef {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("imtiyaz", "arman", "arbaz");
        List<Student> students = new ArrayList<>();
        // for (String name : names) {
        // students.add(new Student(name));
        // }
        // by stream Api
        // students = names.stream()
        // .map(name -> new Student(name))
        // .toList();

        // by constructor reference
        students = names.stream()
                .map(Student::new)
                .toList();

        System.out.println(students);

    }
}
