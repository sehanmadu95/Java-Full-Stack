package linkListConcept;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkLists{
    public static void main(String[] args) {
        List<String> linkList=new LinkedList<>();

        linkList.add("Shehan");
        linkList.add("Shehan2");
        linkList.add("Shehan3");
        linkList.add("Shehan4");
        linkList.add("Shehan5");
        linkList.add("Shehan6");
        linkList.add("Shehan7");

        new linkLists().siplay(linkList);

        List<String>arrList=new ArrayList<>();
        arrList.add("Shehan");
        arrList.add("Shehan2");
        arrList.add("Shehan3");
        arrList.add("Shehan4");
        arrList.add("Shehan5");
        arrList.add("Shehan6");
        arrList.add("Shehan7");

        new linkLists().siplay(arrList);

    }

    public void siplay(List<String> list){
        for (String li:list
             ) {
            System.out.println(li);
        }
        System.out.println("****************");
    }
}
//link list memory efficient / fast operation
//array link is speed efficient / fast access