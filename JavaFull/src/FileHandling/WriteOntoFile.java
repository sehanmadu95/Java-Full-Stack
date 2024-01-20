package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteOntoFile {
    public static void main(String[] args) {
         File directory=new File("FileHandle\\First");
         directory.mkdirs();

         File file=new File("FileHandle\\First\\first.txt");
        try {
            file.createNewFile();
            System.out.println("File Created...");
        } catch (IOException e) {

            System.out.println("Error Occured while creating file...");
        }

        //append used to write on file without erasing content
        try(BufferedWriter bw=new BufferedWriter(new FileWriter(file,true))) {
                bw.write("Hi SHEHAN MADUSHANKA");
                bw.newLine();
                bw.write("Hi SHEHAN MADUSHANKA HOw Are you?");
                bw.newLine();

            System.out.println("Wring completed on file....");
        } catch (IOException e) {
            System.out.println("Error occured when writing on File");
        }

    }
}
