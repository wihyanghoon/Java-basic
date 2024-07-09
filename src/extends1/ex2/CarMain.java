package extends1.ex2;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar car1 = new ElectricCar();
        car1.move();
        car1.charge();

        GasCar car2 = new GasCar();
        car2.move();
        car2.fillUp();
    }
}
