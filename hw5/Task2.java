package hw5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // 2. —оставьте программу, которая вычисл€ет сумму чисел от 1 до n.
        // значение n вводитс€ с клавиатуры.
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите целое число: ");

        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
