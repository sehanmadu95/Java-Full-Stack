package FileHandling.ObjectSerializations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritObject {
    public static void main(String[] args) {

        Vehicle bike= new Vehicle("bike",234);
        Vehicle car= new Vehicle("car",234);

        try(FileOutputStream fos=new FileOutputStream("JavaFull/src/FileHandling/ObjectSerializations/vehical.dat")){
            try(ObjectOutputStream obj=new ObjectOutputStream(fos)){

                obj.writeObject(bike);
                obj.writeObject(car);

                System.out.println("Object Writting Completed....");

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
