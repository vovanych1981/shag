package lesson25;

public interface Queue<T> {

    boolean isEmpty();
    void addElement(T data);
    T removeElement();
    T peekFirst();

}
