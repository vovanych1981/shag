package Lesson43;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        List<String> stat = new ArrayList<>();
        stat.add("Нью-Йорк");
        stat.add("Копенгаген");
        stat.add("Минск");
        stat.add("Брест");
        stat.add("Витебск");
        stat.add("Брест");
        Stream<String> stream = stat.stream();
        System.out.println(stat);

        stat.stream().filter(x->x.length()>6).forEach(x-> System.out.print(x +" "));
        System.out.println();
        System.out.print(stat.stream().filter(x->x.equals("Минск")).count());
        System.out.println();
        stat.stream().filter(x->x.charAt(0) == 'Б').forEach(x-> System.out.print(x +" "));
        System.out.println();
    }
}
