import java.util.Map;
import java.util.HashMap;

public class CollectionLec3 {
    public static void main(String[] args) {
        Map<String, Integer> data = new HashMap<String, Integer>();
        data.put("imtiyaz", 12);
        data.put("arman", 22);
        data.put("aman", 32);
        data.put("arbaz", 42);
        data.remove("aman", 32);
        data.replace("arman", 45);
        // data.clear();

        for (String keys : data.keySet()) {
            System.out.println(keys + ":" + data.get(keys));
        }
    }
}
