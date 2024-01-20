package FileHandling.ObjectSerializations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

    public static void main(String[] args) {

        try(FileInputStream fis=new FileInputStream("JavaFull/src/FileHandling/ObjectSerializations/vehical.dat")){
            try(ObjectInputStream obj=new ObjectInputStream(fis)){

                Vehicle v1=(Vehicle)obj.readObject();
                Vehicle v2=(Vehicle)obj.readObject();

                System.out.println("Object1: "+v1);
                System.out.println("Object2: "+v2);

                System.out.println("Object Reading completed.....");


            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
