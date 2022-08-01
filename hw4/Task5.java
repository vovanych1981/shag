package hw4;

import java.util.Scanner;

public class Task5 {

//    If21. ƒаны целочисленные координаты точки на плоскости. ≈сли точка совпадает с началом координат,
//    то вывести 0. ≈сли точка не совпадает с началом координат, но лежит на оси OX или OY, то вывести
//        соответственно 1 или 2. ≈сли точка не лежит на координатных ос€х, то вывести 3.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите два числа: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("“очка совпадает с началом координат:" + 0);

        } else if (x == 0 && y != 0) {
            System.out.println("1");


        } else if (x != 0 && y == 0) {
            System.out.println("2");

        } else
            System.out.println("3");

    }
}
