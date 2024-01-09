package GenericsM;

import java.util.ArrayList;
import java.util.List;

class Data2{
    public <E> void displayData(List<E> list){
        for (E listItem:list
             ) {
            System.out.println(listItem);

        }

    }

    public <E> void displayArrayData(E [] list){
        for (E listItem:list
        ) {
            System.out.println(listItem);

        }

    }
}
public class GenericMethodds {
    public static void main(String[] args) {

        Data2 d=new Data2();

        List<Integer> listInt=new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        d.displayData(listInt);


        List<String>listString=new ArrayList<>();
        listString.add("Shehan");
        listString.add("Shehan2");
        listString.add("Shehan3");
        listString.add("Shehan4");

        d.displayData(listString);


        String [] name={"a","b","c"};

        d.displayArrayData(name);


    }
}
