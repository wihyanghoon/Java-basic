package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 30, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 28, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println(member.name + " " + member.age +  " " + member.grad);
        }
    }
}
