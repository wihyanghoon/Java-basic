package construct;

public class methodInitMain3 {
    public static void main(String[] args) {
        MemberInit member = new MemberInit();
        MemberInit member2 = new MemberInit();
        member.InitMember(member, "wi", 30, 80);
        member2.InitMember(member2, "hoon", 30, 80);

        MemberInit[] members = {member, member2};
        for (MemberInit memberInit : members) {
            System.out.println(memberInit.name);
        }
    }
}
