package extends1.ex3;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar car1 = new ElectricCar();
        car1.move();
        car1.charge();
        car1.openDoor();

        GasCar car2 = new GasCar();
        car2.move();
        car2.fillUp();
        car2.openDoor();

        HydrogenCar car3 = new HydrogenCar();
        car3.move();
        car3.fillHydrogen();
        car3.openDoor();
    }
}
