package access.b;

//import access.a.DefaultClass;
//import access.a.DefaultClass2;
import access.a.PublicCalss;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicCalss publicCalss = new PublicCalss();


        //default 레벨의 클래스이기 때문에 다른 패키지에서 호출 할 수 없음
        //DefaultClass defaultClass = new DefaultClass();
        //DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}
