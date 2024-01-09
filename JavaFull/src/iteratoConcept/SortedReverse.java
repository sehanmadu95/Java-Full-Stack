package iteratoConcept;

import java.lang.reflect.Array;
import java.util.*;

public class SortedReverse {
    public static void main(String[] args) {

        List<String> alph=new ArrayList<>();

        alph.add("A");
        alph.add("B");
        alph.add("N");
        alph.add("G");
        alph.add("D");
        alph.add("E");
        alph.add("S");

        System.out.println(alph);
        System.out.println("************************");


        alph.sort(null);

        System.out.println(alph);


        System.out.println("************************");

        Collections.reverse(alph);

        System.out.println(alph);

        System.out.println("************************");
        String a="MNJHAS";

        String [] s=a.split("");
        List<String>ss= Arrays.asList(s);
        ss.sort(null);
        System.out.println(ss);


    }
}
