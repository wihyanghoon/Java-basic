package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar car1 = new ElectricCar();
        car1.move();

        GasCar car2 = new GasCar();
        car2.move();
    }
}