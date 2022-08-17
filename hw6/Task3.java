package hw6;

import java.util.Scanner;

public class Task3 {

//    Array21. Дан массив размера N и целые числа K и L (1 ? K ? L ? N).
//    Найти среднее арифметическое элементов массива с номерами от K до L
//    включительно.

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
        for (int i = k; i <=l; i++) {
            sum += array[i];
        }
        System.out.println("Среднеарифметическое элементов массива от K до L равна: " + ((sum)/(l-k+1)));
    }
}
