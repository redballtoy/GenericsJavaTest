//An example of the reason for switching to generics
//for read protection from a collection of different types
//https://geekbrains.ru/events/2609

import java.util.ArrayList;
import java.util.List;

//Generics are not used here and we get a runtime error
public class Generics_01_01 {
    public static void main(String[] args) {

        //entering values of different types does not result in a compilation error
        List list = new ArrayList();
        list.add("value");
        list.add(123);
        list.add(Integer.MAX_VALUE);

        System.out.println(list);

        //When trying to read Integr types, we get an error
        //Exception in thread "main" java.lang.ClassCastException
        for (Object o : list) {
            Integer i = (Integer) o; //Runtime error, generics protect code from runtime errors
        }
    }
}
