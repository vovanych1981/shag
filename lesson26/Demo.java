package lesson26;

public class Demo {
    public static void main(String[] args) {
        DoubleLinkedList<String> str = new DoubleLinkedList<>();
        str.addLast("Vasya");
        str.addLast("Peta");
        str.addLast("Masha");
        System.out.println(str);

    }
}
