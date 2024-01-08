package CollectionFramwork;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCpncpt {
    public static void main(String[] args) {
        Set<String> nameSet=new TreeSet<>();

        for (int i=1;i<31;i++){
            nameSet.add("A"+i);
        }

        for (String name:nameSet
             ) {
            System.out.println(name);
        }


      //  System.out.println(nameSet.contains("Shehan"));
    }




}


//No Duplicate
//no Order
//No index value
//memeory efficient compare with list


/**
HashSet : No nay order / allows one null key / Faster for common operation

LinkedHashSet : element in added order / Allows one null key

TreeSet : Sort all object / no null keys / Slower
*/



  