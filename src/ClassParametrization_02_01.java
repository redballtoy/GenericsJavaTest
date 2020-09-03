public class ClassParametrization_02_01 {
    public static void main(String[] args) {

        final  Apple apple = new Apple("gold", 100.0);
        Box<Apple> appleBox = new Box<>(apple);
        System.out.println(appleBox.toString());

        Box<Integer> integerBox = new Box<>(1000);
        System.out.println(integerBox.toString());


    }
}
/* parametrization types:
T - type
K - key
V - value
N - number
E - element

 */


class Box<T> {
    T type;

    public Box(T type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type.toString();
    }
}

class Apple {
    String name;
    Double price;

    public Apple(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
