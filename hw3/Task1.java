package hw3;

import java.util.Scanner;

public class Task1 {

//    Boolean17. ���� ����� ������������� �����.
//    ��������� ���������� ������������: ������� ����� �������� �������� �����������.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� ������������� �����: ");
        int A = scanner.nextInt();

        boolean i = (A % 2 != 0) && (A >99 && A < 1000);
        System.out.println(i);
    }
}