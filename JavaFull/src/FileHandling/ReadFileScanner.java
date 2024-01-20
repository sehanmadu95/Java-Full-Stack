package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileScanner {
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(new File("FileHandle\\First\\first.txt"));
            String line;
            while (sc.hasNext()){
                line=sc.nextLine();
                System.out.println(line);
            }

            sc.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
