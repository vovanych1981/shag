package lesson11;

import java.util.Random;
import java.util.Scanner;

public class lesson11 {
    // заполнение случайныи числами
    static void fillRandom(int[] mas, int left, int right) {
        Random gen = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = gen.nextInt(right - left + 1) + left;
        }
    }

    static void print(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    static int sumOfArray(int[] mas) {
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }
        return sum;
    }

    static int proOfArray(int[] mas) {
        int pro = 1;
        for (int i = 0; i < mas.length; i++) {
            pro *= mas[i];
        }
        return pro;
    }

    static double arifmOfArray(int[] mas) {
        int arifm = 0;
        for (int i = 0; i < mas.length; i++) {
            arifm += mas[i];
        }
        return (double) arifm / mas.length;
    }

    static int countLessK(int[] mas, int k) {
        int qwe = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < k) qwe++;
        }
        return qwe;
    }

    static int numElem(int[] mas, int k) {
        int res = -1;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > k) {
                res = i;
                break;
            }
        }
        return res;
    }

    static void printLessRight(int[] mas, int k) {
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] < mas[i + 1]) {
                System.out.println(mas[i] + " ");
            }
        }
        System.out.println();
    }

    static void countLessRight(int[] mas, int k) {
        int qwe = 0;
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] < mas[i + 1]) {
                qwe++;
            }
        }
        return qwe;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];

        fillRandom(arr, -10, 10);
        print(arr);
        Scanner in = new Scanner(System.in);
//        Series1◦. Дан десять целых чисел. Найти их сумму
        //int k = proOfArray(arr);
        //System.out.println("Произведение чисел равна " + k);
        //Найти их среднее арифметическое
        //System.out.println("Среднееарифметическое " + arifmOfArray(arr));

//        14. Дано целое число K и массив из целых чисел; признак его
//        завершения — число 0. Вывести количество чисел в массиве, меньших K.
//        System.out.println("Введите К ");
        //      int k = in.nextInt();
//        System.out.println("Кол-во эл-тов <k " + countLessK(arr, k));

//        15. Дано целое число K и массив целых чисел;
//        Вывести номер первого числа в наборе, большего K.
//                Если таких чисел нет, то вывести -1.
//        System.out.println("Введите К ");
//        int k = in.nextInt();
//        System.out.println("Кол-во первого эл-та > k " + numElem(arr, k));


//        Series20. Дано целое число N (> 1) и массви из N целых чисел. Вывести те
//        элементы в наборе, которые меньше своего правого соседа, и количество K
//        таких элементов.

    }
}