package hw5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // 2. ��������� ���������, ������� ��������� ����� ����� �� 1 �� n.
        // �������� n �������� � ����������.
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� �����: ");

        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
