package InnerClass;

public class InnerMain {
    public static void main(String[] args) {
            Door door=new Door();

            door.shopStatus();

            door.getLock().setLock(false);

            door.shopStatus();

    }
}
