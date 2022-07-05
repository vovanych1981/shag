package lesson3;

import java.util.Scanner;

// Кондратенко В.И.
public class main {
    public static void main(String[] args) {

//  Boolean1◦
//. Дано целое число A. Проверить истинность высказывания: «Число A является положительным»
//        Scanner in = new Scanner(System.in);
//        int A = in.nextInt();
//        boolean res = A > 0;
//        System.out.println(res);

//        Boolean2◦
//. Дано целое число A. Проверить истинность высказывания: «Число A является нечетным».
//        Scanner in = new Scanner(System.in);
//        int A = in.nextInt();
//        boolean res = A % 2 != 0;
//        System.out.println(res);

//        Boolean3◦
//. Дано целое число A. Проверить истинность высказывания: «Число A является четным».
//        Scanner in = new Scanner(System.in);
//        int A = in.nextInt();
//        boolean res = A % 2 == 0;
//        System.out.println(res);

//        Boolean4◦
//. Даны два целых числа: A, B. Проверить истинность высказывания:
//«Справедливы неравенства A > 2 и B ≤ 3».
//        Scanner in = new Scanner(System.in);
//        int A = in.nextInt();
//        int B = in.nextInt();
//        boolean res = A > 2 && B <= 3;
//        System.out.println(res);

//        Boolean5◦
//. Даны два целых числа: A, B. Проверить истинность высказывания:
//«Справедливы неравенства A ≥ 0 или B < −2».
//        Scanner in = new Scanner(System.in);
//        int A = in.nextInt();
//        int B = in.nextInt();
//        boolean res = A >= 0 || B < -2;
//        System.out.println(res);
//
//        Boolean6◦
//. Даны три целых числа: A, B, C. Проверить истинность высказывания:
// «Справедливо двойное неравенство A < B < C».
//        Scanner in = new Scanner(System.in);
//        int A = in.nextInt();
//        int B = in.nextInt();
//        int C = in.nextInt();
//        boolean res = A < B && B < C;
//        System.out.println(res);
//
//        Boolean7◦
//. Даны три целых числа: A, B, C. Проверить истинность высказывания: «Число B находится между числами A и C».
//        Scanner in = new Scanner(System.in);
//        int A = in.nextInt();
//        int B = in.nextInt();
//        int C = in.nextInt();
//        boolean res = (A < B && B < C) || (C < B && B < A);
//        System.out.println(res);

//        Boolean8◦
//. Даны два целых числа: A, B. Проверить истинность высказывания:
//«Каждое из чисел A и B нечетное».

//        Scanner in = new Scanner(System.in);
//        int A = in.nextInt();
//        int B = in.nextInt();
//        boolean res = A % 2 != 0 && B % 2 != 0;
//        System.out.println(res);

//        Boolean9◦
//. Даны два целых числа: A, B. Проверить истинность высказывания:
//«Хотя бы одно из чисел A и B нечетное».
//        Scanner in = new Scanner(System.in);
//        int A = in.nextInt();
//        int B = in.nextInt();
//        boolean res = A % 2 != 0 || B % 2 != 0;
//        System.out.println(res);

//        Boolean10◦
//. Даны два целых числа: A, B. Проверить истинность высказывания:
// «Ровно одно из чисел A и B нечетное».
//        Scanner in = new Scanner(System.in);
//        int A = in.nextInt();
//        int B = in.nextInt();
//        boolean res = (A % 2 != 0 && B % 2 == 0) || (A % 2 == 0 && B % 2 != 0);
        // A % 2 != 0 ^ B % 2 != 0
//        System.out.println(res);

//        Boolean11◦
//. Даны два целых числа: A, B. Проверить истинность высказывания:
// «Числа A и B имеют одинаковую четность»
//        Scanner in = new Scanner(System.in);
//        int A = in.nextInt();
//        int B = in.nextInt();
//        boolean res =  (A % 2 != 0 && B % 2 != 0) || (A % 2 == 0 && B % 2 == 0);
        // A % 2 == B % 2
//        System.out.println(res);

//        Boolean12◦
//. Даны три целых числа: A, B, C. Проверить истинность высказывания:
// «Каждое из чисел A, B, C положительное».
//        Scanner in = new Scanner(System.in);
//        int A = in.nextInt();
//        int B = in.nextInt();
//        int C = in.nextInt();
//        boolean res = A > 0 && B > 0 && C > 0;
//        System.out.println(res);

//        Boolean13◦
//. Даны три целых числа: A, B, C. Проверить истинность высказывания:
// «Хотя бы одно из чисел A, B, C положительное»
//        Scanner in = new Scanner(System.in);
//        int A = in.nextInt();
//        int B = in.nextInt();
//        int C = in.nextInt();
//        boolean res = A > 0 || B > 0 || C > 0;
//        System.out.println(res);

//        Boolean14◦
//. Даны три целых числа: A, B, C. Проверить истинность высказывания:
// «Ровно одно из чисел A, B, C положительное».
//        Scanner in = new Scanner(System.in);
//        int A = in.nextInt();
//        int B = in.nextInt();
//        int C = in.nextInt();
//        boolean res = A > 0 ^ B > 0 ^ C > 0;
//        System.out.println(res);

//        Boolean15◦
//. Даны три целых числа: A, B, C. Проверить истинность высказывания:
//«Ровно два из чисел A, B, C являются положительными».

//        Scanner in = new Scanner(System.in);
//        int A = in.nextInt();
//        int B = in.nextInt();
//        int C = in.nextInt();
//        boolean res = (A > 0 && B > 0 && C < 0) || (A < 0 && B > 0 && C < 0) ||
//                (A > 0 && B < 0 && C > 0);
//        System.out.println(res);

//        Boolean16◦
//. Дано целое положительное число. Проверить истинность высказывания:
// «Данное число является четным двузначным».
//        Scanner in = new Scanner(System.in);
//        int A = in.nextInt();
////        четное и двузначное
//        boolean res = (A % 2 == 0) && (A >= 10 && A <= 99);
//        System.out.println(res);

//        Boolean18◦. Проверить истинность высказывания:
//«Среди трех данных целых  чисел есть хотя бы одна пара совпадающих».
//        Scanner in = new Scanner(System.in);
//        int A = in.nextInt();
//        int B = in.nextInt();
//        int C = in.nextInt();
//        boolean res = (A == B) || (B == C) || (A == C);
//        System.out.println(res);

//        Boolean19◦
//. Проверить истинность высказывания: «Среди трех данных целых
//        чисел есть хотя бы одна пара взаимно противоположных».
//        Scanner in = new Scanner(System.in);
//        int A = in.nextInt();
//        int B = in.nextInt();
//        int C = in.nextInt();
//        boolean res = (A == B) || (B == C) || (A == C);
//        System.out.println(res);
//        a == -b

//        Boolean20◦
//. Дано трехзначное число. Проверить истинность высказывания:
//«Все цифры данного числа различны».
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int sotni = A / 100;
        int des = (A/100)% 10;
        int ed = A % 10;
        boolean res = (sotni != des) && (des != ed) && (sotni != ed);
        System.out.println(res);

        





//

    }
}
