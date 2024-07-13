package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(caw);
    }

    public static void soundAnimal(AbstractAnimal animal) {
        animal.sound();
    }

    public static void moveAnimal(AbstractAnimal animal) {
        animal.move();
    }
}
