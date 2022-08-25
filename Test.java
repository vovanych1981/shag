package KontrTest;

import java.util.Random;

public class Test {
    // Задание1

    public static void main(String[] args) {

        /*int arr[] = new int[10];
        int proisv = 1;
        Random rand = new Random();
        for(int i = 0; i<arr.length; i++){
            arr[i] = rand.nextInt(21);
            System.out.println(arr[i] + " ");
        }
        for(int i = 0; i<arr.length; i++){
            proisv *= arr[i];
        }
        System.out.println(proisv);*/

        // Задание2

        /*int arr[] = new int[8];
        int sum = 0;
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(21) - 10;
            System.out.println(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) sum += arr[i];

        }
        System.out.println(sum);*/

        // Задание3.

        /*int arr[] = new int[8];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(21);
            System.out.println(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 || arr[i] % 5 == 0) {
                System.out.print(arr[i] + " ");
            }
        }*/

        // Задание4.

        int arr[] = new int[9];
        int sum = 0;
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(21) - 10;
            System.out.println(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) sum += arr[i];

        }
        System.out.println("Сумма положительных элементов = " + sum);
    }
}
