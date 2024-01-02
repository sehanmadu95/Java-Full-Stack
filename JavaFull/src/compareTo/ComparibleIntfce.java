package compareTo;


import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Name implements Comparable<Name>{
    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Name obj) {
        if(name.length()==obj.name.length()){
            return 0;
        } else if (name.length()<obj.name.length()) {
            return 1;
        }
        else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
public class ComparibleIntfce {

    public static void main(String[] args) {
        List<Name> list=new LinkedList<>();

        list.add(new Name("Shehan"));
        list.add(new Name("Sheh"));
        list.add(new Name("Sh"));
        list.add(new Name("S"));

        System.out.println(list);

        System.out.println("*****************");

        //Collections.sort(list);
        list.sort(null);

        System.out.println(list);

    }


}
