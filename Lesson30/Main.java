package Lesson30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int choice;
        while (true) {
            printMenu();
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    addElem(lst);
                case 2:
                    removeElem(lst);
                case 3:
                    printElem(lst);
                case 4:
                    containsElem(lst);
                case 5:
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Неверный номер пункта меню");
            }

        }
    }

    static void printMenu() {
        System.out.println("1. Добавить элемент в список");
        System.out.println("2. Удалить элемент из списка");
        System.out.println("3. Показать содержимое списка");
        System.out.println("4. Проверить есть ли значение в списке");
        System.out.println("5. Заменить значение в списке");
        System.out.println("9. Выход");
        System.out.println("Введите номер нужного пункта");
    }

    static void addElem(List<String> lst) {
        if (lst != null) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите строку: ");
            String str = in.nextLine();
            lst.add(str);
        } else {
            System.out.println("Список пустой");
        }
    }


    static void removeElem(List<String> lst) {
        if (lst != null) {
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            if (str != null) {
                System.out.println(lst.remove(str));
            }

        } else {
            System.out.println("Список пустой");
        }
    }

    static void printElem(List<String> lst) {
        if (lst != null) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите строку: ");
            String str = in.nextLine();
            for (String s : lst) {
                System.out.println("Все элементы списка: " + s);
            }
        } else {
            System.out.println("Список пустой");
        }
    }

    static void containsElem(List<String> lst) {
        if (lst != null) {
            System.out.println("Список не пустой");
        } else {
            System.out.println("Список пустой");
        }

    }
}