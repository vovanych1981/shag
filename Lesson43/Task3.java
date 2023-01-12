package Lesson43;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Auto{
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

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getYearOfProd() {
        return yearOfProd;
    }

    public void setYearOfProd(int yearOfProd) {
        this.yearOfProd = yearOfProd;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
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
        auto.add(new Auto("BMW", 2011,10000,"white",1500 ));
        auto.add(new Auto("Mercedes", 2013, 11000, "Black", 1200));
        auto.add(new Auto("Lada", 2011, 14000, "red", 1550));
        auto.add(new Auto("Porsche", 2020, 23000, ",blue", 1100));
        auto.add(new Auto("Buick", 2018, 19000, "red", 1250));
        Stream<Auto> autos = auto.stream();
        System.out.println(auto);
        auto.stream().filter(x->x.getColor().equals("red")).forEach(x-> System.out.print(x +" "));
    }

}
