package hw1;

public class Task4 {
    public static void main(String[] args) {
//         Begin20. Найти расстояние между двумя точками с заданными координатами (x1,y1) и (x2,y2) на плоскости.
//         Расстояние вычисляется по формуле √(x2 — x1)2 + (y2 — y1)2

        int x1 = 3;
        int y1 = 10;
        int x2 = 8;
        int y2 = 6;

        double L = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.printf("%.4f\n", L);
    }
}