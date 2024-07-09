package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; // 다른 패키지 이지만 상속관계 이기 때문에 사용가능

        publicMethod();
        protectedMethod();

        printParent();
    }
}
