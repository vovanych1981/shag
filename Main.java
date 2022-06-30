package lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Integer1◦
//. Дано расстояние L в сантиметрах. Используя операцию деления
//        нацело, найти количество полных метров в нем (1 метр = 100 см).

//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите целое число - к-во в сантиметрах: ");
//        int L = in.nextInt();
//        System.out.println(L/100 + " метров");
//
//
//        Integer2◦
//. Дана масса M в килограммах. Используя операцию деления нацело,
//        найти количество полных тонн в ней (1 тонна = 1000 кг).
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите целое число - к-во килограммов: ");
//        int K = in.nextInt();
//        System.out.println(K/1000 + " тонн");
//
////        Integer3◦
//. Дан размер файла в байтах. Используя операцию деления нацело,
//        найти количество полных килобайтов, которые занимает данный файл
////                (1 килобайт = 1024 байта).
//        Scanner in = new Scanner(System.in);
//        int byute
//
//        Integer6◦
//. Дано двузначное число. Вывести вначале его левую цифру (десятки), а затем — его правую цифру (единицы). Для нахождения десятков
//        использовать операцию деления нацело, для нахождения единиц — операцию взятия остатка от деления.

//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите двузначное число: ");
//        int D = in.nextInt();
//        System.out.println(D/10 + " - это десятки");
//        System.out.println(D%10 + " - это единицы");

//        Integer7◦
//. Дано двузначное число. Найти сумму и произведение его цифр.
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите двузначное число: ");
//        int D = in.nextInt();
//        int a = D/10;
//        int b = D%10;
//        System.out.println((a+b) + " - это сумма");
//        System.out.println((a*b) + " - это произведение");

//        Integer8◦
//. Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа.

//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите двузначное число: ");
//        int number = in.nextInt();
//        int chislo1 = number/10;
//        int chislo2 = number%10;
//        int x = chislo2 * 10 + chislo1;
//
//        System.out.println(x + " Это новое число");

//        Integer9◦
//. Дано трехзначное число. Используя одну операцию деления нацело,
//  вывести первую цифру данного числа (сотни).

//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите трехзначное число: ");
//        int number = in.nextInt();
//        System.out.println("Первая цифра равняется - " + number/100);

//        Integer10◦
//. Дано трехзначное число. Вывести вначале его последнюю цифру
// (единицы), а затем — его среднюю цифру (десятки).


//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите трехзначное число: ");
//        int number = in.nextInt();
//        System.out.println("Единицы - " + number%10);
//        int des = (number/10) % 10; // (number%100) / 10;
//        System.out.println("Единицы - " + des);

//        Integer11◦
//. Дано трехзначное число. Найти сумму и произведение его цифр.
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите трехзначное число: ");
//        int number = in.nextInt();
//        int edinicy = number%10;
//        int des = (number / 10) % 10;
//        int sotni = number / 100;
//        System.out.println("Сумма: " + (edinicy+des+sotni));
//        System.out.println("Произведение: " + (edinicy*des*sotni));

//        Integer12◦
//. Дано трехзначное число. Вывести число, полученное при прочтении исходного числа справа налево.

//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите трехзначное число: ");
//        int number = in.nextInt();
//        int edinicy = number%10;
//        int des = (number / 10) % 10;
//        int sotni = number / 100;
////        System.out.printf("%s%s%s\n", edinicy, des, sotni);
//        int res = 100*edinicy + 10*des + sotni;
//        System.out.println(res);

//        Integer13◦
//. Дано трехзначное число. В нем зачеркнули первую слева цифру и
//  приписали ее справа. Вывести полученное число.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int number = in.nextInt();
        int ed = number%100;
        int sotni = number / 100;
        int nov_chislo = ed*10 + sotni;
        System.out.println(nov_chislo);






    }

}
