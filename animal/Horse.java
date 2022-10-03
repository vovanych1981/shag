package hw.OOP.animal;

public class Horse extends Animal{
    private String weight;

    public Horse(String food, String location, String weight) {
        super(food, location);
        this.weight = weight;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("������ ���-��");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("������ ���");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "weight='" + weight + '\'' +
                '}';
    }
}
