package lesson14;

import java.util.Random;
import java.util.Scanner;

public class Array2 {
    static void fillMatrix(int[][] arr, int left, int right) {
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {   // кол-во строк
            for (int j = 0; j < arr[i].length; j++) {  // кол-во столбцов в строке
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

    static void task1(int[][] arr) {
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 10 * i;
            }
        }
    }

    static void task2(int[][] arr) {
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 5 * j;
            }
        }
    }

    static void showString(int[][] arrayName, int k) {
        if (k < 0 || k >= arrayName.length) {
            System.out.println("Ошибка. Нет такой строки.");
        } else {
            for (int i = 0; i < arrayName[k].length; i++) {
                System.out.println(arrayName[k][i] + " ");
            }
            System.out.println();
        }
    }

    static void showRow(int[][] arrayName, int k) {
        if (k < 0 || k >= arrayName.length) {
            System.out.println("Ошибка. Нет такого столбца.");
        } else {
            for (int i = 0; i < arrayName[k].length; i++) {
                System.out.println(arrayName[i][k] + " ");
            }
            System.out.println();
        }
    }

    static void printEvenRows(int[][] arrayName) {
        for (int i = 0; i < arrayName.length; i += 2) {
            for (int j = 0; j < arrayName[i].length; j++) {
                System.out.print(arrayName[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int sumOfRow(int[][] arrayName, int k) {
        int sum = 0;
        for (int j = 0; j < arrayName[k].length; j++) {
            sum += arrayName[k][j];
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int n = 4;
        final int m = 5;
        int[][] mas = new int[n][m];
        //final int k = 0;
        //k = in.nextInt();
        //fillMatrix(mas,0,10);
        //printMatrix(mas);

//        Matrix1. Даны целые положительные числа M и N. Сформировать целочисленную матрицу размера M × N,
//                у которой все элементы I-й строки имеют значение 10·I (I = 1, . . ., M).

        //task1(mas);
        //printMatrix(mas);

//        Matrix2. Даны целые положительные числа M и N. Сформировать целочисленную матрицу размера M × N,
//                у которой все элементы J-го столбца  имеют значение 5·J (J = 1, . . ., N).

        //task2(mas);
        //printMatrix(mas);

//        Matrix7◦ Дана матрица размера M × N и целое число K (0 ≤ K < M). Вывести
//        элементы K-й строки данной матрицы

//        fillMatrix(mas, 0, 10);
//        printMatrix(mas);
//        System.out.println("Введите номер строки: ");
//        showString(mas, k);

//        Matrix8. Дана матрица размера M × N и целое число K (1 ≤ K ≤ N). Вывести
//        элементы K-го столбца данной матрицы.

        //showRow(mas,k);
        //printMatrix(mas);
//        Matrix9. Дана матрица размера M × N. Вывести ее элементы, расположенные
//        в строках с четными номерами (2, 4, . . .). Вывод элементов производить
//        по строкам, условный оператор не использовать.

//        fillMatrix(mas, -10, 10);
//        printMatrix(mas);
//        System.out.println("Строки с четными номерамим");
//        printEvenRows(mas);

//        Matrix17. Дана матрица размера M × N и целое число K (1 ≤ K ≤ M). Найти
//        сумму и произведение элементов K-й строки данной матрицы.

//        fillMatrix(mas, 1, 5);
//        printMatrix(mas);
//        int k;
//        do{
//            System.out.println("Введите номер строки: ");
//            k = in.nextInt();
//        }while(k<0 || k>=mas.length);
//        System.out.println("Сумма элементов " + k + "-ой строки " + sumOfRow(mas, k));

//        Matrix19. Дана матрица размера M × N. Для каждой строки матрицы найти
//        сумму ее элементов.
        fillMatrix(mas,1,5);
        printMatrix(mas);
        for(int i = 0; i< mas.length; i++) {

            System.out.println("Сумма " + i + "-ой строки " + sumOfRow(mas,i));
        }
    }
}
