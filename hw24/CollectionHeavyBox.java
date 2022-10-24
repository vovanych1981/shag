package hw24;

import Lesson24.HeavyBox;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//        Создать коллекцию, содержащую объекты HeavyBox.
//        Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
//        Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.

public class CollectionHeavyBox {

    public static void main(String[] args) {
        List<HeavyBox> list = new ArrayList<>();
        list.add(new HeavyBox(2));
        list.add(new HeavyBox(500));
        list.add(new HeavyBox(350));
        list.add(new HeavyBox(10));

        List<HeavyBox> veryHeavyBoxes = getVeryHeavyBoxes(list);

        System.out.println(list);
        System.out.println(veryHeavyBoxes);
    }

    private static List<HeavyBox> getVeryHeavyBoxes(List<HeavyBox> list) {
        List<HeavyBox> veryHeavyBoxes = new ArrayList<>();
        Iterator<HeavyBox> iterator = list.iterator();
        while (iterator.hasNext()) {
            HeavyBox box = iterator.next();
            if (box.getWeight() > 300) {
                veryHeavyBoxes.add(box);
                iterator.remove();
            }
        }
        return veryHeavyBoxes;
    }
}
