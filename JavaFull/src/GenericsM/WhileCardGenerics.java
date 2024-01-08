package GenericsM;


import java.util.ArrayList;
import java.util.List;

class Vehicle2{
    private int vehicleId;

    public Vehicle2(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                '}';
    }

    public void infor(){
        System.out.println("Vehicle Id is: "+getVehicleId());
    }
}


class Car extends Vehicle2{
    private String carModel;

    public String getCarModel() {
        return carModel;
    }

    public Car(int vehicleId, String carModel) {
        super(vehicleId);
        this.carModel = carModel;
    }

    @Override
    public void infor() {
        System.out.println("Car Model is: "+getCarModel());
    }
}



public class WhileCardGenerics {
    public static void main(String[] args) {
        List<Vehicle2> list=new ArrayList<>();

        list.add(new Vehicle2(12));
        list.add(new Vehicle2(34));
        list.add(new Vehicle2(145));
        list.add(new Vehicle2(312));
        list.add(new Car(121,"Fer"));

        display(list);

    }


    //exend -  upper bound parent and child class object-widly used
    //super -lower bound
    public static void display(List<? extends Vehicle2>list){
        for (Vehicle2 v:list
             ) {
            System.out.println(v);
        }
    }

    public static void displayLowerBound(List<? super Car>list){
        for (Object v:list
        ) {
            System.out.println(v);
        }
    }
}
