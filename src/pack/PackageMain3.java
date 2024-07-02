package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        // 같은 이름의 클래스를 사용 할 경우 자주 사용하는것을 import 시켜 사용함.
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
