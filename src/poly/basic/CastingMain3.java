package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {
       Child child = new Child();

       // 업 캐스팅은 생략가능, 생략을 권장한다.
       Parent parent1 = (Parent) child;
       Parent parent2 = child;

       parent1.parentMethod();
       parent2.parentMethod();
    }
}
