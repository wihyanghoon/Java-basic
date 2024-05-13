package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 : dataA.value의 값 = " + dataA.value);
        onChange(dataA);
        System.out.println("메서드 호출 전 : dataA.value의 값 = " + dataA.value);
    }

    public static void onChange(Data dataX) {
        dataX.value = 20;
    }
}
