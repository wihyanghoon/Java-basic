package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.methodDiamond();

        InterfaceB b = new Child();
        b.methodB();
        b.methodB();
    }
}
