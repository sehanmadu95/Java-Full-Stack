package MultiThreading;

class BracketGenerate2{
    private Object lock="lock";
     public void generate(){


         synchronized(lock) {
            for (int x = 1; x <= 50; x++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (x <= 25) {
                    System.out.print("[");
                } else {
                    System.out.print("]");
                }
            }
        }


        System.out.println();

        for (int x=1;x<=10;x++){
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class SynchroBlock {

    public static void main(String[] args) {
        BracketGenerate2 bracketGenerate=new BracketGenerate2();

        new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime=System.currentTimeMillis();
                for (int i=1;i<=5;i++){
                    bracketGenerate.generate();
                }
                long endTime=System.currentTimeMillis();
                System.out.println("Time taken to process: "+(endTime-startTime));
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime=System.currentTimeMillis();
                for (int i=1;i<=5;i++){
                    bracketGenerate.generate();
                }
                long endTime=System.currentTimeMillis();
                System.out.println("Time taken to process: "+(endTime-startTime));
            }
        }).start();
        
    }
}
