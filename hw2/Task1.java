package hw2;

import java.util.Scanner;

public class Task1 {

//    Integer15. Дано трехзначное число. Вывести число, полученное при перестановке цифр сотен и десятков
//    исходного числа (например, 123 перейдет в 213).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int number = scanner.nextInt();
        int sotni = number / 100;
        int des = (number / 10) % 10;
        int ed = number % 10;
        int new_number = des * 100 + sotni * 10 + ed;
        System.out.println(new_number);
        
    }
}
