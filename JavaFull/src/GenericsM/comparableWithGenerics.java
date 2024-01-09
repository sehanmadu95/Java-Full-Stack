package GenericsM;


class Data4<T extends Comparable<T>> implements Comparable<T> {
    private T number;

    public Data4(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Data{" +
                "number=" + number +
                '}';
    }

    @Override
    public int compareTo(T o) {
        return getNumber().compareTo(o);
    }
}
public class comparableWithGenerics {
    public static void main(String[] args) {

        Data4 d=new Data4<>(5);

        System.out.println(d.compareTo(6));

    }
}
