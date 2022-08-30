package hw7;

import java.util.Scanner;

public class Task5 {

    //    Proc21? Описать функцию SumRange(A, B) целого типа, находящую сумму
//    всех целых чисел от A до B включительно (A и B — целые). Если A > B,
//    то функция возвращает 0. С помощью этой функции найти суммы чисел
//    от A до B и от B до C, если даны числа A, B, C.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число A: ");
        int a = scan.nextInt();
        System.out.print("Введите целое число B: ");
        int b = scan.nextInt();
        System.out.print("Введите целое число C: ");
        int c = scan.nextInt();
        System.out.println("Сумма чисел от A до B: " + sumRange(a, b));
        System.out.println("Сумма чисел от B до C: " + sumRange(b, c));

    }

    static int sumRange(int a, int b) {
        if (a > b) return 0;
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }
}
