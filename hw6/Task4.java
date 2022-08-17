package hw6;

import java.util.Scanner;

public class Task4 {
//    Array23. Дан массив размера N и целые числа K и L (1 < K ? L ? N).
//    Найти среднее арифметическое всех элементов массива, кроме элементов
//    с номерами от K до L включительно.

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
        for (int i = 0; i < k - 1; i++) {
            sum += array[i];
        }
        System.out.println("первая сумма = " + sum);

        int sum1 = 0;
        for (int i = l; i < n; i++) {
            sum1 += array[i];
        }
        System.out.println("вторая сумма = " + sum1);
        int sred_arifm = (sum + sum1) / (n - ((l - k) + 1));

        System.out.println("Среднеарифметическое всех элементов кроме от K до L включительно =  " + sred_arifm);
    }
}
