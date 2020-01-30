package name.zavgorodnii;

public interface MyStack<E> {
    public boolean empty();

    public E push(E element);

    public E pop();

    public E peek();

    public int search(E element);

    public E getMin();
}
