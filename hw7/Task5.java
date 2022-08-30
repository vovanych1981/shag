package hw7;

import java.util.Scanner;

public class Task5 {

    //    Proc21? ������� ������� SumRange(A, B) ������ ����, ��������� �����
//    ���� ����� ����� �� A �� B ������������ (A � B � �����). ���� A > B,
//    �� ������� ���������� 0. � ������� ���� ������� ����� ����� �����
//    �� A �� B � �� B �� C, ���� ���� ����� A, B, C.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("������� ����� ����� A: ");
        int a = scan.nextInt();
        System.out.print("������� ����� ����� B: ");
        int b = scan.nextInt();
        System.out.print("������� ����� ����� C: ");
        int c = scan.nextInt();
        System.out.println("����� ����� �� A �� B: " + sumRange(a, b));
        System.out.println("����� ����� �� B �� C: " + sumRange(b, c));

    }

    static int sumRange(int a, int b) {
        if (a > b) return 0;
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }
}
