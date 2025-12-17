public class Box<T> {
    T value;

    public static void main(String[] args) {

        Box<String> box = new Box<>();
        box.value = "Hello";

        String text = box.value;

        System.out.println(text);
    }
}







