package Lesson43;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        final int size = 10;
        List<Integer> mas = new ArrayList<>(size);
        Random gen = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            mas.add(gen.nextInt(201) - 100);
        }


        System.out.println(mas);

        System.out.println("Четных " + mas.stream().filter(x -> x % 2 == 0 && x != 0).count());
        System.out.println("Нечетных " + mas.stream().filter(y -> y % 2 != 0).count());
        System.out.println("Равных нулю " + mas.stream().filter(z -> z == 0).count());
        System.out.println("Введите число ");
        int n = sc.nextInt();
        System.out.println("Равных " + mas.stream().filter(z -> z == 0).count());
    }
}