package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // 해당 라인에서 애러 발생하여 아래 라인 실행 안됨
        System.out.println("data = " + data.value);
    }
}
