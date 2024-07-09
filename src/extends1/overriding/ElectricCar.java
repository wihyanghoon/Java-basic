package extends1.overriding;

public class ElectricCar extends Car {
    public void charge() {
        System.out.println("전기를 충전 합니다.");
    }

    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }
}
