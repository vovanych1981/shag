package hw4;

import java.util.Scanner;

public class Task4 {
    //    If20. На числовой оси расположены три точки: A, B, C. Определить, какая из двух последних точек (B или C)
//    расположена ближе к A, и вывести эту точку и ее расстояние от точки A.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((Math.abs(a - b)) < (Math.abs(a - c))) {
            System.out.println("Ближе находится точка b: " + b + ", и она находится на расстоянии: "
                    + Math.abs(a - b));
        } else
            System.out.println("Ближе находится точка c: " + c + ", и она находится на расстоянии: "
                    + Math.abs(a - c));


    }
}