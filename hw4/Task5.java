package hw4;

import java.util.Scanner;

public class Task5 {

//    If21. ���� ������������� ���������� ����� �� ���������. ���� ����� ��������� � ������� ���������,
//    �� ������� 0. ���� ����� �� ��������� � ������� ���������, �� ����� �� ��� OX ��� OY, �� �������
//        �������������� 1 ��� 2. ���� ����� �� ����� �� ������������ ����, �� ������� 3.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ��� �����: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("����� ��������� � ������� ���������:" + 0);

        } else if (x == 0 && y != 0) {
            System.out.println("1");


        } else if (x != 0 && y == 0) {
            System.out.println("2");

        } else
            System.out.println("3");

    }
}
