public class Box<T> {
    T value;

    public static void main(String[] args) {

        Box<String> box = new Box<>();
        box.value = "Hello";

        // No casting needed
        String text = box.value;

        System.out.println(text);
    }
}






