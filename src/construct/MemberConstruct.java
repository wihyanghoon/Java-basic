package construct;

public class MemberConstruct {
    String name;
    int age;
    int grad;

    //추가
    MemberConstruct(String name, int age) {
        this(name, age, 50);
    }

    MemberConstruct(String name, int age, int grad) {
        System.out.println("생성사 호출 name=" + name + ", age=" + age + ", grad=" + grad);
        this.name = name;
        this.age = age;
        this.grad = grad;
    }
}
