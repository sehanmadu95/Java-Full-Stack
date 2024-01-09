package CollectionFramwork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapsConcept {
    public static void main(String[] args) {
        Map<Integer,String> student=new HashMap<>();
        student.put(3,"Name");
        student.put(2,"Madu");
        student.put(1,"Shehan");

        for (Map.Entry<Integer,String> data: student.entrySet()
             ) {
            System.out.println(data);
            //System.out.println("Key: "+data.getKey()+ "  Value: "+data.getValue());
        }

        for (Integer i: student.keySet()
             ) {

            System.out.println("Key: "+i+ "  Value: "+student.get(i));
        }

        Iterator<Map.Entry<Integer,String>>entry=student.entrySet().iterator();

        while (entry.hasNext()){
            System.out.println(entry.next());
            //entry.next().getKey()
        }
    }
}
//TreeMap -Sorted
//HashMap - unsorted  // sequence not garantee //value overides for same key