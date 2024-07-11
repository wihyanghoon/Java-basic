package poly.ex2;

public class AnimalSoundMain3 {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog(), new Caw()};

        for (Animal animal : animals) {
            staticSound(animal);
        }
    }

    public static void staticSound (Animal animal) {
        animal.sound();
    }
}
