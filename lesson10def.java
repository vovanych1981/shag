package lesson10;

import java.util.Random;
import java.util.Scanner;

public class lesson10def {
    //    Proc1. Описать функцию PowerA3(A), вычисляющую третью степень числа A и возвращающую ее
    //    С помощью этойфункции найти третьи степени пяти разных чисел.


    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите целое число ");
            int x = in.nextInt();
            System.out.println(x + "^3 = " + powerA3(x));
        }*/

//        Proc3. Описать 2 функции aMean(X, Y), вычисляющую
//        среднее арифметическое AMean = (X+Y)/2 и GMean (X, Y) среднее геометрическое
//                GMean =√  X·Y двух положительных чисел X и Y.  С помощью
//        этой функции найти среднее арифметическое и среднее геометрическое
//        для пар (A, B), (A, C), (A, D), если даны A, B, C, D.

        /*int a = 5;
        for (int i = 0; i < 3; i++) {
            int z = (int) (Math.random() * 10);
            System.out.println(a + " " + z + " amean = " + aMean(a, z));
            System.out.println(a + " " + z + " gmean = " + gMean(a, z));
        }*/
//        Proc4. Описать 2 функции TriangleP(a), вычисляющую по стороне a
//        равностороннего треугольника его периметр P = 3·a и TriangleP(a)
//        площадь S = a2√      3/4  (все параметры являются вещественными).
//        С помощью этой процедуры найти периметры и площади
//        трех равносторонних треугольников с данными сторонами.
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите сторону треугольника ");
        double a = in.nextDouble();
        for (int i = 0; i < 3; i++) {
            System.out.println("Периметр треугольника со стороной " + a + " = " + perimetr(a));
            System.out.println("Площадь треугольника со стороной " + a + " = " + ploshad(a));
        }*/

//        Proc5.
        /*Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите x1: ");
            int x1 = in.nextInt();
            System.out.println("Введите x2: ");
            int x2 = in.nextInt();
            System.out.println("Введите y1: ");
            int y1 = in.nextInt();
            System.out.println("Введите y2: ");
            int y2 = in.nextInt();
            System.out.println("\n Периметр равен " + rectP(x1, y1, x2, y2));
        }*/

//        Вычесть площадь треугольника по формуле Герона.
        // S = кв.корень p*(p-a)*(p-b)*(p-c)
        // p - полупериметр, a,b,c - стороны
        // проверить, с помощью функции
        // Вычислить площадь трех треугольников

       /* Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите стороны треугольника ");
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if (isTriangle(a, b, c)) {
                System.out.println("Площадь треугольника " + s(a, b, c));
            } else {
                System.out.println("Треугольника не существует");
            }
        }*/

//
//        Proc6. Описать процедуру DigitCountSum(K), находящую количество
//        цифр целого положительного числа K. С помощью этой функции
//        найти количество и сумму цифр для каждого из пяти данных целых чисел.
        /*Random gen = new Random();
        for (int i = 0; i < 5; i++) {
            int x = gen.nextInt(1_000_000);
            System.out.println("В числе " + x + digitCount(x) + " цифр");
            System.out.println("В числе " + x + sum(x) + " сумма цифр");
        }*/

//        Proc8◦//. Описать функцию AddRightDigit(D, K), добавляющую к целому положительному числу K
//        справа цифру D.   С помощью этой процедуры последовательно добавить к данному числу K
//        справа данные цифры D1 и D2,выводя результат каждого добавления.
/*Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int k = in.nextInt();
        for (int i = 0; i < 5; i++){
            System.out.println("Введите цифру ");
            int d = in.nextInt();
            System.out.println(addRightDigit(d,k));
        }*/

//        Proc16. Описать функцию Sign(X) целого типа, возвращающую для целого
//        числа X следующие значения:−1, если X < 0; 0, если X = 0; 1, если X > 0.



    }//MAIN

    static int sign(int k){
        int sign = 0;
        if(k<0) sign =  -1;
        else if (k==0) sign = 0;
        else if(k>0) sign = 1;
        return sign;
    }

    static int addRightDigit(int d, int k) {
        return k*10+d;
    }


    static int digitCount(int a) {
        int k = 0;
        while (a != 0) {
            a /= 10;
            k++;
        }
        return k;

    }

    static int sum(int a) {
        int sum = 0;
        while (a != 0) {
            int c = a % 10;
            a /= 10;
            sum += c;
        }
        return sum;

    }

    static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    static double p(int a, int b, int c) {
        return (a + b + c) / 2.0;
    }

    static double s(int a, int b, int c) {
        double p = p(a, b, c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    /*static int powerA3(int a) {
        return a * a * a;
    }

    static double aMean(int x, int y) {
        return (x + y) / 2.0;
    }

    static double gMean(int x, int y) {
        return Math.sqrt(x * y);
    }*/
    static double perimetr(double a) {
        return (3 * a);
    }

    static double ploshad(double a) {
        return (a * a * (Math.sqrt(3) / 4));

    }

    static int rectP(int x1, int y1, int x2, int y2) {
        int a = Math.abs(x1 - x2);
        int b = Math.abs(y1 - y2);
        return 2 * (a + b);
    }

}//class Main
