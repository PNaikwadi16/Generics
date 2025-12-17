import java.util.List;
public class WildcardExample {
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        List<String> names = List.of("Java", "Spring", "Boot");
        List<Integer> numbers = List.of(10, 20, 30);

        printList(names);
        printList(numbers);
    }
}
