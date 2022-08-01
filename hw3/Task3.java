package hw3;

import java.util.Scanner;

public class Task3 {
//
//    Boolean21. Дано трехзначное число. Проверить истинность высказывания:
//            «Цифры данного числа образуют возрастающую последовательность». (ОТ СОТЕН К ЕДИНИЦАМ!!!)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int number = scanner.nextInt();
        boolean i = ((number / 100) < (number % 100 / 10)) & ((number % 100 / 10) < (number % 10));
        System.out.println(i);

    }
}
