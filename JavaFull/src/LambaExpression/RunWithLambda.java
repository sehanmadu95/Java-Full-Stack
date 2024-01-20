package LambaExpression;

public class RunWithLambda {

    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Statment ");
            }
        });

        thread.start();


        Thread thread1=new Thread(()-> System.out.println("Stamnt 2"));

        thread1.start();
        
        new Thread(()->{
            System.out.println("Hi");
            System.out.println("Hw are you");
        }).start();
     }

}
