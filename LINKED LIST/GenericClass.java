public class GenericClass<T, E> {
    private T firstValue;
    private E secondValue;

    public GenericClass(T firstValue, E secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public T getFirstValue() {
        return firstValue;
    }

    public E getSecondValue() {
        return secondValue;
    }
}

class Main {
    public static void main(String[] args) {
        GenericClass<Integer, String> obj1 = new GenericClass<>(10, "Hello");
        int firstValue1 = obj1.getFirstValue();
        String secondValue1 = obj1.getSecondValue();
        System.out.println("First Value: " + firstValue1);
        System.out.println("Second Value: " + secondValue1);

        GenericClass<Double, Integer> obj2 = new GenericClass<>(3.14, 20);
        double firstValue2 = obj2.getFirstValue();
        int secondValue2 = obj2.getSecondValue();
        System.out.println("First Value: " + firstValue2);
        System.out.println("Second Value: " + secondValue2);
    }
}
