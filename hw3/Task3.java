package hw3;

import java.util.Scanner;

public class Task3 {
//
//    Boolean21. ���� ����������� �����. ��������� ���������� ������������:
//            ������ ������� ����� �������� ������������ �������������������. (�� ����� � ��������!!!)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����������� �����: ");
        int number = scanner.nextInt();
        boolean i = ((number / 100) < (number % 100 / 10)) & ((number % 100 / 10) < (number % 10));
        System.out.println(i);

    }
}
