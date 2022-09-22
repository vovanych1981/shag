package lesson18;

import java.util.Random;

/*Создать класс "Матрица". Класс должен иметь следующие переменные:

        двумерный массив вещественных чисел;
        количество строк и столбцов в матрице.
        Класс должен иметь следующие методы:

        сложение с другой матрицей;
        умножение на число;
        вывод на печать;
        умножение матриц - по желанию.*/
public class Matrix {
    private double[][] m;
    private int stroki;
    private int stolbcy;

    public Matrix() {

    }

    public Matrix(int n, int m) {
        stroki = n;
        stolbcy = m;
        this.m = new double[stroki][stolbcy];



    }

    public Matrix(double[][] arr) {
        stroki = arr.length;
        stolbcy = arr[0].length;
        m = new double[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; i < arr[i].length; i++) {
                m[i][j] = arr[i][j];
            }
        }
    }

    public Matrix addMatrix(Matrix b) {
        Matrix res = null;
        if (stroki == b.stroki && stolbcy == b.stolbcy) {
            res = new Matrix(stroki, stolbcy);
            for (int i = 0; i < stroki; i++) {
                for (int j = 0; j < stolbcy; j++) {
                    res.m[i][j] = m[i][j] + b.m[i][j];
                }
            }
        }
        return res;
    }

    public void fillMatrix(double a) {
        for (int i = 0; i < stroki; i++) {
            for (int j = 0; j < stolbcy; j++){
                m[i][j] = a;
            }
        }
    }

    public void print() {
        for (int i = 0; i < stroki; i++) {
            for (int j = 0; j < stolbcy; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}