package iteratoConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class iteratorConcept {
    public static void main(String[] args) {

        List<String> arrList=new ArrayList<>();

        arrList.add("Shehan");
        arrList.add("Shehan2");
        arrList.add("Shehan3");
        arrList.add("Shehan4");
        arrList.add("Shehan5");
        arrList.add("Shehan6");
        arrList.add("Shehan7");
        new iteratorConcept().display(arrList);

    }

    void display(List<String> list){
        Iterator<String> iterator=list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("**********************");

        ListIterator<String>listIterator=list.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
}
