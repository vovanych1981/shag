package Lesson43;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Auto {
    private String marka;
    private int yearOfProd;
    private int price;
    private String color;
    private int volume;

    public Auto(String marka, int yearOfProd, int price, String color, int volume) {
        this.marka = marka;
        this.yearOfProd = yearOfProd;
        this.price = price;
        this.color = color;
        this.volume = volume;
    }

    public String getMarka() {
        return marka;
    }

    public int getYearOfProd() {
        return yearOfProd;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marka='" + marka + '\'' +
                ", yearOfProd=" + yearOfProd +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", volume=" + volume +
                '}';
    }
}

public class Task3 {
    public static void main(String[] args) {
        List<Auto> auto = new ArrayList<>();
        auto.add(new Auto("BMW", 2011, 10000, "white", 1500));
        auto.add(new Auto("Mercedes", 2013, 11000, "Black", 1200));
        auto.add(new Auto("Lada", 2011, 14000, "red", 1550));
        auto.add(new Auto("Porsche", 2020, 23000, ",blue", 1100));
        auto.add(new Auto("Buick", 2018, 19000, "red", 1250));
        Stream<Auto> autos = auto.stream();
        System.out.println(auto);
        auto.stream().filter(x -> x.getColor().equals("red")).forEach(System.out::println);
        //System.out.println();
        auto.stream().filter(x -> x.getVolume() >= 1500).forEach(x -> System.out.print(x + " "));
        System.out.println();
        auto.stream().filter(x -> x.getPrice() > 22000).forEach(x -> System.out.print(x + " "));
        System.out.println();
        auto.stream().filter(x -> x.getYearOfProd() > 2014 && x.getYearOfProd() < 2019).forEach(x -> System.out.print(x + " "));


    }
}
