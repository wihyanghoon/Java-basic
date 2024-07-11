package poly.basic;

public class BasicMain {
    public static void main(String[] args) {

        System.out.println("parent => parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("child => child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        System.out.println("Parent => child");
        Parent poly = new Child();
        poly.parentMethod();
    }
}
