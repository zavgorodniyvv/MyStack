package name.zavgorodnii;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStackImpl<>(5, Integer.class);
        stack.push(2);
        System.out.println(stack.empty());
        System.out.println("Stack = " + stack.peek());

        stack.push(1);
        System.out.println("Stack = " + stack.peek());

        stack.push(3);
        System.out.println("Stack = " + stack.peek());
        System.out.println("Min element = " + stack.getMin());
        System.out.println(stack.search(2));
        System.out.println("===============");
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.empty());
    }
}
