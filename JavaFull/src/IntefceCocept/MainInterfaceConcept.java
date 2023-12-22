package IntefceCocept;

public class MainInterfaceConcept {
    public static void main(String[] args) {

        Phone samsung=new Samsung();
        Phone appl=new Apple();

        System.out.println(appl.os());
        System.out.println(samsung.os());
    }
}
