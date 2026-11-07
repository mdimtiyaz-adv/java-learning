import java.util.Arrays;
import java.util.List;

public class methodRef {
    public static void main(String[] args) {
        // while using some method we havent use to write bracket or .method we can
        // write only method and specify where it belongs
        List<String> names = Arrays.asList("imtiyaz", "rahul", "arman");
        // List<String> upper = names.stream()
        // .map(name -> name.toUpperCase())
        // .toList();
        List<String> upper = names.stream()
                .map(String::toUpperCase)
                .toList();
        // System.out.println(upper);
        upper.forEach(System.out::println);
    }
}
