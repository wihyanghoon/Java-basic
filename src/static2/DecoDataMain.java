package static2;

// import static static2.DecoData.*;
// import static static2.DecoData.staticCall;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("static call");
        DecoData.staticCall();

        DecoData data1 = new DecoData();
        data1.instanceCall();

        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 추가
        DecoData data3 = new DecoData();
        // 인스턴스를 통한 접근
        data3.staticCall();
        // 클래스를 통한 접근
        DecoData.staticCall();
    }
}
