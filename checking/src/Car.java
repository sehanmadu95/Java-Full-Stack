public class Car extends Vehicle {

    private String name2;
    private String color2;

    public Car() {
        setName("snameet");
        name2="dddd";
        color2="dddd";
    }

    @Override
    public String toString() {
        return "Car{" +
                "name1='" + getName() + '\'' +
                "name2='" + name2 + '\'' +
                ", color2='" + color2 + '\'' +
                '}';
    }
};

