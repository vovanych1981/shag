package hw.OOP.animal;

import java.util.Arrays;

public class Veterinar {
    public void treatAnimal(Animal animal) {
        System.out.println(new StringBuilder().
                append("Food - ").append(animal.getFood()).append(", location - ").
                append(animal.getLocation()).toString());
    }

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        Cat cat = new Cat("рыба", "кухня", 2);
        Dog dog = new Dog("кость", "будка", "Шарик");
        Horse horse = new Horse("сено", "хлев", "200 кг");

        animals[0] = cat;
        animals[1] = dog;
        animals[2] = horse;

        Veterinar veterinar = new Veterinar();

        for (Animal animal : animals) {
            veterinar.treatAnimal(animal);
        }
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(horse);
    }

}
