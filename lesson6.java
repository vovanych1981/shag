import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class lesson6 {
    public static void main(String[] args) {
//        For6. Дано вещественное число — цена 1 кг конфет.
//        Вывести стоимость 1.2,1.4, . . . , 2 кг конфет.
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите цену: ");
//        double price = scanner.nextDouble();
//        for (double weight = 1.2; weight < 2.001; weight += 0.2) {
//            System.out.println(Math.round(weight * 10) / 10.0 + "кг стоят " + Math.round(weight * price * 100) / 100.0);
//        }

//        For7. Даны два целых числа A и B (A < B). Найти сумму всех целых чисел
//        от A до B включительно.
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите два целых числа, первое меньше второго: ");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int sum = 0;
//        for (int i = a; i <= b; i++) {
//            sum = sum + i;
//        }
//        System.out.println("Сумма = " + sum);

//        For8. Даны два целых числа A и B (A < B). Найти произведение всех целых
//        чисел от A до B включительно.
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите два целых числа, первое меньше второго: ");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int pr = 1;
//        for (int i = a; i <= b; i++) {
//            pr = pr * i;
//        }
//        System.out.println("Приозведение = " + pr);

//        For9. Даны два целых числа A и B (A < B). Найти сумму квадратов всех целых
//        чисел от A до B включительно.
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите два целых числа, первое меньше второго: ");
//        double a = scanner.nextInt();
//        double b = scanner.nextInt();
//        double sum = 1;
//        for (double i = a; i <= b; i++) {
//            sum = sum + Math.pow(i, 2);
//        }
//        System.out.println("Произведение " + sum);

//        For10. Дано целое число N (> 0). Найти сумму
//        1 + 1/2 + 1/3 + . . . + 1/N (вещественное число).

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите целое число больше нуля: ");
//        int n = scanner.nextInt();
//        double sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum = sum + 1.0 / i;
//        }
//        System.out.println(sum);

//        For11. Дано целое число N (> 0). Найти сумму
////    //    N2 + (N + 1)2 + (N + 2)2 + . . . + (2·N) 2

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите целое число больше нуля: ");
//        int n = scanner.nextInt();
//        int sum = 0;
//        for (int i = 0; i <= n; i++) {
//            sum = sum + (n+i)*(n+i);
//        }
//        System.out.println(sum);

//        Series1. Даны десять вещественных чисел. Найти их сумму.

//        double sum = 0.0;
//        Scanner in = new Scanner(System.in);
//        for (int i = 1; i <= 10; i++) {
//            double x = in.nextDouble();
//            sum = sum + x;
//        }
//        System.out.println("Сумма = " + sum);

//        Series2. Даны десять вещественных чисел. Найти их произведение.
//        double sum = 1;
//        Scanner in = new Scanner(System.in);
//        for (int i = 1; i <= 10; i++) {
//            double x = in.nextDouble();
//            sum = sum * x;
//        }
//        System.out.println("Произведение = " + sum);

//        Series3. Даны десять вещественных чисел. Найти их среднее арифметическое.

//        double sum = 0;
//        Scanner in = new Scanner(System.in);
//        for (int i = 1; i <= 10; i++) {
//            double x = in.nextDouble();
//            sum = (sum + x)/x;
//        }
//        System.out.println("Среднее арифметическое = " + sum);

//        Series4. Дано целое число N и набор из N вещественных чисел. Вывести
//        сумму и произведение чисел из данного набора.

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите целое число: ");
//        double sum = 0;
//        double pro = 1;
//
//        int N = in.nextInt();
//        for (int i = 1; i <= N; i++) {
//            sum = sum + i;
//            pro = pro * i;
//        }
//        System.out.println(sum+ " " + pro);

//        Series5. Дано целое число N и набор из N положительных вещественных
//        чисел. Вывести в том же порядке целые части всех чисел из данного
//        набора (как вещественные числа с нулевой дробной частью), а также
//        сумму всех целых частей.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        double sum = 0;

        int N = in.nextInt();
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
