package hw4;

import java.util.Scanner;

public class Task1 {

//    If8. ���� ��� �����. ������� ������� �������, � ����� ������� �� ���.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ��� �����: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println(a + " " + b);
        } else
            System.out.println(b + " " + a);
    }

}

