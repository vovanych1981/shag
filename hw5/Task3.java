package hw5;

import java.util.Scanner;

public class Task3 {

    //    3. ��������� ���������, ������� ��������� ������������ ����� �� 1 �� n.
//    n �������� � ����������.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� �����: ");
        int n = scanner.nextInt();
        int pr = 1;
        for (int i = 1; i <= n; i++) {
            pr *= i;
        }
        System.out.println("������������ ����� = " + pr);
    }

}
