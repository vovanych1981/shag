package Lesson32;

import java.util.*;

public class Main {
    // работа с HashSet
    public static void main(String[] args) {
        /*Set<String> set = new HashSet<>();
        //add
        set.add("мама");
        set.add("мыла");
        set.add("раму");
        set.add("мыла");
        for (String s : set) {
            System.out.println(s);
        }
        //remove
        set.remove("мыла");
        System.out.println("После удаления \"мыла\"");
        for (String s : set) {
            System.out.println(s);
        }
        //contains
        System.out.println(set.contains("папа"));
        // size

        System.out.println("Размер множества: " + set.size());

        // clear
        set.clear();
        //isEmpty
        System.out.println(set.isEmpty());*/

        /*Set<String> s = new HashSet<>();
        s.add("Россия");
        s.add("Испания");
        s.add("Италия");
        s.add("Венгрия");
        s.add("Швеция");
        System.out.println(s.contains("Россия"));*/

        // работа с TreeSet

        /*Set<HeavyBox> heavyBoxSet = new TreeSet<>();
        Random rnd = new Random();
        for(int i =0;i<=10;i++){
            heavyBoxSet.add(new HeavyBox(rnd.nextInt(20) + 1));
        }
        for(HeavyBox box:heavyBoxSet){
            System.out.println(box);
        }*/

        // Сортировка товара по разным полям

        Product[] productArray = {
                new Product("Вилка", 1.24, 5),
                new Product("ложка", 1.55, 4),
                new Product("тарелка", 2.55, 3),
                new Product("кастрюля", 3.05, 6),
                new Product("кастрюля", 10.2, 4),
                new Product("нож", 2.01, 2),
                new Product("сковорода", 4.23, 7),
        };
        List<Product> products = Arrays.asList(productArray);
        /*System.out.println("Сортировка по имени");
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
               return o1.getName().compareTo(o2.getName());
            }
        });*/
        //System.out.println(products);
        //System.out.println("Сортировка по цене");
        //по названию
        Comparator<Product> compByName = (o1, o2) -> o1.getName().compareTo(o2.getName());
        // по цене по возрастанию
        Comparator<Product> compByPrice = (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice());
        Collections.sort(products, compByName);
        System.out.println(products);
        Collections.sort(products, compByPrice);
        System.out.println(products);
        // по цене по убыванию
        Collections.sort(products, Collections.reverseOrder(compByPrice));
        System.out.println(products);


    }

    public static void sortProducts(List<Product> products, int choise, boolean revers) {
        switch (choise) {
            case 1:
                //по названию
                Comparator<Product> compByName = (o1, o2) -> o1.getName().compareTo(o2.getName());
                Collections.sort(products, compByName);
                break;
            case 2:
                // по цене по возрастанию
                Comparator<Product> compByPrice = (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice());
                Collections.sort(products, compByPrice);
                break;
        }

    }

}
