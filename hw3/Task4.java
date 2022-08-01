package hw3;

import java.util.Scanner;

public class Task4 {

//    Boolean24. Даны числа A, B, C (число A не равно 0). Рассмотрев дискриминант D = B^2 – 4·A·C,
//    проверить истинность высказывания: «Квадратное уравне-ние A·x^2 + B·x + C = 0 имеет вещественные корни».

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа, где A != 0: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double d = Math.pow(b, 2) - 4 * a * c;
        System.out.println(d >= 0);


    }
}
