package hw7;

import java.util.Scanner;

public class Task3 {

//    Proc 19. ������� ������� RingS(R1, R2) ������������� ����, ��������� ������� ������,
//    ������������ ����� ����� ������������ � ����� ������� � ��������� R1 � R2 (R1 � R2 � ������������, R_1 > R_2).
//    � �� ������� ����� ������� ���� �����, ��� ������� ���� ������� � ���������� �������.
//    ��������������� �������� ������� ����� ������� R: S = ?R2.
//    � �������� �������� ? ������������ 3.14.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.print("������� R1: ");
            double r1 = scan.nextDouble();
            System.out.print("������� R2, �� ������ ��� R1: ");
            double r2 = scan.nextDouble();
            System.out.println("������� " + i + " ������: " + ringS(r1,r2));
        }
    }

    static double ringS(double r1, double r2) {
        final double pi = 3.14;
        double s = pi * (r1 * r1 - r2 * r2);
        if(r1>r2){
            return s;
        }else
            return 0;

    }
}
