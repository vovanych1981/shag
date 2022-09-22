package lesson18;

public class Person {
    private String fullName;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    Person(){

    }
    Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

    public void move(){
        System.out.println(fullName + " идет");
    }
}
