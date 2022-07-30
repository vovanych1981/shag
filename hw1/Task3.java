package hw1;

public class Task3 {
    public static void main(String[] args) {
        // Begin19. Даны координаты двух противоположных вершин прямоугольника: (x1,y1),  (x2,y2).
        // Стороны прямоугольника параллельны осям координат. Найти периметр и площадь данного прямоугольника.

        int x1 = 4;
        int y1 = 6;
        int x2 = 9;
        int y2 = 3;

        double P = 2*(Math.abs(x1-x2)+Math.abs(y1-y2));
        System.out.println(P);

        double S = Math.abs(x1-x2)*Math.abs(y1-y2);
        System.out.println(S);
    }
}
