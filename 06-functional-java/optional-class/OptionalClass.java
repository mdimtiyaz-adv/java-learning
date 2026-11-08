
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("imtiyaz", "ikram", "rehman", "Altaf");
        String Str = names.stream()
                .filter(name -> name.contains("j"))
                .findFirst()
                .orElse("not found");
        System.out.println(Str);
        // System.out.println(Str.orElse("not found"));

    }
}
