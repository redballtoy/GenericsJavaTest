//Сlass Box can take any type

import java.util.ArrayList;
import java.util.List;

public class ClassParametrization_02_01 {
    public static void main(String[] args) {

        final  Apple apple = new Apple("gold", 100.0);
        Box<Apple> appleBox = new Box<>(apple);
        System.out.println(appleBox.toString());

        Box<Integer> integerBox = new Box<>(1000);
        System.out.println(integerBox.toString());


        //Show the class type with which class Box was parameterized
        System.out.println(appleBox.getType().getClass());//res: class Apple

        //Generics cannot be parameterized with primitive types
        //List<int> ints = new ArrayList<int>(); //error


        //Generics cannot be used with exceptions everything that inherits
        //from the Throwable class
        //When using generics with exeptions, there is a problem of returning the correct type


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
    /*there is no way to determine what type of object this parameterized
    type will belong to (static fields are not allowed to be defined by generics)*/
    //static T string;  //- this field Type type cannot be used as static


    public Box(T type) {
        /*You cannot create a parameterized type in the constructor because
        at the time of creation the type is not defined*/
        //T t = new T(); error
        this.type = type;

    }

    @Override
    public String toString() {
        return type.toString();
    }

    public T getType() {
        return type;
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
