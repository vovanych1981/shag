package hw4;

import java.util.Scanner;

public class Task4 {
    //    If20. �� �������� ��� ����������� ��� �����: A, B, C. ����������, ����� �� ���� ��������� ����� (B ��� C)
//    ����������� ����� � A, � ������� ��� ����� � �� ���������� �� ����� A.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ��� �����: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((Math.abs(a - b)) < (Math.abs(a - c))) {
            System.out.println("����� ��������� ����� b: " + b + ", � ��� ��������� �� ����������: "
                    + Math.abs(a - b));
        } else
            System.out.println("����� ��������� ����� c: " + c + ", � ��� ��������� �� ����������: "
                    + Math.abs(a - c));


    }
}