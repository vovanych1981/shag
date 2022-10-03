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
        System.out.println("������ �������");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("������ ���");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
