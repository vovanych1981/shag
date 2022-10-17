package hw22;

import java.util.Scanner;

public class StringAbr {

    public static boolean isUpperLat(String str, int i) {
        return 'a' <= str.charAt(i) && str.charAt(i) <= 'z';
    }


    public static boolean isUpperRus(String str, int i) {
        return 'а' <= str.charAt(i) && str.charAt(i) <= 'я';
    }

    public static boolean isLower(String str, int i) {
        return 'A' <= str.charAt(i) && str.charAt(i) <= 'Z';
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
        //Scanner in = new Scanner(System.in);
        //System.out.println("Введите буквы на латинском и русском языках в разных регистрах");
        //System.out.println("Введите строку на латинском языке из ПРОПИСНЫХ букв без пробелов");
        //String str = in.nextLine();
        //System.out.println(taskString15(str));
        //System.out.println(taskString16(str));


        StringBuilder sb = new StringBuilder();     // еще решение Task16
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        for (int i = 0; i < str.length(); i++)
            if (isLower(str,i)) {
                int t = (int) (str.charAt(i)) + 32;
                sb.append((char) t);
            } else
                sb.append(str.charAt(i));

        System.out.println(sb);

    }
}
