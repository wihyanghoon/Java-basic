package static2;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("static call");
        DecoData.staticCall();

        DecoData data1 = new DecoData();
        data1.instanceCall();

        DecoData data2 = new DecoData();
        data2.instanceCall();
    }
}
