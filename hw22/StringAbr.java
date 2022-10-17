package hw22;

import java.util.Scanner;

public class StringAbr {

    public static boolean isUpperLat(String str, int i) {
        return 'a' <= str.charAt(i) && str.charAt(i) <= 'z';
    }


    public static boolean isUpperRus(String str, int i) {
        return 'а' <= str.charAt(i) && str.charAt(i) <= 'я';
    }

    public static int taskString15(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isUpperLat(str, i) || isUpperRus(str, i)) {
                num++;
            }
        }
        return num;
    }

    //    String16. Дана строка. Преобразовать в ней все прописные латинские буквы в строчные.


    public static String taskString16(String str) {

        StringBuilder sb = new StringBuilder(str);
        int offset = 'A' - 'a';
        for (int i = 0; i < sb.length(); i++) {
            int c = sb.charAt(i) - offset;
            sb.setCharAt(i, (char) c);

        }
        return sb.toString();
    }


    public static void main(String[] args) {
//        String15. Дана строка. Подсчитать общее количество содержащихся в ней
//        строчных латинских и русских букв.
        Scanner in = new Scanner(System.in);
        //System.out.println("Введите буквы на латинском и русском языках в разных регистрах");
        System.out.println("Введите строку на латинском языке с ПРОПИСНЫХ букв без пробелов");
        String str = in.nextLine();
        //System.out.println(taskString15(str));
        System.out.println(taskString16(str));

    }
}
