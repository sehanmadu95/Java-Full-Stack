package CollectionFramwork;

import java.util.Map;
import java.util.TreeMap;

public class SearchInMap {

    public static void main(String[] args) {

        Map<Integer,String> map=new TreeMap<>();

        map.put(1,"SHEHAN");
        map.put(10,"Madu");
        map.put(11,"Nalaka");
        map.put(54,"njhj");

        for (Map.Entry<Integer,String> sets:map.entrySet()
             ) {
            if(sets.getValue().equals("SHEHAN")){
                System.out.println(sets.getKey());
            }

        }

    }
}
