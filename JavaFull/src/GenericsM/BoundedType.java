package GenericsM;


class Data3 <K extends Integer,V>{
    private K key;
    private V value;

    public Data3(K key, V value) {
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
        return "Data{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
    public <E extends  Character,N extends  Number > void display(E element, N number){
        System.out.println("Element: "+element+" Number:"+number);
    }

}
public class BoundedType {

    public static void main(String[] args) {
        Data3 d=new Data3(1,"value");
        d.display('d',1);
    }
}
