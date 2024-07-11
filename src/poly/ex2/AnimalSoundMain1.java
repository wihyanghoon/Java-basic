package poly.ex2;

public class AnimalSoundMain1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();

        sound(cat);
        sound(dog);
        sound(caw);
    }

    public static void sound(Animal animal) {
        animal.sound();
    }
}
