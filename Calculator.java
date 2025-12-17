public class Calculator<T extends Number> {

    T num;

    Calculator(T num) {
        this.num = num;
    }

    double square() {
        return num.doubleValue() * num.doubleValue();
    }

    public static void main(String[] args) {

        Calculator<Integer> c1 = new Calculator<>(5);
        Calculator<Double> c2 = new Calculator<>(2.5);

        System.out.println(c1.square());
        System.out.println(c2.square());
    }
}
