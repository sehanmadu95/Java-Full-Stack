package FileHandling;

import java.io.File;
import java.io.IOException;

public class createFileOnDisk {
    public static void main(String[] args) throws IOException {
        //if we not give path file will created inside project folder
        File file=new File("shehsn.txt");

        //ile file=new File("src\\ shehsn.txt"); relative path
        file.createNewFile();
        System.out.println("File Created....");
    }
}

/**
 * realativ path
Absolute/actual path: full path
 used \\(double backword slash, bcz one \ used for escape character
macOs used / but its not issue / or \ both work bcz java platform independt
*/
