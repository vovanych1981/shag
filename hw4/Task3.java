package hw4;

import java.util.Scanner;

public class Task3 {
//    If13. ƒаны три числа. Ќайти среднее из них (то есть число, расположенное между наименьшим и наибольшим).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите три целых числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a - b) * (c - a) >= 0) {
            System.out.print(a);
        } else if ((b - a) * (c - b) >= 0) {
            System.out.print(b);
        } else {
            System.out.print(c);
        }
    }
}
