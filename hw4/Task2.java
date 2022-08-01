package hw4;

import java.util.Scanner;

public class Task2 {

//    If10. ƒаны две переменные целого типа: A и B. ≈сли их значени€ не равны, то присвоить
//    каждой переменной сумму этих значений, а если равны, то присвоить переменным нулевые значени€.
//    ¬ывести новые значени€ переменных A и B.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите два целых числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a != b) {
            a = a + b;
            b = a;
            System.out.println("a: " + a + " " + "b: " + b);
        } else {
            a = 0;
            b = 0;
            System.out.println(a + " " + b);
        }
    }
}
