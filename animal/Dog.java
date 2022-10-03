package hw.OOP.animal;

public class Dog extends Animal{
    private String name;

    public Dog(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Собака гавкает");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Собака ест");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
