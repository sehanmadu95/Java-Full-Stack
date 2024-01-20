package FileHandling;

import java.io.File;
import java.io.IOException;

public class MakeDirectory {
    public static void main(String[] args) throws IOException {
        File directory=new File("FileHandle");
        directory.mkdir();
        System.out.println("Directory created....");


        File file=new File("FileHandle\\text.txt");
        file.createNewFile();
        System.out.println("File created....");

    }
}


/**
if want to create sub directory used makdirs() method

 */
