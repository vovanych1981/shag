package hw5;

import java.util.Scanner;

public class Task4 {

//    4. � ���������� �������� n �����. ��������� ���������, ������� ���������� ���-�� �������������,
//    ���-�� ������������� � ���-�� ����� ����� �������� �����.�������� n �������� � ����������.

    public static void main(String[] args) {
        System.out.print("������� �������� n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum_otr = 0;
        int sum_pol = 0;
        int sum_nol = 0;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (x > 0) {
                sum_pol++;
            } else if (x < 0) {
                sum_otr++;
            } else {
                sum_nol++;
            }
        }
        System.out.println(sum_pol + " " + sum_otr + " " + sum_nol);
    }
}