package LambaExpression;

import java.util.function.IntPredicate;

public class predicateLambda {
    public static void main(String[] args) {
        IntPredicate lessThan18=new IntPredicate() {
            @Override
            public boolean test(int value) {
                if (value<50){
                    return true;
                }
                else {
                    return false;
                }
            }
        };


        System.out.println(lessThan18.test(25));

        IntPredicate check=i->i>18;
        System.out.println(check.test(25));

        //muttiple predicate using and or
        System.out.println(check.and(lessThan18).test(60));

        new predicateLambda().demo(60,check,lessThan18);
    }
    public void demo(int x,IntPredicate intPredicate,IntPredicate intPredicate2){
        if(intPredicate.and(intPredicate2).test(x)){
            System.out.println("ok");
        }
        else {
            System.out.println("no");
        }
    }
}
