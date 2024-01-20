package LambaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DatLambda{
    private String name;

    public DatLambda(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "DatLambda{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class LambdaContinue03 {
    public static void main(String[] args) {

        List<DatLambda>list=new ArrayList<DatLambda>();

        list.add(new DatLambda("SHEHAN"));
        list.add(new DatLambda("fg"));
        list.add(new DatLambda("dsd"));
        list.add(new DatLambda("fgfgh"));
        list.add(new DatLambda("nhnh"));

      /*  Collections.sort(list, new Comparator<DatLambda>() {
            @Override
            public int compare(DatLambda o1, DatLambda o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/

        Collections.sort(list,(DatLambda d1,DatLambda d2)->
                d1.getName().compareTo(d2.getName())
                );

        for (DatLambda d:list
             ) {
            System.out.println(d.getName());
        }

    }
}
