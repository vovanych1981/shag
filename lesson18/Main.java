package lesson18;

/*Создать класс Person, который содержит:

переменные fullName, age;
методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
Добавьте два конструктора  - Person() и Person(fullName, age).
Создайте два объекта этого класса. Один объект инициализируется конструктором Person(),
 другой - Person(fullName, age)*/

public class Main {
    public static void main(String[] args) {
        /*Person p = new Person();
        System.out.println(p);
        Person p1 = new Person("Вася", 30);
        System.out.println(p1);
        p1.move();*/
        Matrix a = new Matrix(2,2);
        a.fillMatrix(1);
        a.print();
        Matrix b = new Matrix(2,2);
        b.fillMatrix(2);
        b.print();
        Matrix c = a.addMatrix(b);
        c.print();
    }
}
