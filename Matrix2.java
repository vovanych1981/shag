package lesson15;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrix2 {
    static void fillMatrix(int[][] fmas) {
        Random gen = new Random();
        for (int i = 0; i < fmas.length; i++) {   // кол-во строк
            for (int j = 0; j < fmas[i].length; j++) {  // кол-во столбцов в строке
                fmas[i][j] = gen.nextInt(10);
            }
        }
    }

    static void task20(int[][] fmas) {
        for (int k = 0; k < fmas[0].length; k++) {
            int p = 1;
            for (int i = 0; i < fmas.length; i++) {
                p *= fmas[i][k];
            }
            System.out.println(p);
        }
    }

    static int taskL1(int[][] fmas) {
        int sum = 0;
        for (int a = 0; a < fmas.length; a++) {
            sum += fmas[a][a];
        }
        return sum;
    }

    static void initField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = ' ';
            }
        }
    }

    static void printLineSeparator() {
        for (int k = 0; k < 3; k++) {
            System.out.print("|---");
        }
        System.out.println('|');
    }

    static void printField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            printLineSeparator();
            for (int j = 0; j < field.length; j++) {
                System.out.print("| " + field[i][j] + " ");
            }
            System.out.println('|');
        }
        printLineSeparator();
    }

    static void turn(char[][] field, char symbol) {
        Scanner in = new Scanner(System.in);
        int row = 0;
        int column = 0;
        do {
            System.out.print("Введите номер строки ");
            row = in.nextInt();
            System.out.print("Введите номер столбца ");
            column = in.nextInt();
        } while (row < 0 || row > 2 || column < 0 || column > 2 || field[row][column] != ' ');
        field[row][column] = symbol;
    }

    static boolean chekWin(char[][] field, char symbol) {
        boolean result = false;
        // если в любой строке три одинаковых символов
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == field[i][1] && field[i][1] == field[i][2] && field[i][2] == symbol) {
                result = true;
                break;
            }
        }
        //если в любом столбце три одинаковых символа
        for (int j = 0; j < field[0].length; j++) {
            if (field[j][0] == field[j][1] && field[j][1] == field[j][2] && field[j][2] == symbol) {
                result = true;
                break;
            }
        }
        //если на главной диагонали три одинаковых символа
        if (field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[2][2] == symbol)
            result = true;
        //если на побочной диагонали три одинаковых символа
        if (field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[2][0] == symbol)
            result = true;
        return result;
    }

    static boolean chekDraw(char[][] field) {
        boolean result = true;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == ' ') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int n = 3;
        final int m = 3;
        int[][] mas = new int[n][m];
        //fillMatrix(mas);
        //System.out.println(Arrays.deepToString(mas));
        //task20(mas);
        // Найти сумму для элементов главной диагонали

        //System.out.println(taskL1(mas));
        final char xSymbol = 'X';
        final char oSymbol = 'O';
        final int size = 3;
        char[][] field = new char[size][size];
        // заполнить пустое поле - заполнить его пробелами
        initField(field);
        printField(field);
        //игровой цикл
        while (true) {
            // ход крестиков
            turn(field, xSymbol);
            //вывести поле
            printField(field);
            // если победа крестиков - конец игры - прервать цикл
            if (chekWin(field, xSymbol)) {
                System.out.println("Выиграли крестики");
                break;
            }
            //ничья - конец игры - прервать цикл
            if (chekDraw(field)) {
                System.out.println("Ничья");
                break;
            }
            //ход ноликов
            turn(field, oSymbol);
            //вывести поле
            printField(field);
            //победа ноликов - конец игры - прервать цикл
            if (chekWin(field, oSymbol)) {
                System.out.println("Выиграли нолики");
                break;
            }
            //ничья - конец игры - прервать цикл
            if (chekDraw(field)) {
                System.out.println("Ничья");
                break;

            }
        }
    }
}