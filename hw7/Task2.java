package hw7;



import java.util.Scanner;

public class Task2 {

    //Proc18. Описать функцию CircleS(R) вещественного типа, находящую площадь круга радиуса R
    //(R — вещественное). С помощью этой функции найти площади трех кругов с данными радиусами.
    //Площадь круга радиуса R вычисляется по формуле S = ?·R^2. В качестве значения ? использовать 3.14.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r;
        for (int i = 1; i < 4; i++) {
            System.out.println("Введите радиус " + i + " круга");
            r = scan.nextDouble();
            System.out.println("Площадь круга = " + circleS(r));
        }
    }

    static double circleS(double r) {
        final double pi = 3.14;
        return pi * (r * r);
    }
}








