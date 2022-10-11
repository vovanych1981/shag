import java.io.IOException;

public class lesson23 {
    public static void main(String[] args) throws IOException {


//    Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.

        //String str = "I like Java!!!";
//    Распечатать последний символ строки. Используем метод String.charAt().
        //System.out.println(str.charAt(str.length() - 1));
//    Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
        //System.out.println(str.endsWith("!!!"));
//    Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
        //System.out.println(str.startsWith("I like"));
//    Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        //System.out.println(str.concat("Java"));
//    Найти позицию подстроки “Java” в строке “I like Java!!!”.
        //System.out.println(str.indexOf("Java"));
//    Заменить все символы “а” на “о”.
        // System.out.println(str.replace('a', 'o'));
//    Преобразуйте строку к верхнему регистру.
        //System.out.println(str.toLowerCase(Locale.ENGLISH));
//    Преобразуйте строку к нижнему регистру.
        // System.out.println(str.toUpperCase(Locale.ENGLISH));
//    Вырезать строку Java c помощью метода String.substring().
        //int startIndex, endIndex;
        //System.out.println(str.substring(str.indexOf("I like"),str.indexOf("I like") +  "I like".length()));


//        Дано два числа, например 3 и 56, необходимо составить следующие строки:
//        3 + 56 = 59
//        3 – 56 = -53
//        3 * 56 = 168.
//        Используем метод StringBuilder.append().
//        Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
//        Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

        /*Integer x, y;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String str = buf.readLine();
        x = Integer.parseInt(str);
        str = buf.readLine();
        y = Integer.parseInt(str);
        Integer res = x + y;
        StringBuilder sb = new StringBuilder(x.toString());
        sb.append(" + ");
        sb.append(y.toString());
        sb.append(" = ");
        sb.append(res.toString());

        Integer res1 = x - y;
        StringBuilder sb1 = new StringBuilder(x.toString());
        sb1.append(" - ");
        sb1.append(y.toString());
        sb1.append(" = ");
        sb1.append(res1.toString());

        Integer res2 = x * y;
        StringBuilder sb2 = new StringBuilder(x.toString());
        sb2.append(" * ");
        sb2.append(y.toString());
        sb2.append(" = ");
        sb2.append(res2.toString());
        //System.out.println(sb1);
        sb2.insert((sb2.indexOf(" = ")), " равно");
        sb2.deleteCharAt(sb2.indexOf("="));
        System.out.println(sb2);

        sb2.replace(sb2.indexOf("равно"), sb2.indexOf(" 168"), "=");
        System.out.println(sb2);*/

//        Напишите метод, заменяющий в строке каждое (второе) вхождение «object-oriented programming»
//        (не учитываем регистр символов) на «OOP». Например, строка "Object-oriented programming is a programming
//         language model organized around objects rather than "actions" and data rather than logic.
//         "Object-oriented programming blabla. Object-oriented programming bla."
//        должна быть преобразована в"Object-oriented programming is a programming language model organized around
//        objects rather than "actions" and data rather than logic. OOP blabla. Object-oriented programming bla."

        String text = "Object-oriented programming is a programming language model organized around objects " +
                "rather than actions and data rather than logic. " +
            "Object-oriented programming blabla. Object-oriented programming bla.";

        String newText = "Object-oriented programming";
        text = text.replaceAll(newText, "OOP");
        System.out.println(text);


//        4. Найти два средних знака строки
//        Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака.
//        Например, если дана строка "string"  результат будет "ri", для строки "code" результат "od",
//        для "Practice" результат "ct".
        String [] words = {"string", "code", "Practice"};
        for(String word:words){
            System.out.println(word.toString().length()/2 + 1);
        }



    }

}
