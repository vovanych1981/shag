package com.company;

import java.util.Scanner;

public class lesson8array {
    public static void main(String[] args) {
        /*final int size = 10;
        int[] mas = new int[size];
        int[] mas1 = {0,1,2,3,4,5,6,7,8,9};
        for(int i=0; i<mas.length; i++){
            mas[i] = (int)(Math.random()*11)-5;
        }
        //вывести массива в строку
        for(int i=0; i<mas.length; i++){
            System.out.print(mas[i] + " ");
        }
        System.out.println();*/

//        Array1. Дано целое число N (> 0). Сформировать и вывести целочисленный
//        массив размера N, содержащий N первых положительных нечетных чисел:
//        1, 3, 5, . . . .
        /*Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        }
        while (size < 1);
        int[] arr = new int[size];
        int j = 1;
        for (int i = 0, j = 1; i < arr.length; i++) {
            arr[i]= j;
            j +=2;
        }
        for (int i = 0, j = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();*/

//        Array2. Дано целое число N (> 0). Сформировать и вывести целочисленный
//        массив размера N, содержащий степени двойки от первой до N-й: 2, 4, 8, 16, . . . .
        /*Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        }
        while (size < 1);
        int[] arr = new int[size];
        int j = 2;
        for (int i = 0; i < arr.length; i++) {
            arr[i]= j;
            j *=2;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();*/

//        Array3. Дано целое число N (> 1), а также первый член A и разность D арифметической прогрессии.
//        Сформировать и вывести массив размера N, содержащий N первых членов данной прогрессии:
//        A, A + D, A + 2·D, A + 3·D, . . . .
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int size = in.nextInt();
        int[] arifm = new int[size];
        int a = in.nextInt();
        int d = in.nextInt();
        arifm[0] = a;
        for (int i = 1; i < arifm.length; i++) {
            arifm[i] = a + i * d;
        }
        for (int i = 1; i < arifm.length; i++) {
            System.out.println(arifm[i] + " ");
        }
        System.out.println();*/

        /*Array7◦. Дан массив размера N. Вывести его элементы в прямом и обратном порядке.*/
       /* Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int size = in.nextInt();
        int[] arifm = new int[size];


        for (int i = 0; i < arifm.length; i++) {
            int a = (int) (Math.random() * 10);
            arifm[i] = (a);
        }
        for (int i = 0; i < arifm.length; i++) {
            System.out.print(arifm[i] + " ");
        }
        System.out.println();

        for (int i = arifm.length - 1; i >= 0; i--) {
            System.out.print(arifm[i] + " ");
        }*/

//        Array8. Дан целочисленный массив размера N. Вывести все содержащиеся в
//        данном массиве нечетные числа в порядке возрастания их индексов, а
//        также их количество K.
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int size = in.nextInt();
        int[] arifm = new int[size];

        for (int i = 0; i < arifm.length; i++) {
            int a = (int) (Math.random() * 10);
            arifm[i] = (a);
            System.out.print(arifm[i] + " ");
        }
        System.out.println();
        int kol = 0;
        for (int i = 0; i < arifm.length; i++) {
            if (arifm[i] % 2 != 0) {
                System.out.print(arifm[i]);
                kol++;
            }
        }
        System.out.println("\nКоличество нечетных чисел " + kol);*/


//        Array9. Дан целочисленный массив размера N. Вывести все содержащиеся в
//        данном массиве четные числа в порядке убывания их индексов, а также
//        их количество K.

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int size = in.nextInt();
        int[] arifm = new int[size];

        for (int i = 0; i < arifm.length; i++) {

            arifm[i] = (int) (Math.random() * 10);
            System.out.print(arifm[i] + " ");
        }
        System.out.println();
        int kol = 0;
        for (int i = arifm.length - 1; i >0 ; i--) {
            if (arifm[i] % 2 == 0) {
                System.out.print(arifm[i] + " ");
                kol++;
            }
        }
        System.out.println("\nКоличество четных чисел " + kol);

    }
}