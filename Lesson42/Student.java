package Lesson42;

import java.util.Arrays;

public class Student {
    private char sex;      //пол
    private int age;       //возраст , от 15 до 65
    private int[] marks;   //4 оценки от 1 до 10
    private double avg;    //средний балл - высчитать на основе оценок

    public void setSex(char sex) {
        if (sex != 'm' && sex != 'f') {
            throw new IllegalArgumentException("Invalid sex");
        } else {
            this.sex = sex;
        }
    }

    public void setAge(int age) {
        if (age < 15 || age > 65) {
            throw new IllegalArgumentException("Invalid age");
        } else {
            this.age = age;
        }
    }

    public void setMarks(int[] marks) {
        for (int mark : marks) {
            if (mark < 1 && mark > 10) {
                throw new IllegalArgumentException("Invalid marks");
            }
        }
        this.marks = marks;
    }

    public void setAvg() {
        double sum = 0;
        for (int mark : marks) sum += mark;
        avg = sum / 4;
    }

    public Student(char sex, int age, int[] marks) {
        setSex(sex);
        setAge(age);
        setMarks(marks);
        setAvg();
    }

    @Override
    public String toString() {
        return "Student{" +
                "sex=" + sex +
                ", age=" + age +
                ", marks=" + Arrays.toString(marks) +
                ", avg=" + avg +
                '}';
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int[] getMarks() {
        return marks;
    }

    public double getAvg() {
        return avg;
    }

    public Student() {
    }
}
