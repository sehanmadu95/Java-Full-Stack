package LambaExpression;


interface Demo{
    public void lamdaDemo();
}
public class LamDaOverview {
    public static void main(String[] args) {


        Demo demoMain=new Demo() {
            @Override
            public void lamdaDemo() {
                System.out.println("Withou Lambda declaration");
            }
        };


         Demo demo=(()-> System.out.println("Hi This Calling using Lmbda expression.."));


        Demo demo2=()->{ System.out.println("Hi This Calling using Lmbda expression..");

            System.out.println("Statmnt 2");
            System.out.println("Statement 3");
        };

        demo.lamdaDemo();

        System.out.println("*******************");
        demo2.lamdaDemo();

    }
}
//after java 8
//functiona interface --> definitly it has one abstract method
