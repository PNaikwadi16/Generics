public class Printer {
    public static <T> void print(T data) {
        System.out.println(data);
    }

    public static void main(String[] args) {
        Printer.print("Hello");
        Printer.print(100);
        Printer.print(3.14);
    }
}
