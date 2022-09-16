/*
* Кондратенко В.И.
* Matrix 20, 21
* */


package hw8;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    static void fillMatrix(int[][] arr, int left, int right) {
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = gen.nextInt(right - left + 1) + left;
            }
        }
    }

    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int proisvMatrix(int[][] arr, int k) {
        int proisv = 1;
        for (int j = 0; j < arr[k].length; j++) {

            proisv *= arr[j][k];

        }
        return proisv;
    }

    static int sredneArifm(int[][] arr, int k) {
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {

            sum += arr[j][k];

        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int m = in.nextInt();
        final int n = in.nextInt();
        int[][] mas = new int[m][n];

        fillMatrix(mas, 0, 10);
        printMatrix(mas);

        // Matrix20. Дана матрица размера M ? N. Для каждого столбца матрицы найти произведение его элементов.

        /*for (int j = 0; j < mas.length; j++) {
            System.out.println("Произведение " + j + "-ого столбца " + proisvMatrix(mas, j));
        }*/

//        Matrix21. Дана матрица размера M ? N. Для каждой строки матрицы с нечетным номером (1, 3, . . .)
//        найти среднее арифметическое ее элементов. Условный оператор не использовать.
        for (int i = 1; i < mas.length; i += 2) {
            System.out.println("Среднее арифметическое элементов " + i + "-ой строки " + (sredneArifm(mas, i)) / m);
        }

    }

}
