package hw3;

import java.util.Scanner;

public class Task2 {

//    Boolean19. ��������� ���������� ������������: ������ ���� ������ �����
//    ����� ���� ���� �� ���� ���� ������� ����������������.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean protivop = ((a == (-1) * b) | (a == (-1) * c) | (a == (-1) * c));
        System.out.println(protivop);
    }
}
