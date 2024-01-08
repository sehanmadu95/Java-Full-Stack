package CollectionFramwork;


import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class DataCShorting<K,V>{
    private K key;
    private V value;

    public DataCShorting(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "DataCShorting{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
public class CustomSorting {



    public static void main(String[] args) {

        Comparator<DataCShorting<Integer,String>> COMPARE_KEY=new Comparator<DataCShorting<Integer, String>>() {
            @Override
            public int compare(DataCShorting<Integer, String> obj1, DataCShorting<Integer, String> obj2) {
                if (obj1.getKey()< obj2.getKey()){
                    return -1;
                } else if (obj1.getKey()> obj2.getKey()) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
        };


        Comparator<DataCShorting<Integer,String>> COMPARE_LENGTH=new Comparator<DataCShorting<Integer, String>>() {
            @Override
            public int compare(DataCShorting<Integer, String> obj1, DataCShorting<Integer, String> obj2) {
                if (obj1.getValue().length()< obj2.getValue().length()){
                    return -1;
                } else if (obj1.getValue().length()> obj2.getValue().length()) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
        };
        Set<DataCShorting<Integer,String>>set=new TreeSet<>(COMPARE_LENGTH);
        
        //set.add(new DataCShorting("Key","Value"));
        set.add(new DataCShorting(10,"Shehan"));
        set.add(new DataCShorting(2,"as"));
        set.add(new DataCShorting(1,"dsdf"));
        set.add(new DataCShorting(5,"Madudfd"));
        set.add(new DataCShorting(8,"Madu"));

        for (DataCShorting d:set
             ) {
            System.out.println(d);
        }
    }
}
