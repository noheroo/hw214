import Implements.StringListImpl;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        StringListImpl stringListimpl = new StringListImpl();

//        stringListimpl.add("privet");
//        stringListimpl.add("privet vsem");
//        stringListimpl.add(2, "hello");
//        stringListimpl.set(1, "good");

        System.out.println("stringListimpl.contains(\"ggood\") = " + stringListimpl.contains("ggood"));
        System.out.println("stringListimpl.contains(\"good\") = " + stringListimpl.contains("good"));


        System.out.println(stringListimpl.size());
        System.out.println(Arrays.toString(stringListimpl.toArray()));

    }
}
