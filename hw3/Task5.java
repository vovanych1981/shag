package hw3;

import java.util.Scanner;

public class Task5 {

//    Boolean25. Даны числа x, y. Проверить истинность высказывания:
//            «Точка с координатами (x, y) лежит во второй координатной четверти».

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        boolean tochka = x < 0 && y > 0;
        System.out.println(tochka);
    }
}