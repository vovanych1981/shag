package hw1;

public class Task5 {
    public static void main(String[] args) {
//         Begin21. Даны координаты трех вершин треугольника: (x1,y1), (x2,y2), (x3,y3).
//        Найти его периметр и площадь, используя формулу для расстояния между двумя точками на плоскости
//        (см. задание Begin20. Для нахождения площади треугольника со
//        сторонами a, b, c использовать формулу Герона: где p = (a+b+c)/2 – полупериметр.


        int x1 = 4;
        int y1 = 10;
        int x2 = 8;
        int y2 = 9;
        int x3 = 3;
        int y3 = 4;
        double a = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        double b = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
        double c = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);

        double p = (a + b + c) / 2;
        System.out.printf("%.2f\n", p);

        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.printf("%.2f\n", S);
    }
}

