package construct;

public class MemberInit {
    String name;
    int age;
    int gread;

    //추가
    void InitMember (MemberInit member, String name, int age, int gread) {
        this.name = name;
        this.age = age;
        this.gread = gread;
    }
}
