package hw2;

import java.util.Scanner;

public class Task2 {

//    Integer16. ���� ����������� �����. ������� �����, ���������� ��� ������������
//    ���� �������� � ������ ��������� ����� (��������, 123 ��������  � 132).

    public static void main(String[] args) {
        System.out.println("������� ����������� �����: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sotni = number / 100;
        int des = (number / 10) % 10;
        int ed = number % 10;
        int new_number = sotni * 100 + ed * 10 + des;
        System.out.println(new_number);
    }
}
