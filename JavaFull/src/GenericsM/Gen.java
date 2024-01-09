package GenericsM;


class objectClass{
    private Object obj;

    public objectClass(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }
}

class genericClass<T>{
    private T data;

    public genericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
public class Gen {
    public static void main(String[] args) {

        /*objectClass obj=new objectClass("SHEHAN");

        String ob=(String)obj.getObj();

        System.out.println(ob);*/

        genericClass<String> gen=new genericClass<String>("SHEHAN");

        String name=gen.getData();
        System.out.println(name);



    }
}


/**
 *
Reusability
Stronger type checking, better type safty /  reuce runtime error
Eliminate type casting statements / improve program's perfomnce

 */
