package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);
    }

    public static void soundAnimal(InterfaceAnimal animal) {
        animal.sound();
    }
}
