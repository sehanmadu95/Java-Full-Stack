package MultiThreading;

public class JoinOverView {

    public static int count=0;
    public static void main(String[] args) {

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int x=0;x<=1000;x++){
                    count++;
                }
            }
        });

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                for (int x=0;x<=1000;x++){
                    count++;
                }
            }
        });


        thread.start();
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Value of count is: "+count);

    }
}
