package construct;

public class methodInitMain2 {
    public static void main(String[] args) {
        MemberInit member = new MemberInit();
        MemberInit member2 = new MemberInit();
        InitMember(member, "wi", 30, 80);
        InitMember(member2, "hoon", 30, 80);

        MemberInit[] members = {member, member2};
        for (MemberInit memberInit : members) {
            System.out.println(memberInit.name);
        }
    }

    static void InitMember (MemberInit member, String name, int age, int grad) {
        member.name = name;
        member.age = age;
        member.grad = grad;
    }
}
