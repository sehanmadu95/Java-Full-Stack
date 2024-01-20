package FileHandling;

import java.io.*;

public class ReadingFileWuthBW {
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
            bw.close();

            System.out.println("Wring completed on file....");
        } catch (IOException e) {
            System.out.println("Error occured when writing on File");
        }

        try {
            BufferedReader br=new BufferedReader(new FileReader("FileHandle\\First\\first.txt"));
            String line;
            int count=0;
            while((line=br.readLine() )!=null){
                System.out.println(line);
                System.out.println(count);
                count++;
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
