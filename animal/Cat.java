package hw.OOP.animal;

public class Cat extends Animal{
    private int age;

    public Cat(String food, String location, int age) {
        super(food, location);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Кошка мяукает");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Кошка ест");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }
}
