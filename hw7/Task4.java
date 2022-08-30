package hw7;

import java.util.Scanner;

public class Task4 {

//    Proc20. ������� ������� TriangleP(a, h), ��������� �������� ��������������� ������������
//    �� ��� ��������� a � ������ h, ����������� �    ��������� (a � h � ������������). � ������� ���� ������� �����
//    ��������� ���� �������������, ��� ������� ���� ��������� � ������.
//    ��� ���������� ������� ������� b ������������ ������������ �������
//    ��������: b2 = (a/2)2 + h2

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int i =1; i<4; i++){
            System.out.print("������� ��������� �: ");
            double a = scan.nextDouble();
            System.out.print("������� ������ h: ");
            double h = scan.nextDouble();
            System.out.println("�������� ������������ " + i + " = " + triangleP(a,h));
        }
    }
    static double triangleP(double a, double h) {
        double b = Math.sqrt((a/2)*2+(h*h));
        double perimeter = 2 * a + b;

        return perimeter;
    }
}

