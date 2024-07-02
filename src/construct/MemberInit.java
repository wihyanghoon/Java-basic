package construct;

public class MemberInit {
    String name;
    int age;
    int grad;

    //추가
    void InitMember (MemberInit member, String name, int age, int grad) {
        this.name = name;
        this.age = age;
        this.grad = grad;
    }
}
