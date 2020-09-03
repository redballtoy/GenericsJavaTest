
//Solving the problem with errors in runtime -
//        checking type conformity at compile time

//Generics allowed:
//        - protect code at compile time from mismatched types (no runrime error)
//        - creating reusable code

import java.util.ArrayList;
import java.util.List;


public class Generics_01_02 {

    public static void main(String[] args) {

        //input of values of different types is impossible
        //For the JDK version> 1.7 it is not necessary to specify ArgayList <Integer>
        List<Integer> list = new ArrayList();//parametrization ArrayList() - reusable code
        //list.add("value");//error on compilation but not runtime
        list.add(123);
        list.add(Integer.MAX_VALUE);

        System.out.println(list);

        //Not error
        for (Object o : list) {
            Integer i = (Integer) o;
            System.out.println(i.toString());
        }
    }
}
