package hw4;

import java.util.Scanner;

public class Task6 {
//    If24. Для данного вещественного x найти значение следующей функции f,
//    принимающей вещественные значения:
//    f (x) = 2·sin(x), если x > 0,
//            6 - x, если x <= 0.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        double x = scanner.nextDouble();
        double f;

        if (x > 0) {
            f = 2 * Math.sin(x);
            System.out.println("f(x)= " + f);
        } else {
            f = 6 - x;
            System.out.println("f(x)= " + f);

        }
    }
}