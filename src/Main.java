import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<String> str_list = Arrays.asList("Eric", "Michelle", "Bob", "Tom", "Alice");
        str_list.stream()
                .sorted()
                .forEach((str) -> System.out.println(str));

        int[] ar = new int[] {9, 5, 8, 2, 7};
        Arrays.stream(ar)
                .sorted()
                .forEach(System.out::println);
    }
}
