package MultiThreading;


class BracketGenerate{
     synchronized public void generate(){
        for (int x=1;x<=50;x++){
            if(x<=25){
                System.out.print("[");
            }
            else {
                System.out.print("]");
            }
        }
        System.out.println();
    }
}
public class SynchroMethods {
    public static void main(String[] args) {

        BracketGenerate bracketGenerate=new BracketGenerate();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=5;i++){
                    bracketGenerate.generate();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=5;i++){
                    bracketGenerate.generate();
                }
            }
        }).start();

    }
}

//if method marked synchronize , that method cant acces to thread simulteniously