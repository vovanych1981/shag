package hw7;



import java.util.Scanner;

public class Task2 {

    //Proc18. ������� ������� CircleS(R) ������������� ����, ��������� ������� ����� ������� R
    //(R � ������������). � ������� ���� ������� ����� ������� ���� ������ � ������� ���������.
    //������� ����� ������� R ����������� �� ������� S = ?�R^2. � �������� �������� ? ������������ 3.14.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r;
        for (int i = 1; i < 4; i++) {
            System.out.println("������� ������ " + i + " �����");
            r = scan.nextDouble();
            System.out.println("������� ����� = " + circleS(r));
        }
    }

    static double circleS(double r) {
        final double pi = 3.14;
        return pi * (r * r);
    }
}








