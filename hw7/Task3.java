package hw7;

import java.util.Scanner;

public class Task3 {

//    Proc 19. Описать функцию RingS(R1, R2) вещественного типа, находящую площадь кольца,
//    заключенного между двумя окружностями с общим центром и радиусами R1 и R2 (R1 и R2 — вещественные, R_1 > R_2).
//    С ее помощью найти площади трех колец, для которых даны внешние и внутренние радиусы.
//    Воспользоваться формулой площади круга радиуса R: S = ?R2.
//    В качестве значения ? использовать 3.14.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.print("Введите R1: ");
            double r1 = scan.nextDouble();
            System.out.print("Введите R2, но меньше чем R1: ");
            double r2 = scan.nextDouble();
            System.out.println("Площадь " + i + " кольца: " + ringS(r1,r2));
        }
    }

    static double ringS(double r1, double r2) {
        final double pi = 3.14;
        double s = pi * (r1 * r1 - r2 * r2);
        if(r1>r2){
            return s;
        }else
            return 0;

    }
}
