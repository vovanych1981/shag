package lesson9;

import java.util.Random;
import java.util.Scanner;

public class lesson9array {

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        } while (size <= 0);
        int[] arr = new int[size];
        Random gen = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                System.out.println(arr[i] + " на позиции " + i);
            }
        }*/
        /*Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        } while (size <= 0);
        int[] arr = new int[size];
        Random gen = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int min = arr[0];
        int minIndex = 0;
        for(int i = 1;i < arr.length; i++){
            if(arr[i] < min){
                minIndex = i;
            }
        }
        System.out.println("min = " + min + "index = " + minIndex);*/

//        Array28. Дан массив A размера N.
//                Найти минимальный элемент из его элементов с четными номерами: A2, A4, A6, . . . .
        /*Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        } while (size <= 0);
        int[] arr = new int[size];
        Random gen = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int min = arr[0];
        int minIndex = 0;
        for(int i = 1;i < arr.length; i+=2){
            if(arr[i] < min){
                minIndex = i;
            }
        }
        System.out.println("min = " + min + "index = " + minIndex);*/

        // найти максимальный среди нечетных
        /*Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        } while (size <= 0);
        int[] arr = new int[size];
        Random gen = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int max = arr[0];
        int maxIndex = 0;
        for(int i = 1;i < arr.length; i+=2){
            if(arr[i] > max){
                maxIndex = i;
            }
        }
        System.out.println("max = " + max + "index = " + maxIndex);*/
//
//        Array51. Даны массивы A и B одинакового размера N. Поменять местами их
//        содержимое и вывести вначале элементы преобразованного массива A, а
//        затем — элементы преобразованного массива B.

        /*Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        } while (size <= 0);

        int[] arr = new int[size];
        int[] mas = new int[size];

        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(10);
            mas[i] = gen.nextInt(21) - 10;
        }
        // вывод массивов
        System.out.println("Массив arr");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Массив mas");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        for(int i=0; i<arr.length;i++){
            int temp = arr[i];
            arr[i] = mas[i];
            mas[i] = temp;
        }
        //обмен
        System.out.println("Массив arr");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Массив mas");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();*/

        //Array 52.
        /*Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        } while (size <= 0);

        int[] a = new int[size];
        int[] b = new int[size];
        Random gen = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.nextInt(10);
        }
        // вывод массива а
        System.out.println("Массив a");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
// формируем массив b
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 5) {
                b[i] = 2 * a[i];
            } else {
                b[i] = a[i] / 2;
            }
        }
        // вывод массива b
        System.out.println("Массив b");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();*/

        //Array 53.

        /*Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        } while (size <= 0);

        int[] a = new int[size];
        int[] b = new int[size];
        int[] c = new int[size];
        // заполнение масивов a и b случайными числами
        Random gen = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.nextInt(10);
            System.out.print(a[i] + " ");
        }
        System.out.println("Массив a");

        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < b.length; i++){
            b[i] = gen.nextInt(10);
            System.out.print(b[i] + " ");
        }
        System.out.println("Массив b");
        for (int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }
        System.out.println();
        // формируем массив c
        for (int i = 0; i < c.length; i++){
            if(a[i] >= b[i]){
                c[i] = a[i];
            }else{
                c[i] = b[i];
            }
        }
        //вывод массива c
        System.out.println("Массив с");
        for (int i = 0; i < c.length; i++){
            System.out.print(c[i] + " ");
        }
        System.out.println();*/

//        Array54. Дан целочисленный массив A размера N. Переписать в новый целочисленный массив B
//        все четные числа из исходного массива (в том же
//        порядке) и вывести размер полученного массива B и его содержимое.
        /*Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        } while (size <= 0);

        int[] a = new int[size];
        // заполнение случайными числами
        Random gen = new Random();

        int even_qty = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.nextInt(15);
            if (a[i] % 2 == 0) even_qty++;
        }
        System.out.println("Массив а");
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i] + " ");
        }
        if (even_qty == 0) {
            System.out.println("В массиве а нет четных чисел");
        } else {
            int[] b = new int[even_qty];
            int j =0;
            for(int i=0; i<a.length; i++){
                if(a[i]%2==0){
                    b[j]=a[i];
                    j++;
                }
            }
            System.out.println("Массив b");
            for(int i=0; i<b.length; i++){
                System.out.print(b[i] + " ");
            }
            System.out.println();
        }*/

//        Array55. Дан целочисленный массив A размера N (≤ 15). Переписать в новый
//        целочисленный массив B все элементы с нечетными порядковыми номерами (1, 3, . . .) и
//        вывести размер полученного массива B и его содержимое.Условный оператор не использовать.
        /*Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        } while (size <= 0);
        int[] a = new int[size];
        int[] b = new int[size / 2];
        // заполнение случайными числами
        Random gen = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = gen.nextInt(15);
        }
        // вывод массива а
        System.out.println("Массив а");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        //формирование массива b
        for (int i = 1, j = 0; i < a.length; i += 2, j++) {
            b[j] = a[i];
        }
        // вывод массива b
        System.out.println("Массив b");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }*/


//        Array65. Дан массив A размера N и целое число K (1 ≤ K ≤ N). Преобразовать
//        массив, увеличив каждый его элемент на исходное значение элемента AK.

        /*Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        } while (size <= 0);
        int[] a = new int[size];
        // заполнение случайными числами
        Random gen = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = gen.nextInt(20);
        }
        // вывод массива а
        System.out.println("Исходный массив а");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("Введите номер элемента массива ");
        int k = in.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (i != k) {
                a[i] += a[k];
            }
        }
        a[k] += a[k];
        System.out.println("Преобразованный массив а");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();*/

//        Array68◦ Дан массив размера N. Поменять местами его минимальный и максимальный элементы.
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        } while (size <= 0);
        int[] a = new int[size];
        // заполнение случайными числами
        Random gen = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.nextInt(20);
        }
        // вывод массива а
        System.out.println("Исходный массив а");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        //ищем мак и мин элемент в массиве
        int min = a[0];
        int minIndex = a[0];
        int max = a[0];
        int maxIndex = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                minIndex = i;
            } else if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
        }
// переставляем мечстами

        a[minIndex]=max;
        a[maxIndex]=min;

    }
}