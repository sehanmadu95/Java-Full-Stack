package CollectionFramwork;

import java.util.ArrayList;
import java.util.List;

public class ArraListCo {
    static ArrayList<String> listName=new ArrayList<>();

    public static void main(String[] args) {


        // Add item to arraylist

        listName.add("Shehan");
        listName.add("Madushana");
        listName.add("Ranga2");
        listName.add("Ranga3");
        listName.add("Ranga4");
        listName.add("Ranga5");
        listName.add("Ranga6");



        ArraListCo app=new ArraListCo();

        app.displayList(listName);

        System.out.println("**********************");

        app.removeItemsfromListByNme("Ranga3");

        app.displayList(listName);

        System.out.println("**********************");
        app.removeItemsfromListByPosition(1);



        app.displayList(listName);

        System.out.println(listName.get(0));
        System.out.println("**********************");
        app.mofdyNameByIndex(0,"check");
        app.displayList(listName);


        System.out.println("**********************");
        int posiion=app.searchPosition("check");
        if (posiion>-1){
            app.mofdyNameByIndex(posiion,"new check");
        }
        System.out.println("**********************");
        app.displayList(listName);



    }

    void removeItemsfromListByNme(String name){
        listName.remove(name);
    }

    void removeItemsfromListByPosition(int index){
        listName.remove(index);
    }

    void displayList(List<String>nameList){
        for (String name:nameList
             ) {
            System.out.println(name);

        }
    }

    void mofdyNameByIndex(int position, String name){
        listName.set(position,name);
    }


    int searchPosition(String name){
        if(listName.contains(name)){
            System.out.println("Name found....");
            return listName.indexOf(name);
        }
        else {
            System.out.println("Name not found....");
            return -1;
        }
    }
}
