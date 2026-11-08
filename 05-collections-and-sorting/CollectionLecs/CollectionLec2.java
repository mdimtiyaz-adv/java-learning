import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionLec2 {
    public static void main(String[] args) {

        // in the collection we have also set interface.it doesnt executes duplicate
        // value. it also doesnt executes serially. and it also hasnt index method but
        // have getclass method.
        // Set<Integer> num = new HashSet<Integer>();
        // but if we want sortable value or ordered value then we use treeset. it gives
        // sorted value and extends abstract set and abstract set extends navigation set
        // and it has sorted set.
        Set<Integer> num = new TreeSet<Integer>();
        num.add(12);
        num.add(23);
        num.add(34);
        num.add(4);
        // System.out.println(num.getClass());
        // instead of using for loop we can use iterator. collection extends
        // iterator.wecan iterate the values
        Iterator<Integer> values = num.iterator();
        while (values.hasNext())
            System.out.println(values.next());

        // for (int nums : num) {
        // System.out.println(nums);

        // }

    }
}
