package hw6;

import java.util.Scanner;

public class Task4 {
//    Array23. ��� ������ ������� N � ����� ����� K � L (1 < K ? L ? N).
//    ����� ������� �������������� ���� ��������� �������, ����� ���������
//    � �������� �� K �� L ������������.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("����� N = ");
        int n = sc.nextInt();
        System.out.print("����� K = ");
        int k = sc.nextInt();
        System.out.print("����� L = ");
        int l = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < k - 1; i++) {
            sum += array[i];
        }
        System.out.println("������ ����� = " + sum);

        int sum1 = 0;
        for (int i = l; i < n; i++) {
            sum1 += array[i];
        }
        System.out.println("������ ����� = " + sum1);
        int sred_arifm = (sum + sum1) / (n - ((l - k) + 1));

        System.out.println("�������������������� ���� ��������� ����� �� K �� L ������������ =  " + sred_arifm);
    }
}
