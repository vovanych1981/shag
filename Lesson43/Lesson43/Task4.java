package Lesson43;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;

class TV {
    private String model;
    private int yearOf;
    private int price;
    private int diagonal;
    private String producer;

    public TV(String model, int yearOf, int price, int diagonal, String producer) {
        this.model = model;
        this.yearOf = yearOf;
        this.price = price;
        this.diagonal = diagonal;
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public int getYearOf() {
        return yearOf;
    }

    public int getPrice() {
        return price;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return "TV{" +
                "model='" + model + '\'' +
                ", yearOf=" + yearOf +
                ", price=" + price +
                ", diagonal=" + diagonal +
                ", producer='" + producer + '\'' +
                '}';
    }
}

public class Task4 {
    public static void main(String[] args) {

        List<TV> tvs = new ArrayList<>();
        tvs.add(new TV("KDL", 2010, 200, 24, "Sony"));
        tvs.add(new TV("KDL1", 2009, 300, 24, "LG"));
        tvs.add(new TV("KDL2", 2023, 280, 32, "Sharp"));
        tvs.add(new TV("KDL3", 2018, 410, 40, "Sony"));
        tvs.add(new TV("KDL4", 2021, 340, 55, "Philips"));

        Stream<TV> tvStream = tvs.stream();
        System.out.println(tvs);
        tvs.stream().filter(x -> x.getDiagonal() == 24).forEach(System.out::println);
        System.out.println();
        tvs.stream().filter(x -> x.getProducer().equals("Sony")).forEach(System.out::println);
        System.out.println();
        tvs.stream().filter(x -> x.getYearOf()== 2023).forEach(System.out::println);
        System.out.println();
        tvs.stream().filter(x -> x.getPrice()>400).forEach(System.out::println);
        System.out.println();
        // сортировка по цене по возрастанию
        tvs.stream().sorted(Comparator.comparing(TV::getPrice)).forEach(System.out::println);
        System.out.println();
       // сортировка по цене по убыванию
        tvs.stream().sorted(Comparator.comparing(TV::getPrice).reversed()).forEach(System.out::println);

    }
}
