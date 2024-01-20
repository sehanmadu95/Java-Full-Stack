package FileHandling;

import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        File file=new File("FileHandle\\First\\first.txt");

        if(file.delete()){
            System.out.println("File Deleted....");

        }
        else{
            System.out.println("Error Occure....");
        }

    }
}
