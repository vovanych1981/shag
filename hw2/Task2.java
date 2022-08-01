package hw2;

import java.util.Scanner;

public class Task2 {

//    Integer16. Дано трехзначное число. Вывести число, полученное при перестановке
//    цифр десятков и единиц исходного числа (например, 123 перейдет  в 132).

    public static void main(String[] args) {
        System.out.println("Введите трехзначное число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sotni = number / 100;
        int des = (number / 10) % 10;
        int ed = number % 10;
        int new_number = sotni * 100 + ed * 10 + des;
        System.out.println(new_number);
    }
}
