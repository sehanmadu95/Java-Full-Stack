package IntefceCocept;

public class Apple implements Phone{
    @Override
    public String processor() {
        return "A12";
    }

    @Override
    public String os() {
        return "IOS";
    }

    @Override
    public String storageGb() {
        return "256GB";
    }
}
