package hw6;

import java.util.Scanner;

public class Task2 {

//    Array20. Дан массив размера N и целые числа K и L (1 ? K ? L ? N). Найти
//    сумму элементов массива с номерами от K до L включительно.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Число N = ");
        int n = sc.nextInt();
        System.out.print("Число K = ");
        int k = sc.nextInt();
        System.out.print("Число L = ");
        int l = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = k-1; i <=l-1; i++) {
            sum += array[i];

        }
        System.out.println("Суммма элементов массива с номерами от K до L равна: " + sum);

    }
}
