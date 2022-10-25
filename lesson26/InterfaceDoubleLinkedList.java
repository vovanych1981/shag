package lesson26;

public interface InterfaceDoubleLinkedList<T>{
    boolean isEmpty();
    void addFirst(T data);
    void addLast(T data);

    void addLast();

    void removeFirst();
    void removeLast();
    //T getLast;
    //T getFirst;
    void removeAll();


}
