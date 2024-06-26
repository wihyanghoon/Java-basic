package construct;

public class methodInitMain2 {
    public static void main(String[] args) {
        MemberInit member = new MemberInit();

        member.name = "wi hyanng hoon";
        member.age = 18;
        member.gread = 80;

        MemberInit member2 = new MemberInit();

        member2.name = "wi een kyung";
        member2.age = 18;
        member2.gread = 80;

        MemberInit[] members = {member, member2};

        for (MemberInit memberInit : members) {
            System.out.println(memberInit.name);
        }
    }
}
