package hw7;

import java.util.Scanner;

public class Task4 {

//    Proc20. Описать функцию TriangleP(a, h), находящую периметр равнобедренного треугольника
//    по его основанию a и высоте h, проведенной к    основанию (a и h — вещественные). С помощью этой функции найти
//    периметры трех треугольников, для которых даны основания и высоты.
//    Для нахождения боковой стороны b треугольника использовать теорему
//    Пифагора: b2 = (a/2)2 + h2

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int i =1; i<4; i++){
            System.out.print("Введите основание а: ");
            double a = scan.nextDouble();
            System.out.print("Введите высоту h: ");
            double h = scan.nextDouble();
            System.out.println("Периметр треугольника " + i + " = " + triangleP(a,h));
        }
    }
    static double triangleP(double a, double h) {
        double b = Math.sqrt((a/2)*2+(h*h));
        double perimeter = 2 * a + b;

        return perimeter;
    }
}

