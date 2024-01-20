package LambaExpression;

import java.util.ArrayList;
import java.util.List;

public class Lambda04 {



    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();

        list.add(45);
        list.add(58);
        list.add(4);
        list.add(2);
        list.add(10);


        //no need data type of i, java will auto associate
        list.forEach(i-> System.out.println(i));
    }
}
