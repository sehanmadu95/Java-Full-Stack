package StackConc;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {
        Stack<Integer> stackDemo=new Stack<>();

        stackDemo.push(0);
        stackDemo.push(1);
        stackDemo.push(2);
        stackDemo.push(3);
        stackDemo.push(4);
        stackDemo.push(5);

        //remove item in stack
        stackDemo.pop();

        for (int num:stackDemo
             ) {
            System.out.println(num);
        }

        //reurn last item
        System.out.println(stackDemo.peek());


        //check stacj empty or not
        if(stackDemo.isEmpty()){
            System.out.println("Stack Empty...");
        }

        //search elements
        System.out.println(stackDemo.search(2));




    }
}
