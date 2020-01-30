package name.zavgorodnii;

import java.lang.reflect.Array;
import java.util.EmptyStackException;

public class MyStackImpl<E> implements MyStack {
    int maxLenght;
    int position = -1;
    private E[] stack;

    public MyStackImpl(int maxLenght, Class<E> clazz) {
        this.maxLenght = maxLenght;
        if(maxLenght > Integer.MAX_VALUE){
            System.out.println("Stack is too big!!!");
            return;
        }
        stack = (E[]) Array.newInstance(clazz, maxLenght);
    }

    @Override
    public boolean empty() {
        return position==-1;
    }

    @Override
    public E push(Object element) {
        stack[++position] = (E) element;
        return stack[position] ;
    }

    @Override
    public Object pop() {
        if(position < 0){
            throw new EmptyStackException();
        }
        return stack[position--];
    }

    @Override
    public Object peek() {
        if(position > -1) {
            return stack[position];
        }
        throw new EmptyStackException();
    }

    @Override
    public int search(Object element) {
        for (int i=0; i < stack.length; i++){
            if(element.equals(stack[i])){
                return i;
            }
        }
        return -1;
    }
}
