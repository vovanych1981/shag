package hw3;

import java.util.Scanner;

public class Task4 {

//    Boolean24. ���� ����� A, B, C (����� A �� ����� 0). ���������� ������������ D = B^2 � 4�A�C,
//    ��������� ���������� ������������: ����������� ������-��� A�x^2 + B�x + C = 0 ����� ������������ �����.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �����, ��� A != 0: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double d = Math.pow(b, 2) - 4 * a * c;
        System.out.println(d >= 0);


    }
}
