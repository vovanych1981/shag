package hw7;

import java.util.Scanner;

public class Task1 {

    //    Proc 17. ������� ������� RootsCount(A, B, C) ������ ����, ������������ ���������� ������ �����������
//    ��������� Ax2 + Bx + C = 0 (A, B, C � ������������ ���������, A != 0). � �� ������� ����� ���������� ������
//    ��� ������� �� ���� ���������� ��������� � ������� ��������������.
//    ���������� ������ ���������� �� �������� �������������: D = B2 � 4*A*C.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i < 4; i++) {
            System.out.print("������� �������� A > 0: ");
            double a = scan.nextDouble();
            System.out.print("������� �������� B: ");
            double b = scan.nextDouble();
            System.out.print("������� �������� C: ");
            double c = scan.nextDouble();
            System.out.println("���������� ������ " + i + " ��������� ����� " + rootsCount(a, b, c));
        }
    }

    static int rootsCount(double a, double b, double c) {

        double d = b * b - 4 * a * c;
        int result = 0;
        if (d < 0) result = 0;
        else if (d == 0) result = 1;
        else if (d > 0) result = 2;
        return (int)d;
    }
}
