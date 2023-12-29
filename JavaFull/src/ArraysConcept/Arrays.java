package ArraysConcept;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
         int [] numbers={1,2,5,9,7};

         //declration
         String [] name;

         //initilization
         name =new String[5];
         name[0]="shehan";


         for(int x=0;x<numbers.length;x++){
             System.out.println(numbers[x]);
         }

         for(int x:numbers){
             System.out.println(x);
         }

        Scanner scanner=new Scanner(System.in);
         int num=scanner.nextInt();

    }
}


/**
*issues with arrays

The size of the array cannot be
increased or decreased once it is declared—arrays have a fixed size.*/

