import Implements.StringListImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        StringListImpl stringListimpl = new StringListImpl();

        stringListimpl.add("privet");
        stringListimpl.add("privet vsem");
        stringListimpl.add(3, "hello");
//        stringListimpl.set(6, "good");

        System.out.println(stringListimpl.size());

        stringListimpl.printAll();

    }
}
