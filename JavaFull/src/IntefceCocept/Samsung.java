package IntefceCocept;

public class Samsung implements  Phone{


    @Override
    public String processor() {
        return "snapDragon";
    }

    @Override
    public String os() {
        return "Android";
    }

    @Override
    public String storageGb() {
        return "64GB";
    }


}
