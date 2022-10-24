package hw24;

import Lesson24.HeavyBox;

import java.util.ArrayDeque;
import java.util.Deque;

//        Создать очередь, содержащую объекты класса HeavyBox.
//        Используем класс ArrayDeque.
//        Поместить объекты в очередь с помощью метода offer().
//        Удалить объекты методом poll().

public class ArrayDequeTest {
    public static void main(String[] args) {
        Deque<HeavyBox> deque = new ArrayDeque<>();

        deque.offer(new HeavyBox(23));
        deque.offer(new HeavyBox(9));
        deque.offer(new HeavyBox(12));

        while (!deque.isEmpty()) {
            System.out.println(deque.poll());
        }
        System.out.println(deque);


    }

}
