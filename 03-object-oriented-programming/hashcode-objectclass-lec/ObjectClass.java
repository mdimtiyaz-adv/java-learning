class Student {
    int price;
    String name;

    public String toString() {
        return "hey";
    }

    // hashcode is used to locate in hashset and hashmap. object is the parent of
    // all the class.means all the methods of object inherit to the class.ashcode is
    // simply an integer value.
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (price != other.price)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}

public class ObjectClass {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.name = "asus";
        obj1.price = 2000;
        Student obj2 = new Student();
        obj2.name = "asus";
        obj2.price = 2000;

        System.out.println(obj1 == obj2);
    }
}