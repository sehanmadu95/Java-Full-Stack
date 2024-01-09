package GenericsM;
/**
*

 * The naming convensions are as follow
 * T- Type
 * E - Elements
 * K - Key
 * N - Number
 * V - Value


* */

class Data<K,V>{
    private K key;
    private V value;

    public Data(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public  <k,v> void display(k key,v value){
        System.out.println(key+"   "+value);
    }

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
public class TypeParameters {
    public static void main(String[] args) {

        Data<Integer,String> d =new Data<Integer,String>(1,"Shehan");
        System.out.println(d);

        d.display(10,"String");

    }
}
