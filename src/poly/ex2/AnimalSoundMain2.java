package poly.ex2;

public class AnimalSoundMain2 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal caw = new Caw();

        Animal[] animals = {cat, dog, caw};

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
