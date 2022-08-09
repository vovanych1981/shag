package com.company;

import java.util.Scanner;

public class lesson7 {
    public static void main(String[] args) {
        //2. Составьте программу, котораЯ вычисляет сумму чисел от 1 до n.значение n вводится с клавиатуры.

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите числор n: ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++){
            int sum = 0;
            sum ++;
        }
        System.out.println(sum);

        *//*3. Составьте программу, составьте программу, которая вычисляет произведение чисел от 1 до n.
        n вводится с клавиатуры.*//*
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числор n: ");
        int n = in.nextInt();
        int sum = 1;
        for (int i = 0; i < n; i++){
            sum **;
        }
        System.out.println(sum);*/

        /*7. Ввести с клавиатуры 10 пар чисел. сравнить числа в каждой паре и напечатать большие из них.*/
        /*Scanner in = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            System.out.println("Введите первую пару чисел: ");
            int num1 = in.nextInt();
            System.out.println("Введите вторую пару чисел: ");
            int num2 = in.nextInt();
            if (num1 > num2){
                System.out.println("Большее число:" + num1);
            }else if(num1 < num2){
                System.out.println("Большее число:" + num2);
            }else
                System.out.println("Числа равны");

        }*/

//        8. Даны натуральные числа от 20 до 50.Напечатать те из них, которые делятся на 3, но не делятся на 5.
       /* Scanner in = new Scanner(System.in);
        for (int i = 20; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 != 0)
                System.out.println(i);*/


        /*9. даны натуральные числа от 35 до 87. Найти и напечатать те из них,
        которые при делении на 7 дают остаток 1, 2 или 5.*/

        /*for (int i = 35; i <= 87; i++) {
            if (i % 7 == 1 || i % 7 == 2 || i % 7 == 5)
                System.out.println(i);

        }*/

//        16. В бригаде, работающей на уборке сена, имеется N сенокосилок.Первая сенокосилка работала m часов,
//                а каждая следующая на 10 минут больше, чем предыдущая.Сколько часов проработала вся бригада?
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите количество сенокосилок ");
        int n = in.nextInt();
        System.out.println("Введите количество часов, кот работала 1 косилка ");
        int m = in.nextInt();
        int sum = 0;
        int workTimeInMin = m * 60;
        for (int i = 1; i <= n; i++) {
            sum += workTimeInMin;
            workTimeInMin += 10;
        }
        System.out.println("Время работы бригады " + sum / 60 + " часов" + sum % 60 + " минут");*/

        /*17. В ЭВМ вводятся по очереди данные о росте N учащихся класса. Определить средний рост учащихся класса.*/
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите количество учащихся: ");
        int n = in.nextInt();
        int sum = 0;
        for(int i =1; i <=n;i++){
            System.out.println("Введите рост учащихся ");
            int rost = in.nextInt();
            sum += rost;
        }
        System.out.println("Средний рост учащихся равен " + (double)sum/n);*/

//        18. Задано натуральное число N. Найти количество натуральных чисел,
//        не превосходящих N и не делящихся ни на одно из чисел 2,3,5.
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0){
                sum++;
                System.out.println("Число " + i);
            }
        }
        System.out.println("Количество натуральных чисел равно: " + sum);*/

//        19. Два двузначных числа, записанных одно за другим , образуют четырёхзначное число,
//        которое делится на их произведение. Найти эти числа.

     /*   for (int x = 10; x <= 99; x++) {
            for (int y = 10; y <= 99; y++) {
                int num = 100 * x + y;
                if (num % (x * y) == 0)
                    System.out.println(num);
            }
        }*/

//        21. Дано натуральное n. вычислить 1/(2 в квадрате) + 1/(4 в квадрате)+ ... + 1/(n в квадрате)
//        ( в квадрате только n)
       /* Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int n = in.nextInt();
        double sum = 0;
        for(long i = 2; i <=n;i+=2){
            sum += 1.0/(i*i);
        }
        System.out.println(sum);*/

//        28. Бизнессмен взял ссуду m тысяч рублей в банке под 20% годовых.
//           через сколько лет его долг превысит s тысяч рублей,
//           если за это время он не будет отдавать долг.
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите начальную ссуду: ");
        int nach_summa= in.nextInt();
        int proc = 20;
        System.out.println("Введите сумму гарантии: ");
        int s = in.nextInt();
        double dolg = nach_summa;
        int k = 0;
        while (dolg<=s){
            dolg= dolg*(1+proc/100.0);
            k++;
        }
        System.out.println("Через " + k + " лет");*/

//        29. с помощью оператора while напишите программу вывода всех четных чисел
//        в диапазоне от 2 до 100 включительно.

      /*  int i =2;
        while(i<=100){        *//*дописать*//*
            if(i%2 ==0)
                System.out.println(i);*/

        // Начальная дистанция 1 км. Каждую неделю дистанция растет на 10%.
        // Через сколько недель дистанция превысит 10 км?

        /*double dist = 1.0;
        int k = 0;
        while (dist <= 10.0001) {
            dist *= 1.1;
            k++;
        }
        System.out.println(k);*/

//        30. С помощью оператора while напишите программу определения суммы всех
//        нечетных чисел в диапазоне от 1 до 99 включительно.

        int i=1;
        int sum=0;
        while (i<99){
            sum+=i;
            i +=2;
        }
        System.out.println(sum);
    }
}

