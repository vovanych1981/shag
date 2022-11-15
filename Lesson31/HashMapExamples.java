package Lesson31;

import java.util.*;

public class HashMapExamples {
    public static void main(String[] args) {
        /*Map<Integer,String>studLst = new HashMap<>();

        studLst.put(1, "Алисионок Екатерина");
        studLst.put(3, "Козловский Константин");
        studLst.put(5, "Красько Денис");
        studLst.put(2, "Калацкий Павел");
        studLst.put(4, "Кондратенко Владимир");

        for (Integer key:studLst.keySet()){
            System.out.println(key + " " + studLst.get(key));
        }*/

        // Картотека котов "кличка-вес"

        /*Map<String, Integer> catsCabinet = new HashMap<>();
        // final int catsQty = 10;
        Random gen = new Random();
        String[] catNames = {"Васька", "Мурзик", "Барсик", "Борис", "Кеша", "Бадя", "Мурка"};
        for (int i = 0; i < catNames.length; i++) {
            Integer catRandomIndex = gen.nextInt(catNames.length);
            String catName = catNames[catRandomIndex];
            Integer weight = gen.nextInt(10) + 1;
            System.out.println(catName + " " + weight);
            catsCabinet.put(catName, weight);
        }
        System.out.println("Картотека");
        for (String key : catsCabinet.keySet()) {
            System.out.println(key + " " + catsCabinet.get(key));
        }
        if(catsCabinet.containsValue(5)){
            for(Map.Entry<String, Integer> pair: catsCabinet.entrySet()){
                if(pair.getValue().equals(5)){
                    System.out.println(pair.getKey());
                }
            }
        }
        else{
            System.out.println("Нет таких котов");
        }*/
        /*String str = "Моя мама – самый дорогой человек для меня. Я её очень люблю. Люблю не за что-то, а просто так, " +
                "просто за то, что она у меня есть. Я очень горжусь и дорожу своей мамой. Ближе неё у меня никого нет. " +
                "Мою маму зовут Татьяна Николаевна. Она красивая. Люблю мамину улыбку и большие зелёные глаза, которые " +
                "сверкают озорными огоньками, задорный смех и её руки, заботливые, тёплые, дорогие мне две ладошки." +
                " Моя мама очень добрая, хорошо ладит с людьми, все её уважают и любят. Она умеет поддержать в трудную" +
                " минуту и согреть своей теплотой, когда иногда мне бывает грустно и горько. Мама заботится о нас с " +
                "братом с самого рождения, дарит нам свою доброту, заботу, нежность и материнскую любовь. ";
        String[] words = str.split("\\\\s|,|!|;|-|.\\\\");
        Map<String, Integer> dict = new HashMap<>();
        for (String word : words) {
            if (dict.containsKey(word)) {
                dict.put(word, dict.get(word) + 1);
            } else {
                dict.put(word, 1);
            }
        }
        System.out.println("Словарь");
        for (String key : dict.keySet()) {
            System.out.println(key + " " + dict.get(key));

        }*/
        Map<Person, List<? extends Pet>>hm1 = new HashMap<>();
        hm1.put(new Person("Иван"), Arrays.asList(new Cat("Васька"), new Dog("Бобик")));

    }
}
