package hw5;

import java.util.Scanner;

public class Task3 {

    //    3. Составьте программу, которая вычисляет произведение чисел от 1 до n.
//    n вводится с клавиатуры.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int n = scanner.nextInt();
        int pr = 1;
        for (int i = 1; i <= n; i++) {
            pr *= i;
        }
        System.out.println("Произведение чисел = " + pr);
    }

}
