package hw6;

import java.util.Scanner;

public class Task3 {

//    Array21. ��� ������ ������� N � ����� ����� K � L (1 ? K ? L ? N).
//    ����� ������� �������������� ��������� ������� � �������� �� K �� L
//    ������������.

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
        for (int i = k; i <=l; i++) {
            sum += array[i];
        }
        System.out.println("�������������������� ��������� ������� �� K �� L �����: " + ((sum)/(l-k+1)));
    }
}
