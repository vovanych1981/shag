package hw4;

import java.util.Scanner;

public class Task7 {

//    If26. ��� ������� ������������� x ����� �������� ��������� ������� f,
//    ����������� ������������ ��������:
//            -x, ���� x <= 0,
//    f (x) = x^2, ���� 0 < x < 2,
//            4, ���� x >= 2.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �����: ");
        double x = scanner.nextDouble();
        double f;

        if (x <= 0) {
            System.out.println("f(x) = " + -x);
        } else if (0 < x & x < 2) {
            System.out.println("f(x) = " + Math.pow(x, 2));
        } else
            System.out.println("f(x) = " + 4);

    }
}
