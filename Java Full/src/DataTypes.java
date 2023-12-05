import java.math.BigDecimal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class DataTypes {
    public static void main(String[] args) {

        //primitive data type

        //Integer type data
        int number=5;
        short number2=10;
        long number3=45L;

        //floating type data
        float x=45f;
        double dValue=45d;

        double num1=1.55;
        double num2=2.05;

        System.out.println(num1+num2);

        //bigedecimal remove the auto round option
        BigDecimal b=new BigDecimal("1.55");
        BigDecimal b2=new BigDecimal("2.05");

        System.out.println(b.add(b2));

        char oneDigit='S';

        char unicode='\u00BB';

        String uni="hello this is unicode \u00BB";
        String s=new String("Hi this is declaration");
        System.out.println(unicode);

        System.out.println(uni);


        String num11="10";
        int num222=20;
        System.out.println(num222+num11); //if one variable String other variable getting auto type casting

  // ===== Type Casting===
        // Implicit casting(Widening||Automatically)

        // byte(8bit) --> Short(16) --> int(32) --> long(64)  ==Integer Type

        // flot(32) --> double(64)  ==floating type


        //Explicity Casting (Narrowing)

        //double --> float --> long --> int --> short --> byte









    }
}