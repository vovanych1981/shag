package hw4;

import java.util.Scanner;

public class Task2 {

//    If10. ���� ��� ���������� ������ ����: A � B. ���� �� �������� �� �����, �� ���������
//    ������ ���������� ����� ���� ��������, � ���� �����, �� ��������� ���������� ������� ��������.
//    ������� ����� �������� ���������� A � B.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ��� ����� �����: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a != b) {
            a = a + b;
            b = a;
            System.out.println("a: " + a + " " + "b: " + b);
        } else {
            a = 0;
            b = 0;
            System.out.println(a + " " + b);
        }
    }
}
