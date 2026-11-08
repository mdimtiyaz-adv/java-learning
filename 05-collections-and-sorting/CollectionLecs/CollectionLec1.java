import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionLec1 {
    public static void main(String[] args) {
        List<Integer> obj1 = new ArrayList<Integer>();
        obj1.add(4);
        obj1.add(3);
        obj1.add(5);
        obj1.add(9);
        // System.out.println(obj1);
        // for (Object obj : obj1) {
        // System.out.println(obj);

        // }
        // if we want to work with index then use List
        System.out.println(obj1.get(2));
        System.out.println(obj1.indexOf(5));
        for (int num : obj1) {
            System.out.println(num);
        }
    }
}
