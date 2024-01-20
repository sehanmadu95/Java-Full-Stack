package FileHandling;

import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter you name: ");
            String name=sc.nextLine();

            System.out.println("Name Is: "+name);
        }

    }
}

/**
if we use trywith resources its automatically close
we do notneed to close manually
*/
