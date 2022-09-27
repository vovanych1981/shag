package lesson19;

public class Main {
    public static void main(String[] args) {
        final int size = 2;
        Student[] mas = new Student[size];
        Student s1 = new Student("Иван", "Иванов", 2121, 4.5);
        Aspirant a1 = new Aspirant("Петр", "Петров", 21, 5.0);
        mas[0] = s1;
        mas[1] = a1;
        Student q1 = new Aspirant("Игорь", "Бычков", 22, 4.0);
        System.out.println(q1.getScholarship());
        for(Student s:mas){
            System.out.print(s);
            System.out.println("grant = " + s.getScholarship());
        }
    }
}
